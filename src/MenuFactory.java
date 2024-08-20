public class MenuFactory {
    public static Menu getMenuViaOpcaoUsuario(int opcaoUsuario) {
        Menu m = null;
        switch (opcaoUsuario) {
            case 1:
                m = new Venda();
                break;
            case 2:
                m = new GerenciamentoEstoque();
                break;
            case 3:
                m = new FluxoCaixa();
                break;
            default:
                m = new EntradaMenuNaoEncontrada();
                break;
        }

        return m;
    }
}