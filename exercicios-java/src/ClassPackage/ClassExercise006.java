package ClassPackage;

import com.sun.tools.javac.Main;

public class ClassExercise006 {

    int x = 5;
    int y = 8;
    final int z = 10;

    String olaMundo006 = "Hello World! ClassExercise006";

    public static void main(String[] args) {
        // Crie vários objetos
        // myObj e um objeto da classe ClassExercise006
        // Pode criar um objeto de uma classe e acessá-lo em outra classe.
        // Uma classe possui todos os atributos e métodos,
        // enquanto a outra classe contém o main()método (código a ser executado).
        ClassExercise006 myObj = new ClassExercise006();
        ClassExercise006 myObj1 = new ClassExercise006();
        ClassExercise006 myObj2 = new ClassExercise006();
        ClassExercise006 myCar = new ClassExercise006();
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
        carName("Ford", 2011, 50000.00);
        myMethod1();
        myObj.myMethod2();
        // Chamando os método da aceleração e da velocidade máxima.
        myCar.fullThrottle();
        myCar.speed(200);

    }

    static void carName(String carName, int carYear, double carValue) {
        System.out.println("Modelo: "+ carName + "\nAno: "+ carYear + "\nValor: " + carValue);
    }
    // Static pode ser acessado sem a criação de um objeto.
    static void myMethod1() {
        System.out.println("Hello World Static!");
    }
    // Public só pode ser acessado por objeto.
    public void myMethod2() {
        System.out.println("Hello World Public!");
    }
    // Criando um método aceleração
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    // Adicionando um método com parâmetro int
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed + " Km/h");
    }

}
