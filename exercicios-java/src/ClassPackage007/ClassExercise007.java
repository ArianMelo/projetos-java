package ClassPackage007;

public class ClassExercise007 {

    final int x = 10;
    final double pi = 3.14;
    // Método Estático
    static void staticMethod() {
        System.out.println("Método Estático");
    }
    // Método Público
    public void publicMethod() {
        System.out.println("Método Público");
    }

    private String name; // Acesso restrito

    // Getter
    // Retorna o valor da variável name.
    public String getName() {
        return name;
    }
    // Setter
    // Pega a variavel name e atribui ao new name.
    public void setName(String newName) {
        // this: palavra-chave usada para se referir ao objeto atual.
        this.name = newName;
    }

}


