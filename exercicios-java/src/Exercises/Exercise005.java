package Exercises;
// 20. Métodos Java
    // 21. Parâmetros do método Java
    // 22. Sobrecarga de método Java
    // 23. Escopo Java
    // 24. Recursão Java

public class Exercise005 {
    public static void main(String[] args) {
        // 20. MÉTODOS JAVA
        System.out.println("20. MÉTODOS JAVA");
        System.out.println("Métodos são conhecidos como funções");
        System.out.println("É um bloco de código que só é executado quando é chamado.");
        System.out.println("Pode passa dados chamado parâmetros.");
        System.out.println("Para utilizar o código, deve defini-lo apenas uma vez e usa quando quiser.");
        System.out.println("O método deve ser declarado dentro de uma classe.");
        System.out.println("Primeiro em o nome do método, seguido do parênteses");
        System.out.println("O método mais conhecido do java é o \"System.out.println()\".");
        System.out.println("---------------------");
        // Criando o primeiro método
        // O método deve está fora do método principal.
        // "static" significa que o método pertence a classe Main e não a um objeto da classe Main.
        // "myMethod1()" é o nome do método;
        // "void" significa que este método não possui um valor de retorno.
        System.out.println("Criando um método");

        // Criando um método
        //static void myMethod1() {
        //  System.out.println("Apenas execute.");

        // Chamando um método
        callMethod1();
        callMethod1();
        callMethod1();

        // 21.1 PARÂMETROS E ARGUMENTOS
        System.out.println("21.1 PARÂMETROS E ARGUMENTOS");
        System.out.println("Os parâmetros são inseridos dentro do parêntes.");
        System.out.println("Pode adicionar mais um parâmetro separando por virgulas.");

        // Quando um parâmetro é passado para o método, ele é chamado de argumento.
        // Os nomes impressos são argumentos.
        callName("Wallace");
        callName("Robert");
        callName("Jones");

        nameAndAge1("Luis", 25);
        nameAndAge1("Marco",34);
        nameAndAge1("Jones",43);

        checkAge(16); // Chamada para valor menor que 18 anos.
        checkAge(25); // Chamada para valor maior que 18 anos.

        ageExercise1(10);
        ageExercise1(12);
        ageExercise1(14);
        ageExercise1(18);
        ageExercise1(21);

        System.out.println("---------------------");
        // 21.2 PARÂMETROS E ARGUMENTOS: RETORNO
        // Para um  método voltar um valor , pode usar um tipo de dados primitivos;
        // como: int, char, etc; em vez de "void" e usar a palavra-chave "return" dentro do método;
        System.out.println("21.2 PARÂMETROS E ARGUMENTOS: RETORNO");

        System.out.println(valNumSum1(5)); // 5 + 5 = 10
        System.out.println(valNumSum2(5,6)); // x = 5, y = 6; 5 + 6 = 11;

        // Armazenando o resultado em uma variável (recomendado)
        int z = valNumSum2(7,9);
        System.out.println(z);
        int z2 = valNumSum2(10,15) + valNumSum1(50);
        System.out.println(z2);
        System.out.println("---------------------");

        // 22. SOBRECARGA DE MÉTODOS
        System.out.println("22. SOBRECARGA DE MÉTODOS");
        System.out.println("A sobrecarga de métodos, vários métodos podem\nter o mesmo nome com parâmetros diferentes.");
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("Métodos não sobrecarregados Int: "+ myNum1);
        System.out.println("Métodos não sobre carregados Double: "+ myNum2);
        System.out.println("");
        // Chamando os métodos sobrecarregados
        int myNum3 = plusMethod(7,9);
        double myNum4 = plusMethod(12.3,15.8);
        System.out.println("Sobrecarregado Int: "+ myNum3);
        System.out.println("Sobrecarregado Double: "+ myNum4);

        System.out.println("---------------------");
        // 23. ESCOPO DE MÉTODO
        System.out.println("23. ESCOPO DE MÉTODO");
        System.out.println("Escopo: A região em que as variáveis são criadas.");
        System.out.println("Variáveis dentro de blocos de código só são acessadas pelos elementos do bloco.");
        System.out.println("---------------------");
        // 24. RECURSÃO JAVA
        System.out.println("24. RECURSÃO JAVA");
        System.out.println("É a tecnica para fazer chamada da função.");
        System.out.println("Tecnica para fornecer uma maneira de dividir problemas\n complicados em problemas simples.");
        System.out.println("EXEMPLO");
        int resultRec1 = sum(4);
        /*
        Quando a sum()função é chamada, ela adiciona parâmetro kà soma de
        todos os números menores ke retorna o resultado. Quando k se torna 0,
        a função retorna apenas 0. Ao ser executado, o programa segue estas etapas:

        10 + soma (9)
        10 + ( 9 + soma (8) )
        10 + ( 9 + ( 8 + soma (7) ) )
        ...
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + soma(0)
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
         */
        System.out.println(resultRec1);
        System.out.println("Condição de parada, para encerrar um loop infinito");
    }

    static void callMethod1() {
        System.out.println("Apenas execute o primeiro método.");
    }

    // fname é um parâmetro.
    static void callName(String fname) {
        System.out.println(fname + " Willian");
    }

    static void nameAndAge1(String fname1, int age1) {
        System.out.println(fname1 + " age: " + age1);
    }

    // Método com IF...ELSE
    // Crie um método checkAge() com uma integração de variável chamando idade.
    static void checkAge(int age2) {

        // Se a idade for menor que 18, imprima "acesso negado".
        if (age2 < 18) {
            System.out.println("Acesso negado - você possio idade inadequada.");
            // Se a idade for maior, ou igual a 18, imprima "acesso concedido".
        } else {
            System.out.println("Acesso concedido - Você possui idade adequada.");
        }
    }

    // EXERCISE 21. PARÂMETROS E ARGUMENTOS

    // Crie um método que define se o indivídou é:
    // Menor de 11 anos: criança.
    // Maior de 11 e menor de 14 anos: pré-adolescente.
    // Maior de 14 e menor de 18 anos: adolescente.
    // Maior de 18 anos adulto
    static void ageExercise1(int ageValue1) {
        if (ageValue1 <= 11) {
            System.out.println("Você é criança.");
        } else if (ageValue1 < 14) {
            System.out.println("Você é pré-adolescente.");
        } else if (ageValue1 < 18) {
            System.out.println("Você é adolescente.");
        } else {
            System.out.println("Você é adulto.");
        }
    }

    // Para um método retornar um valor, você pode utilizar um tipo de dados primitivo
    // Ex.: int, char, etc. em vez de "void" e usar "return" dentro do método.
    static int valNumSum1(int x) {
        return 5 + x;
    }

    static  int valNumSum2(int x1, int y1) {
        return x1 + y1;
    }

    // SOBRECARGA DE MÉTODO

    // O plusMethod estão sobrecarregador para int e double, eles poderiam funcionar em apenas um método geral.
    static int plusMethodInt(int x1, int y1) {
        return x1 + y1;
    }

    static double plusMethodDouble(double x1, double y1) {
        return x1 + y1;
    }
    // Esse métodos podem ter apenas um nome
    static int plusMethod(int x2,int y2) {
        return x2 + y2;
    }

    static double plusMethod(double x2, double y2) {
        return x2 + y2;
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
            } else {
                return 0;
        }
    }
}
