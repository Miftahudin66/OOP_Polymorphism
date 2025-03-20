// Demonstrasi Overloading
class ArenaPertarungan {
    public void mulaiPertarungan(Superhero hero) {
        hero.bertarung();
    }

    public void mulaiPertarungan(Superhero hero, String musuh) {
        System.out.println(hero.nama + " sedang bertarung melawan " + musuh + "!");
        hero.bertarung();
    }
}
