package Exercises;
// 11. STRINGS
    // 12. MATH
    // 13. BOOLEANS
    // 14. IF...ELSE
    // 15. SWITCH

public class Exercise003 {
    public static void main(String[] args) {

        // 11.1 STRINGS
        // Métodos de String: length(), toUpperCase(), toLowerCase().
        System.out.println("11.1 STRINGS");
        String txtStrings = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Tamanho da String exibido pelo método \"length\": "+ txtStrings.length());
        System.out.println("String exibido em letra maiúscula pelo método \"toUpperCase()\": "+ txtStrings.toUpperCase());
        System.out.println("String exibido em letra minúscula pelo método \"toLowerCase()\": "+ txtStrings.toLowerCase());
        System.out.println("String retorna o index(posição) pelo método \"indexOf()\": "+ txtStrings.indexOf("a"));
        System.out.println(txtStrings.indexOf("ab"));// 0 é a primeira posição
        System.out.println(txtStrings.indexOf("efg"));
        System.out.println(txtStrings.indexOf("xyz"));// Conta a partir do primeiro caracetere.
        System.out.println("-----------------------------------");

        // 11.2 STRINGS: CONCATENATION
        System.out.println("11.2 STRINGS: CONCATENATION");
        // O sinal de + é usado para concatenar strings.
        String firstName1 = "John";
        String lastName1 = "Willians";
        System.out.println(firstName1 + " " + lastName1);
        // concat(): pode ser usado para concatenar duas strings.
        firstName1 = "John ";
        System.out.println(firstName1.concat(lastName1));
        System.out.println("-----------------------------------");

        // 11.3 STRINGS: STRING AND NUMBERS
        System.out.println("11.3 STRINGS: STRING AND NUMBERS");
        int intVal01 = 10;
        int intVal02 = 20;
        int intTotal01 = intVal01 + intVal02; // Resultado numérico.
        System.out.println("Concatenação de variáveis matemática gera um resultado: "+ intTotal01);
        String stgVal01 = "10";
        String stgVal02 = "20";
        String stgResult01 = stgVal01 + stgVal02; // Resultado em texto.
        System.out.println("Concatenação de Strings gera um texto unido: "+ stgResult01);
        System.out.println("-----------------------------------");

        // 11.4 STRINGS: SPECIAL CHARACTERS
        System.out.println("11.4 STRINGS: SPECIAL CHARACTERS");
        // Caracteres especiais: \' -> ', \" -> ", \\ -> \;
        System.out.println("Texto com barra: \'aspas simples\', \"aspas duplas\", \\repositorio");
        System.out.println("Texto com barra: pula linha\n");
        System.out.println("Texto com barra: \rquebra linha");
        System.out.println("Texto com barra:\ttab");
        System.out.println("Texto com barra: apagax\b uma caractere anterior");
        System.out.println("Texto com barra: \fforma");
        // \n -> pula uma linha, \r -> quebra linha, \t -> TAB, \b -> Backspace, \f ->
        System.out.println("-----------------------------------");

        // 12. MATH
        System.out.println("12. MATH");
        // Método Math.max(x,y): Maior valor entre os valores dentro dos parênteses;
        System.out.println("Método: Math.max(5,10): "+ Math.max(5,10));
        // Método Math.min(x,y): Menor valor entre os valores dentro dos parênteses;
        System.out.println("Método: Math.min(5,10): "+ Math.min(5,10));
        // Método Math.sqrt(x): Retorna raiz quadrada do valor;
        System.out.println("Método: Math.sqrt(2): "+ Math.sqrt(2));
        // Método Math.abs(x): Retorna valor absoluto(módulo), -5 = |5|;
        System.out.println("Método: Math.abs(-2): "+ Math.abs(-2));
        // Método Math.random(): Retorna valor aleatório entre 0-1, ele pode sem multiplicado por outro valor;
        System.out.println("Método: Math.random(): "+ Math.random());
        System.out.println("Método: Math.random(): "+ Math.random() * 101); // 0 até 100
        System.out.println("-----------------------------------");

