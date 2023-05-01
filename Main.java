
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitorOpcao = new Scanner(System.in);
        Menu menu = new Menu();
        MotorDeBusca busca = new MotorDeBusca();
        int opcao = 0;

        while (opcao != 2) {
            menu.getMenu();
            opcao = (int) leitorOpcao.nextInt();
            menu.validaOpcao(opcao);
            if (opcao == 1) {
                busca.setCep(menu.getCep());
                busca.getLocalidade();
            }
        }
    }
}