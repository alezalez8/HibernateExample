package testpackage;

public class InherrClass {
    public static void main(String[] args) {
        B a = new B();
        a.pringMy();

    }
}

class A {
    public void pringMy() {
        System.out.println("Class A");
    }
}
class B extends A {
    public void pringMy() {
        System.out.println("Class B");
    }
}