package ClassPackage007;

    // 30. MODIFICADORES DE ACESSO
    // 31. ENCAPSULAMENTO

import ClassPackage.*;

public class Exercise007 {

    public static void main(String[] args) {
        // 30. MODIFICADORES DE ACESSO
        System.out.println("30. MODIFICADORES DE ACESSO");
        /*
         *   A public palavra-chave é um modificador de acesso
         *   , o que significa que é usada para definir o nível de acesso para
         *  classes, atributos, métodos e construtores.
        */

        // Modificadores de acesso - controla o nível de acesso
        // Modificadores sem acesso - não controlam o nível de acesso, mas fornecem outras funcionalidades.

        // Para classes, você pode usar o public padrão
        System.out.println("Para classes:");
        System.out.println("PUBLIC: Usando public em uma classe torna-o acessível para outras classes.");
        System.out.println("DEFAULT: Torna a classe acessível para outras classes da mesma pasta.");
        // PARA ATRIBUTOS, MÉTODOS E CONSTRUTORES
        System.out.println("Para atributos, métodos e construtores.");
        System.out.println("PUBLIC: O código fica acessível para todas as classes.");
        System.out.println("PRIVATE: O código fica acessível apenas dentro da classe declarada");
        System.out.println("DEFAULT: O código fica acessível para o mesmo pacote.\n É usado quando não há um modificador especificado");
        System.out.println("PROTECTED: O código é acessível dentro do mesmo pacote e subclasses.");
        // MODIFICADORES SEM ACESSO
        // Para classes: final ou abstract
        System.out.println("FINAL: A classe não pode ser herdada por outras classes.");
        System.out.println("ABSTRACT: A classe não pode ser usada para criar objetos, para acessar\n uma classe abstrata, ela deve ser herdada de outra classe.");
        // Para atributos e métodos
        System.out.println("FINAL: Atributos e métodos não podem ser modificados ou substituido.");
        System.out.println("STATIC: Atributos e métodos pertencem à classe, e não a um objeto.");
        System.out.println("ABSTRACT: Só pode ser usado em uma classe abstrata e só pode ser usado em métodos. O método não possui corpo.");
        System.out.println("TRANSIENT: Atributos e métodos são ignorados ao serializar o objeto que os contém.");
        System.out.println("SYNCHRONIZED: Os métodos só podem ser acessados por um thread por vez");
        System.out.println("VOLATILE: O valor de um atributo não é armazenado em cache localmente e é sempre lido na \"memória principal\"");
        System.out.println("-------------------");

        ClassExercise007 myObj = new ClassExercise007();
        // AMBOS OS VALORES RETORNARÃO UM ERRO.
        //myObj.x = 25;
        //myObj.PI = 43;
        myObj.publicMethod();

        // 31. ENCAPSULAMENTO
        System.out.println("31. ENCAPSULAMENTO");
        // Encapsulamento: serve para garantir que os dados "confidenciais" sejam ocultados dos usuários.
        // Para isso e necessário declarar variáveis/atributos de classe como private.
        // Fornecer métodos públicos get e set para acessar e atualizar o valor de uma private variavel.
        // Variáveis private só podem ser acessadas dentro da mesma classe(uma classe externa não tem acesso a elas)
        // É possíevel acessá-las se fornecermos métodos públicos get e set.
        // get retorna o valor da variável e ser define o valor.
        // Sintaxe: get ou set seguido do nome da variável com a primeira letra maiúscula.
        myObj.setName("Luis");
        System.out.println("Meu nome é: " + myObj.getName());
        // Melhor controle de atributos e métodos de classe.
        // Os atributos de classe podem ser somente leitura (se você usar apenas o getmétodo).
        // Somente gravação (se você usar apenas o setmétodo).
        // Flexível: o programador pode alterar uma parte do código sem afetar outras partes.
        // Maior segurança dos dados.

        ClassExercise006 importExec006 = new ClassExercise006();
        importExec006.myMethod2();
    }
}
