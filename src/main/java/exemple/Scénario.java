package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

public class Scénario {
	
	  public Bandeau bandeau;

	    ArrayList<Effet> listeEffets = new ArrayList<Effet>();
	    
	    public Scénario(Bandeau bandeau) {
	        this.bandeau = bandeau;
	    }

	    public void ajoutEffet(Effet listeEffets) {
	        this.listeEffets.add(listeEffets);
	    }

	    public void afficherScénario() {
	        for (Effet e : listeEffets) {
	            e.afficher();
	            bandeau.sleep(1000);
	        }
	        bandeau.close();  
	    }
   
}