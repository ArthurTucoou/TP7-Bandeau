package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class Clignotement extends Effet {

    public Clignotement(int repeat, Bandeau bandeau, String texte) {
        super(repeat, bandeau, texte);
    }

    public void afficher() {
        bandeau.setMessage(texte);
        for (int i = 0; i < this.repeat; i++) {
            for (int j = 0; j < this.repeat; j++) {
                if (i % 2 == 0) {
                    this.bandeau.setForeground(Color.white);
                    this.bandeau.sleep(100);
                }else {
                    this.bandeau.setForeground(Color.black);
                    this.bandeau.sleep(100);
                }
            }
        }
    }
}
