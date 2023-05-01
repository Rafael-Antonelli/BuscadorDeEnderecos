import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private Scanner leitorCep = new Scanner(System.in);
    private String cep;

    public Menu() {
    }

    public void getMenu() {
        System.out.println("*************************************************");
        System.out.println("** Bem vindo ao sistema de busca de endereços. **");
        System.out.println("*************************************************");
        System.out.println("");
        System.out.println("Digite a opção desejada:");
        System.out.println("");
        System.out.println("1 - Nova busca");
        System.out.println("2 - Sair");
    }

    public void getMenuCep() {
        System.out.println("");
        System.out.println("Digite o CEP para pesquisa :");
        cep = leitorCep.nextLine();
    }

    public String getCep() {
        return cep;
    }

    public void validaOpcao(int opcao) {
        if (opcao < 1 || opcao > 2) {
            System.out.println("");
            System.out.println("******************************");
            System.out.println("Favor digitar uma opção válida");
            System.out.println("******************************");
            System.out.println("");

        }

        if (opcao == 2) {
            System.out.println("");
            System.out.println("************************************");
            System.out.println("Obrigado por utilizar nosso sistema.");
            System.out.println("************************************");
            System.out.println("");
        }
        if (opcao == 1) {
            getMenuCep();
        }




    }


}
