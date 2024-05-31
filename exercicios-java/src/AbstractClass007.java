abstract class AbstractClass007 { // Método Abstrato
    public String fname = "Abstract";
    public int age = 22;
    public abstract void study();
}

// subclass
class Student extends AbstractClass007 {
    public int graduationYear = 2018;
    public void study() {
        System.out.println("Studying all day long");
    }
}
class Second {
    public static void main(String[] args) {
        // create an object of the Student class (which inherits attributes and methods from Main)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}
