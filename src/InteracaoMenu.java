import java.util.Scanner;

public class InteracaoMenu {

    public void escolherMenus() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.displayMenuOptions();

        int opcao = new InteracaoMenu().getIntFromUserInput();

        Menu menuFromUserOption = MenuFactory.getMenuViaOpcaoUsuario(opcao);
        menuFromUserOption.displayMenuOptions();
    }

    private int getIntFromUserInput() {
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();
        input.close();
        return opcao;
    }
}