        // 13. BOOLEANS
        System.out.println("13. BOOLEANS");
        // BOOLEANOS: (SIM/NÃO), (LIGADO/DESLIGADO), (VERDADEIRO/FALSO);
        boolean optionT = true;
        boolean optionF = false;
        System.out.println(optionT);
        System.out.println(optionF);
        // Operador de comparação
        int intCom1 = 10;
        int intCom2 = 20;
        System.out.println("10 > 20: "+ (intCom1 > intCom2));
        System.out.println("10 < 20: "+ (intCom1 < intCom2));
        System.out.println("-----------------------------------");

        // 13.1 BOOLEANS: IF...ELSE
        System.out.println("13.1 BOOLEANS: IF...ELSE");
        int intVal1 = 1;
        if (intVal1 < 5) {
            System.out.println("O valor é menor que 5.");
        } else if (intVal1 <= 7) {
            System.out.println("O valor está entre 5 e 7");
        } else {
            System.out.println("O valor é maior que 7");
        }
        System.out.println("-----------------------------------");

        // 14. IF...ELSE
        System.out.println("14. IF...ELSE");
        /* Condições lógicas usuais da matemática:
        * Menor que: a < b;
        * Menor ou igual a: a <= b;
        * Maior que: a > b;
        * Maior ou igual a: a >= b
        * Igual a: a == b;
        * Diferente de: a! = b;
         */

        /* Instruções condicionais:
        * if: especificar o bloco de código a ser executado, se a condição for verdadeira;
        * else: especificar um bloco de código a ser executado, se a condição for falsa;
        * else if: para especificar uma nova condição a ser testada, se a primeira condição for falsa;
        * switch: para especificar muitos bloco alternativos de código a serem executados.
        */
        intVal1 = 20;
        int intVal2 = 40;

        if (intVal1 >= 20) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (intVal1 >= 40) {
            System.out.println("Valor 1 é maior que 40");
        } else if (intVal2 <= 30) { // else...if é operador ternário -> consistem em três operandos.
            System.out.println("Valor 2 é menor que 30");
        } else {
            System.out.println("Valor 1 é menor que 40 e Valor 2 é maior que 30");
        }
        // Instrução em uma única linha:
        // variable = (condição) ? espressaoVerdadeira : espressaoFalse;
        String result1 = (intVal1 >= 10) ? "Valor 1 é maior que 40." : "Valor 1 é menor que 40 e Valor 2 é maior que 30";
        System.out.println(result1);

        // 14. IF...ELSE: EXERCISE

        int doorCode1 = 1234;
        int doorCode2 = 1357;

        if (doorCode1 == 1234) {
            System.out.println("Senha correta. A porta pode ser aberta.");
        } else {
            System.out.println("Senha incorreta. Tente novamente");
        }

        String doorLock = (doorCode2 == 1356) ? "Senha correta, pode abrir" : "Senha incorreta, tente novamente.";
        System.out.println(doorLock);
        System.out.println("-----------------------------------");

        // 15. SWITCH
        System.out.println("15. SWITCH");
        /* Seleciona um dos muitos blocos de código a serem executados testar
        * valores dos cases */

        /* O switch possui um valor de entrada e "cases"(opções) que serão
        selecionadas a partir do valor de entrada e o valor correspondente*/
        int switchVal1 = 1;
        /* Sem Break: continua a leitura do código enquanto
        o valor correspondente for maior.*/
        switch(switchVal1) {
            case 1:
                System.out.println("Switch 1 selecionado");
            case 2:
                System.out.println("Switch 2 selecionado");
            case 3:
                System.out.println("Switch 3 selecionado");
        }

        int switchVal2 = 2;
        // Com Break: pausa a leitura do conteúdo;
        switch(switchVal2) {
            case 1:
                System.out.println("Switch 1 selecionado");
                break;
            case 2:
                System.out.println("Switch 2 selecionado");
                break;
            case 3:
                System.out.println("Switch 3 selecionado");
                break;
        }

        int switchVal3 = 2;
        // Default: valor padrão quando não há valor correspondente;
        switch(switchVal3) {
            case 1:
                System.out.println("Switch 1 selecionad");
                break;
            case 2:
                System.out.println("Switch 2 selecionad0");
                break;
            case 3:
                System.out.println("Switch 3 selecionado");
            default:
                System.out.println("O valor não possui resultado.");
                break;
        }

    }
}
