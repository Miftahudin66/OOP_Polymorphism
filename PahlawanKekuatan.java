// Subclass 2
class PahlawanKekuatan extends Superhero {
    private int tingkatKekuatan;

    public PahlawanKekuatan(String nama, String kekuatan, int tingkatKekuatan) {
        super(nama, kekuatan);
        this.tingkatKekuatan = tingkatKekuatan;
    }

    @Override
    public void bertarung() {
        System.out.println(nama + " menghancurkan musuh dengan kekuatan level " + tingkatKekuatan + "!");
    }
}