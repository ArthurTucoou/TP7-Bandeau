package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {

    public Rotation(int repeat, Bandeau bandeau, String texte) {
        super(repeat, bandeau, texte);
    }

    public void afficher() {
        bandeau.setMessage(texte);
        for (int i = 0; i < this.repeat; i++) {
                this.bandeau.setRotation(Math.PI / 2);
                this.bandeau.sleep(500);
                this.bandeau.setRotation(Math.PI);
                this.bandeau.sleep(500);
                this.bandeau.setRotation(Math.PI + Math.PI / 2);
                this.bandeau.sleep(500);
                this.bandeau.setRotation(0);
                this.bandeau.sleep(500);
        }

    }
}