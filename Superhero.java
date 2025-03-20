// Superclass
class Superhero {
    protected String nama;
    protected String kekuatan;

    public Superhero(String nama, String kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    public void perkenalan() {
        System.out.println("Aku adalah " + nama + ", dengan kekuatan: " + kekuatan);
    }

    public void bertarung() {
        System.out.println(nama + " sedang bertarung melawan kejahatan!");
    }
}