package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

public class Scénario {
	
	  public Bandeau bandeau;

	    ArrayList<Effet> mesEffets = new ArrayList<Effet>();
	    
	    public Scénario(Bandeau bandeau) {
	        this.bandeau = bandeau;
	    }

	    public void addEffet(Effet mesEffets) {
	        this.mesEffets.add(mesEffets);

	    }

	    public void afficherScénario() {
	        for (Effet e : mesEffets) {
	            e.afficher();
	            bandeau.sleep(1000);
	        }
	        bandeau.close();  
	    }
   
}