public class Venda implements Menu {

    @Override
    public void displayMenuOptions() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do cliente:\n");
        sb.append("2 - GERENCIAMENTO DE ESTOQUE\n");
        sb.append("3 - FLUXO DE CAIXA\n\n");
        DisplayUtils.escritaLayoutComCabecalhoConteudoEOpcaoDeUsuario(sb);
    }
}
