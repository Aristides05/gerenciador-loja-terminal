public class LayoutMenus {
    public LayoutMenus(){}

    Utils util = new Utils(); 

    public void menuPrincipal(){
        String[] menuPrincipal = {"-----------------------------------", 
                                  "SISTEMA DE GERENCIAMENTO DE VENDAS",
                                  "-----------------------------------",
                                  
                                  "1 - REALIZAR VENDA",
                                  "2 - GERENCIAMENTO DE ESTOQUE",
                                  "3 - FLUXO DE CAIXA",
                                  
                                  "ESCOLHA A OPÇÃO QUE DESEJA REALIZAR -> "};

        util.escritaLayouts(menuPrincipal);
    }
    
    public void menuVendas(){
        String[] menuVendas = {"-----------------------------------", 
                                  "SISTEMA DE GERENCIAMENTO DE VENDAS",
                                  "-----------------------------------",
                                  "\n",
                                  "Nome do cliente:",
                                  "2 - GERENCIAMENTO DE ESTOQUE",
                                  "3 - FLUXO DE CAIXA",
                                  "\n",
                                  "ESCOLHA A OPÇÃO QUE DESEJA REALIZAR -> "};

        util.escritaLayouts(menuVendas);
    }

    public void menuEstoque(){
        System.out.println("menu estoque");
    }

    public void menuLancarEstoque(){

    }

    public void menuVisualizarEstoque(){

    }

    public void fluxoCaixa(){
        System.out.println("menu estoque");
    }
}
