package exemple;

import bandeau.Bandeau;
import javafx.scene.paint.Color;

public abstract class Effet {

    public Bandeau bandeau;
    public int repeat;
    public String texte;
    public Color couleur;

        public abstract void afficher();

	    public Effet(int repeat, Bandeau bandeau, String texte) {
	        this.repeat = repeat;
	        this.bandeau = bandeau;
	        this.texte = texte;
	    }
	    
	    public Effet( Bandeau bandeau, String texte, Color couleur) {
	        this.bandeau = bandeau;
	        this.texte = texte;
	        this.couleur = couleur;
	    }    
}
