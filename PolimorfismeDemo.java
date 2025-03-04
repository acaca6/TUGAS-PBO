// Superclass
class Hewan {
    void bersuara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

// Subclass 1
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow... Meow...");
    }
}

// Subclass 2
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

// Main Class
public class PolimorfismeDemo {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.bersuara(); // Output: Meow... Meow...
        hewan2.bersuara(); // Output: Guk! Guk!
    }
}