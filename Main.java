// Kelas utama (Main Class)
public class Main {
    public static void main(String[] args) {
        Superhero hero1 = new Superhero("Guardian", "Perisai Energi");
        PahlawanTerbang hero2 = new PahlawanTerbang("Sky Falcon", "Terbang Cepat", 800);
        PahlawanKekuatan hero3 = new PahlawanKekuatan("Titan", "Kekuatan Super", 100);
        ArenaPertarungan arena = new ArenaPertarungan();

        // Demonstrasi Inheritance
        System.out.println("== Demonstrasi Inheritance ==");
        hero1.perkenalan();
        hero2.perkenalan();
        hero3.perkenalan();

        // Demonstrasi Overriding
        System.out.println("\n== Demonstrasi Overriding ==");
        hero1.bertarung();
        hero2.bertarung();
        hero3.bertarung();

        // Demonstrasi Overloading
        System.out.println("\n== Demonstrasi Overloading ==");
        arena.mulaiPertarungan(hero2);
        arena.mulaiPertarungan(hero3, "Monster Bayangan");
    }
}
