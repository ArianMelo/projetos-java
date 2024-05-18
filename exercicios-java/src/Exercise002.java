
// 6. COMMENTS
// 7. VARIABLES
// 8. DATA TYPES
// 9. TYPE CASTING
// 10. OPERATORS

public class Exercise002 {
    public static void main(String[] args) {

        // 6. COMMENTS
        System.out.println("6. COMMENTS");
        System.out.println("\"//\" Comentários em linha.");
        System.out.println("\"/*...*/\" Comentários em bloco.");
        System.out.println("-----------------------------------");

        // 7.1 VARIABLES
        System.out.println("7.1 VARIABLES");
        System.out.println("Tipos de primitivos: int, float, char e boolean.\n");
        // Tipos de variáveis: String, int, float, double, char e boolean.
        System.out.println("String: inserção de texto concatenado dentro de aspas duplas.");
        System.out.println("int: valores inteiros como +123 e -123.");
        System.out.println("float: armazena números de ponto flutuante, com decimais, como 19.99F e -19.00F");
        System.out.println("double: armazena números com vírgula, com apenas duas casas decimais.");
        System.out.println("char: são caracteres únicos como 'a' e 'B', são colocados entre aspas simples.");
        System.out.println("boolean: valores de verdadeiro ou falso.\n");
        // Declarando variáveis
        String request = "Requisitando a variável ";
        System.out.println(request+"Declarando variáveis: type variableName = value");
        int idade = 22;
        System.out.println(request+"\"int idade = 22\": "+idade);
        String name1 = "Arian";
        System.out.println(request+"\"String name = Arian\": "+name1+"\n");
        // Atribuindo novo valor a variável existente
        System.out.println("Alterando o valor de uma variável: \"nomeDaVariável = novoValor;\"");
        name1 = "Bruno";
        System.out.println(name1);
        // Variável imutável - use "final" antes do tipo e nome da variável.
        final int finalNum = 20;
        System.out.println("Esse valor é imutável, usado para valores estáticos como PI = 3,14..."+finalNum);
        // Variável em cadeia de valores: "tipo var1 = val1, var2 = val2, var3 = val3
        int valA = 5, valB = 6, valC = 50;
        System.out.println(valA * valB * valC);
        System.out.println("-----------------------------------");

        // 7.2 PRINT VARIABLES

        // Use o "+" para concatenar caracteres e variáveis.
        System.out.println("7.2 PRINT VARIABLES");
        String name2 = "Luís";
        String lastName2 = " Roberto";
        String fullName2 = name2 + lastName2;
        System.out.println(fullName2);
        int numVar1 = 20;
        int numVar2 = 40;
        System.out.println(numVar1 + numVar2);
        System.out.println("-----------------------------------");

        // 7.3 MULTIPLAS VARIÁVEIS
        System.out.println("7.3 MULTIPLAS VARIÁVEIS");
        // Pode declarar mais de variável do mesmo tipo
        int numVar3 = 10, numVar4 = 15, numVar5 = 25;
        System.out.println("Variáveis adicionadas em linha: " + numVar3 + numVar4 + numVar5);
        System.out.println("-----------------------------------");

        // 7.4 IDENTIFIERS
        System.out.println("7.3 MULTIPLAS VARIÁVEIS");
        // As variáveis devem ter nomes exclusivos, chamados identificadores:
        // - Pode conter linhas, sublinhados, digitos e cifrões;
        // - Devem começar com uma letra;
        // - Devem começar com letra minúscula e não podem espaços em branco;
        // - Podem começar com '$';
        // - Maiúsculas e minúsculas são diferenciadas;
        // - Não podem ser usadas palavras reservadas;
        System.out.println("-----------------------------------");

        // 7.5 EXAMPLES
        System.out.println("7.5 EXAMPLES");
        System.out.println("Exercício de variável: Área do Retângulo");
        int ladoDoRetangulo = 4;
        int baseDoRetangulo = 5;
        final int areaDoRetangulo = ladoDoRetangulo * baseDoRetangulo;
        System.out.println("Lado: "+ ladoDoRetangulo);
        System.out.println("Base: "+ baseDoRetangulo);
        System.out.println("Área do Retângulo: "+ areaDoRetangulo);
        System.out.println("-----------------------------------");

        // 8.1 DATA TYPES
        // Dados primitivas: byte, short, int, long, float, double, boolean e char;
        // Dados não primitivos: String, Arrays, Classes;
        System.out.println("8.1 DATA TYPES");
        System.out.println("Dados primitivas: byte, short, int, long, float, double, boolean e char");
        System.out.println("Dados não primitivos: String, Arrays e Classes.\n");
        System.out.println("byte: 1 byte (-128 até 127");
        System.out.println("short: 2 bytes (-32,768 até 32,767");
        System.out.println("int: 4 bytes (-2,147,483,648 até 2,147,483,647");
        System.out.println("long: 8 bytes (-9.10^18 até 9.10^180)");
        System.out.println("float: 4 bytes (6 a 7 números decimais. Ex.: 1.1234567F");
        System.out.println("double: 8 bytes (até 15 números decimais. Ex.: 1.123456789123456)");
        System.out.println("boolean: 1 bit (true = 1 e false = 0)");
        System.out.println("char: 2 bytes (apresenta apenas um caracteres entre aspas simples. Ex.: 'A'");
        System.out.println("-----------------------------------");

        // 8.2 DATA TYPES: NUMBERS
        System.out.println("8.2 DATA TYPES: NUMBERS");
        byte numByte1 = 100;
        short numShort1 = 5000;
        int numInt1 = 1000000;
        long numLong1 = 100_000_000_000L;
        float numFloat1 = 5.345f;
        double numDouble1 = 19.12345d;
        float numCience1 = 125e3f;
        double numCience2 = 12E4d;
        System.out.println("Byte: " + numByte1);
        System.out.println("Short: " + numShort1);
        System.out.println("Int: " + numInt1);
        System.out.println("Long: " + numLong1);
        System.out.println("Float: " + numFloat1);
        System.out.println("Double: " + numDouble1);
        System.out.println("Número científico usando float: " + numCience1);
        System.out.println("Número científico usando double: " + numCience2);
        System.out.println("-----------------------------------");

        // 8.3 DATA TYPES: BOOLEAN
        System.out.println("8.3 DATA TYPES: BOOLEAN");
        System.out.println("O boolean pode ser: (SIM ou NÃO), (LIGADO ou DESLIGADO) e (VERDADEIRO e FALSO)");
        System.out.println("-----------------------------------");

        // 8.4 DATA TYPES: CHARACTERS
        System.out.println("8.4 DATA TYPES: CHARACTERS");
        char meuChar1 = 'A';
        System.out.println(meuChar1);
        // Alguns números podem ser representados como caracteres: A = 65, B = 66, C = 67;
        System.out.println("A = 65, B = 66, C = 67");
        System.out.println("String: são cadeias de caracteres unidas para formar texto.");
        System.out.println("-----------------------------------");

        // 8.5 DATA TYPES: EXERCISE
        System.out.println("8.5 DATA TYPES: EXERCISE");
        int numItems1 = 50;
        float costItems1 = 9.99f;
        float totalCostItems1 = numItems1 * costItems1;
        char currency1 = '$';
        System.out.println("Números de itens: "+ numItems1);
        System.out.println("Custo por item: "+ costItems1 + currency1);
        System.out.println("Custo total: "+ totalCostItems1 + currency1);
        System.out.println("-----------------------------------");

        // 8.6 DATA TYPES: NON-PRIMITIVE DATA TYPES
        System.out.println("8.6 DATA TYPES: NON-PRIMITIVE DATA TYPES");
        // Tipos de dados não primitivos são chamados de referência porque se referem a objetos.
        // TIPOS PRIMITIVOS são definidos pelo JAVA;
        // TIPOS PRIMITIVOS começa com letra minúscula;
        // TIPOS NÃO PRIMITIVOS são definidos pelo programador;
        // TIPOS NÃO PRIMITIVOS podem charmar métodos e realizar operações.
        // TIPOS NÃO PRIMITIVOS podem ter valores "null";
        // TIPOS NÃO PRIMITIVOS podem começar com letra maiúsculas;
        // TIPOS NÃO PRIMITIVOS são: String, Arrays, Classes, Interface e outros...
        System.out.println("-----------------------------------");

        // 9.0 TYPE CASTING

        System.out.println("9.0 TYPE CASTING");
        System.out.println("Widening Casting - automático, conversão de tipo menor para maior.");
        System.out.println("byte -> short -> char -> int -> long -> float -> double \n");
        System.out.println("Narrowing Casting - manual, conversão de tipo maior para menos.");
        System.out.println("double -> float -> long -> int -> char -> short -> byte \n");
        int numAutoInt1 = 10;
        double numAutoDouble1 = numAutoInt1; // Casting Automático: int(menor) para double(maior) - AUTOMÁTICO.
        System.out.println("Valor em int, antes da conversão: " + numAutoInt1);
        System.out.println("Valor em double, depois da conversão: " + numAutoDouble1);
        double numManualDouble1 = 54.99d;
        int numManualInt1 = (int) numManualDouble1; // Casting Manual: double(maior) para int(menor) - FORÇADO.
        System.out.println(numManualDouble1);
        System.out.println(numManualInt1);
        System.out.println("-----------------------------------");

        // 9.1 TYPE CASTING: EXERCISE
        System.out.println("9.1 TYPE CASTING: EXERCISE");
        // Set the maximum possible score in the game to 500
        int maxScore = 500;
        // The actual score of the user
        int userScore = 435;
        /* Calculate the percantage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
        float percentScore = (float) userScore / maxScore * 100.0f;
        System.out.println(percentScore + "%");
        System.out.println("-----------------------------------");

        // 10. OPERATORS
        System.out.println("10. OPERATORS");
        //Operadores aritméticos - Matemáticos: (+, -, *, /, %, ++, --)
        //Operadores de atribuição - Atribuis valores: ( = , +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=)
        //Operadores de comparação - Comparar valores booleanos: ( ==, !=, >, <, >=, <=)
        //Operadores lógicos - Comparar valores booleanos: (&& - and , || - ou, ! - not)
        //Operadores bit a bit: (permitem a avaliação e modificação de bits específicos em um tipo inteiro)
    }
}
