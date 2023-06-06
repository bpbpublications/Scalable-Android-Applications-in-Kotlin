import java.util.ArrayList;

class NamedDefault55 {
    void greet() {
        greet("Guest");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    void main(ArrayList<String> args) {
        greet();           // Output: Hello, Guest!
        greet("John");     // Output: Hello, John!
    }
}
