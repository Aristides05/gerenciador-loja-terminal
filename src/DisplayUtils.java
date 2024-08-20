import java.io.IOException;

public class DisplayUtils {
    private DisplayUtils() {}

    public static void escritaLayouts(String[] linhas){
        for(int i = 0; i < linhas.length; i++){
            DisplayUtils.escritaLayouts(linhas[i]);
        }
    }

    public static void escritaLayouts(StringBuilder sb){
        DisplayUtils.escritaLayouts(sb.toString());
    }

    public static void escritaLayouts(String linha){
        System.out.println(linha);
    }

    public static String getCabecalhoSistemaGerenciamentoDeVendas() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------------\n");
        sb.append("SISTEMA DE GERENCIAMENTO DE VENDAS\n");
        sb.append("-----------------------------------\n");
        return sb.toString();
    }

    public static String getTextoEscolhaOpcao() {
        return "ESCOLHA A OPÇÃO QUE DESEJA REALIZAR -> ";
    }

    public static void escritaLayoutComCabecalhoConteudoEOpcaoDeUsuario(StringBuilder conteudo) {
        DisplayUtils.escritaLayoutComCabecalhoConteudoEOpcaoDeUsuario(conteudo.toString());
    }

    public static void escritaLayoutComCabecalhoConteudoEOpcaoDeUsuario(String conteudo) {
        DisplayUtils.escritaLayouts(DisplayUtils.getCabecalhoSistemaGerenciamentoDeVendas() + conteudo + DisplayUtils.getTextoEscolhaOpcao());
    }

    public static void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

}
