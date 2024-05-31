package ClassPackage;

    // 25. JAVA POO
    // 26. CLASSE/OBJETOS JAVA
    // 27. ATRIBUTOS DE CLASSE JAVA
    // 28. MÉTODOS DE CLASSE JAVA
    // 29. CONTRUTORES


public class Exercise006 {
    public static void main(String[] args) {
        // 25. JAVA POO
        System.out.println("25. JAVA POO");
        System.out.println("Classes e Objetos");
        System.out.println("Uma classe contém objetos que podem ser requisitados.");
        System.out.println("Classe é um modelo para objetos e um objeto é uma instância de uma classe.");
        System.out.println("Quando objetos individuais são criados, eles herdam todas as variáveis e métodos de class");
        System.out.println("---------------------------------");

        // 26. CLASSES E OBJETOS
        System.out.println("26. CLASSES E OBJETOS");
        System.out.println("Classe é um modelo para criar objetos. possui os mesmos atributos entre os objetos de uma mesma classe.");
        // Requisitando a class do ClassExercis006.
        // Para requisitar deve estar no mesmo diretório.
        ClassExercise006 myObj = new ClassExercise006();
        System.out.println(myObj.olaMundo006);
        System.out.println(myObj.x);
        System.out.println("---------------------------------");

        //26. CLASSES E OBJETOS: EXERCISE
        // Criei um objeto
        System.out.println("26. CLASSES E OBJETOS: EXERCISE");
        // Crie um objetos que defina carro
        ClassExercise006 carVar = new ClassExercise006();
        // O objeto "carVar" recebe o método "carName" da ClassExercise006
        // O objeto contem Modelo(), Ano(), Valor();
        carVar.carName("mazda", 1990, 49800.79);
        System.out.println("---------------------------------");

        // 27. ATRIBUTOS DE CLASSE JAVA
        System.out.println("27. ATRIBUTOS DE CLASSE JAVA");
        System.out.println("Toda variável e método de uma classe pode ser considerado atributo.");
        // Modificando valores do atributos:
        myObj.x = 15;
        myObj.y = 20;
        System.out.println(carVar.x + " " + myObj.x);
        carVar.carName("Golf", 2001, 19500.23);
        System.out.println(myObj.x + ", " + myObj.y + ", " + myObj.z + " Atributo invariável.");
        // Mantendo o valor de atributo inalterado chamando por meop de outro objeto.
        System.out.println("Valor do x no Objeto \"carVar\" = inalterado: " + carVar.x + "\nValor do x no objeto \"myObjt\" = alterado: " + myObj.x);
        // Pode especificar vários atributos com o mesmo objeto.
        System.out.println("---------------------------------");

        // 28. MÉTODOS DE CLASSE JAVA
        System.out.println("28. MÉTODOS DE CLASSE JAVA");
        // Chamando um método public
        myObj.myMethod2();
        myObj.fullThrottle();
        myObj.speed(180);
        System.out.println("---------------------------------");

        // 29. CONTRUTORES
        // É um método especial usado para iniciar objetos.
        // O "construtor" é chamado quando um objeto de uma classe é criado.
        // Pode ser usado para definir valores iniciais de atributos e objetos.


        System.out.println("---------------------------------");

    }

}
