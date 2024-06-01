package Project;

public class Car {

    public void dirigir(){
        acelerar();
        desacelerar();
        marchaRe();
        desligar();
        ligar();
    }

    public void acelerar(){
        System.out.println("Acelerei");
    }

    public void desacelerar(){
        System.out.println("Desacelerei");
    }

    public void marchaRe(){
        System.out.println("Ré");
    }

    public void desligar(){
        System.out.println("Desliguei");
    }

    public void ligar() {
        System.out.println("Liguei");
    }

}
