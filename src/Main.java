import Metodos.Aniversario;
import Metodos.Reveillon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolha;

        System.out.println("Escolha uma das opções:");
        System.out.println("Final do ano = 1");
        System.out.println("Data especifica = 2");
        escolha = scan.nextInt();

        if (escolha == 1) {
            Reveillon texto = new Reveillon();
            texto.reveillon();
        } else if (escolha == 2) {
            Aniversario texto = new Aniversario();
            texto.aniversario();
        } else {
            System.out.println("Erro no valor inserido.");
        }
    }
}
