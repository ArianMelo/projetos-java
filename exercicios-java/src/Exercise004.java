
    // 16. WHILE LOOP
    // 17. FOR LOOP
    // 18. BREAK/CONTINUE
    // 19. ARRAYS

public class Exercise004 {
    public static void main(String[] args) {

        // 16. WHILE LOOP
        System.out.println("16. WHILE LOOP");
        System.out.println("Loops: executam bloco de código com condição específica atingida.");
        System.out.println("Loops: economizam tempo, reduzem erros e tornam o código mais legível.");
        System.out.println("Loops: percorre um bloco desde que a condição seja \"true\".");
        // O while vai repetir o código até alcançar o valor limitante;
        /*Caso não possua um valor limitante ou sinal seja contrário ao
          caminho do limite, o valor será loopado infinitamente.*/

        /*  Estrutura do While:
        *
        *   While (condition) {
        *       Bloco a ser executado
        *   }
        */

        int whileVal1 = 5;
        while (whileVal1 >= -5) {
            System.out.println(whileVal1);
            whileVal1--;
        }
        System.out.println("-------------------------");

        // 16.1 DO/WHILE LOOP
        System.out.println("16.1 DO/WHILE LOOP");
        System.out.println("Do While Loop: é uma variante do while loop.");
        System.out.println("Do While Loop: executa o bloco uma vez, antes de verificar a condição;");

        /* Estrutura Do...While:
        *
        *   do {
        *       // Bloco de código a ser executado
        *   }
        *   while (condition);
        * */

        int doWhileVal1 = 1; // Valor inicial
        do {
            System.out.println(doWhileVal1*10); // Bloco de código a ser validado.
            doWhileVal1++;
        }
        while (doWhileVal1 <= 5); // (condition);
        System.out.println("-------------------------");

        // 16.2 WHILE: EXERCISE

        // Contagem regressiva
        int contRegre1 = 10;
        while (contRegre1 >= 0) {
            System.out.println(contRegre1);
            contRegre1--;
        }
        System.out.println(" ");

        System.out.println("Contagem regressiva");

        /*
        *  Contagem regressiva com Feliz Ano Novo:
        *  ---------------------------------------
        *  Leitura do código:
        *  - Faça o valor anoNovo ser reduzido de 10 até 1 segundo;
        *  - Enquanto o valor estiver acima de 0 a contagem continuará;
        *  - Se o valor estiver acima de 0, anoNovo será exibido numericamente;
        *  - Então, quando alcançar valor menor que 0, exibirá "Feliz ano Novo";
        */
        int anoNovo = 10;
        do {
            System.out.print(anoNovo+" ,");
            anoNovo--;
        } while (anoNovo > 0);

        if (anoNovo > 0) {
            System.out.println(anoNovo);
        } else {
            System.out.println("Feliz ano Novo!");
        }

        int anoNovo1 = 5;
        while (anoNovo1 > 0) {
            System.out.print(anoNovo1--);
            if (anoNovo1 > 0) {
                System.out.print(" ,");
            } else {
                System.out.print(" ,Feliz Ano Novo!\n");
            }
        }
        System.out.println("-------------------------");

        // 17. FOR LOOP
        System.out.println("17. FOR LOOP");
        System.out.println("For Loop: usado quando possui o número de vezes que o loop irá percorrer.");

        /* Estrutura do Loop:
         *
         * - INSTRUÇÃO 1: é executada uma vez antes da execução do bloco de código.
         * - INSTRUÇÃO 2: defina a condição para execução do bloco de código.
         * - INSTRUÇÃO 3: executa sempre após a execução do bloco de código.
         *
         *  ...for (variável, condição, condição contínua)...
         *  for (instrução 1, instrução 2, instrução 3) {
         *      Bloco de código.
         *  }
         */
        for (int valInt2 = 0; valInt2 <= 15; valInt2 = valInt2 + 5){
            System.out.print(valInt2+ " ");
        }
        System.out.println(" ");
        for (int valInt2 = 0; valInt2 <= 16; valInt2 = valInt2 + 2){
            System.out.print(valInt2 + 2 + " ");
        }
        System.out.println(" ");
        for (int valInt2 = 0; valInt2 <= 5; valInt2++){
            System.out.print(valInt2 + "-Nop ");
        }

        // 17.1 FOR LOOP: NESTED LOOPS
        System.out.println("17.1 FOR LOOP: NESTED LOOPS");
        System.out.println("Nested Loops: são loops aninhados (loop dentro de loop.");
        System.out.println("Nested Loops: ");
    }
}
