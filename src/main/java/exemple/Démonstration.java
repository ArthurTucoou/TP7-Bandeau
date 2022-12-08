package exemple;

import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Démonstration {

	  public static void main(String[] args) {

      Bandeau monBandeau = new Bandeau();
      Scénario monscenario = new Scénario(monBandeau);
      Color couleur =  Color.RED;
      monscenario.addEffet(new Zoom(3, monBandeau, "On zoome"));
     // monscenario.addEffet(new Rotate(2, monBandeau, "On tourne"));
      monscenario.addEffet(new Clignotant(3, monBandeau, "On clignote"));
      monscenario.addEffet(new Couleur(monBandeau, "Change couleurs", couleur));

      monscenario.afficherScenario();
	  }


}