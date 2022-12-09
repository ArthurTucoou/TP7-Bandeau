package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class Couleur extends Effet {
	

	public Couleur( Bandeau bandeau, String texte, Color couleur) {
		super(bandeau, texte, couleur);
	}

	public void afficher() {
		bandeau.setMessage(texte);
        this.bandeau.setForeground(couleur);
        this.bandeau.sleep(1000);
        }    
  	
}
