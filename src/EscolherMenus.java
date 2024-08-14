import java.util.Scanner;

public class EscolherMenus{
    public EscolherMenus(){}

    public void escolherMenus(){
        LayoutMenus menu = new LayoutMenus();
        Scanner input = new Scanner(System.in);
        Venda venda = new Venda();
        FluxoCaixa fluxoCaixa = new FluxoCaixa();
        GerenciamentoEstoque estoque = new GerenciamentoEstoque();
        
        menu.menuPrincipal();
        var opcao = input.nextInt();
        input.close();

        switch (opcao) {
            case 1:
                venda.venda();
                break;
            
            case 2: 
                fluxoCaixa.fluxoCaixa();
                break; 
            
            case 3: 
                estoque.estoque();
                break;

            default:
                System.out.println("DIGITE UMA OPÇÃO VALIDA");
                break;
        }
    }
}