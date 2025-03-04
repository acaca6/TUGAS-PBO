abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
}

// Subclass Persegi
class Persegi extends BangunDatar {
    double sisi;

    // Constructor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi method luas()
    @Override
    double luas() {
        return sisi * sisi;
    }

    // Implementasi method keliling()
    @Override
    double keliling() {
        return 4 * sisi;
    }
}

// Subclass Lingkaran
class Lingkaran extends BangunDatar {
    double r;

    // Constructor
    public Lingkaran(double r) {
        this.r = r;
    }

    // Implementasi method luas()
    @Override
    double luas() {
        return Math.PI * r * r;
    }

    // Implementasi method keliling()
    @Override
    double keliling() {
        return 2 * Math.PI * r;
    }
}

// Subclass Segitiga
class Segitiga extends BangunDatar {
    double alas, tinggi;

    // Constructor
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Implementasi method luas()
    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    // Implementasi method keliling() (asumsi segitiga sama kaki)
    @Override
    double keliling() {
        double sisiMiring = Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi);
        return alas + 2 * sisiMiring;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(4);
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar segitiga = new Segitiga(6, 8);

        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}
