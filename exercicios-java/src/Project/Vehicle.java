package Project;

public class Vehicle {

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

class Car extends Vehicle {
    public void portaMalas() {
        System.out.println("Abrindo porta-malas");
    }
}

class Moto extends Vehicle {
    public void darGrau() {
        System.out.println("Dando grau.");
    }
}


