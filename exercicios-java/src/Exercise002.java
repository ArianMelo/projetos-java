
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
        System.out.println("\"/*...*/\" Comentários em bloco.\n");

        // 7.1 VARIABLES
        System.out.println("7. VARIABLES");
        System.out.println("Tipos de primitivos: String, int, float, char e boolean.\n");
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
        System.out.println(valA * valB * valC + "\n");

        // 7.2 PRINT VARIABLES

        // Use o "+" para concatenar caracteres e variáveis.
        String name2 = "Luís";
        String lastName2 = " Roberto";
        String fullName2 = name2 + lastName2;
        System.out.println(fullName2);
        int numVar1 = 20;
        int numVar2 = 40;
        System.out.println(numVar1 + numVar2);

        // 7.3 MULTIPLAS VARIÁVEIS


    }
}
