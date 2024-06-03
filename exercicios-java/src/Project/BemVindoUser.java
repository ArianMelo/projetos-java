package Project;

import java.util.Scanner;

public class BemVindoUser {
    public static void main(String[] args) {
        // INPUT: CRIE UM INPUT PARA ESCREVER O NOME DO USUARIO
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o seu nome");

        // VAR: GUARDE O VALOR EM UMA VARIAVEL
        String userName = input.nextLine();
        // PRINT: APRESENTE O NOME BOAS VINDAS: E O NOME DO USUARIO EM SEGUIDA.
        System.out.println("Boas vindas: "+ userName);
    }
}
