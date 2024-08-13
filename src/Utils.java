import java.io.IOException;

public class Utils {
    public Utils(){}

    public void escritaLayouts(String[] lista){
        for(int i=0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
    }

    public void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

}

