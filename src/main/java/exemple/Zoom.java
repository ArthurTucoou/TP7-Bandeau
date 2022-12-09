package exemple;

import bandeau.Bandeau;
import java.awt.Font;

public class Zoom extends Effet {

    public Zoom(int repeat, Bandeau bandeau, String texte) {
        super(repeat, bandeau, texte);
    }

    public void afficher() {
        bandeau.setMessage(texte);
        for (int i = 0; i < this.repeat; i++) {
            for (int j = 0; j <= 50; j += 2) {
                this.bandeau.setFont(new Font("SansSerif", Font.BOLD, 30 + i));
                this.bandeau.sleep(50);

            }
        }
    }
}
