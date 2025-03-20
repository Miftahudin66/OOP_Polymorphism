// Subclass 1
class PahlawanTerbang extends Superhero {
    private int kecepatanTerbang;

    public PahlawanTerbang(String nama, String kekuatan, int kecepatanTerbang) {
        super(nama, kekuatan);
        this.kecepatanTerbang = kecepatanTerbang;
    }

    @Override
    public void bertarung() {
        System.out.println(nama + " menyerang dari udara dengan kecepatan " + kecepatanTerbang + " km/jam!");
    }
}