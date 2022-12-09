package exemple;

import java.awt.Color;

import bandeau.Bandeau;

public class Démonstration {

	  public static void main(String[] args) {

      Bandeau monBandeau = new Bandeau();
      Scénario monScénario = new Scénario(monBandeau);
      Color couleur =  Color.green;
      
      monScénario.ajoutEffet(new Rotation(3, monBandeau, "On tourne"));
      monScénario.ajoutEffet(new Couleur(monBandeau, "Change de couleur", couleur));
      monScénario.ajoutEffet(new Zoom(5, monBandeau, "On zoome"));
      monScénario.ajoutEffet(new Clignotement(4, monBandeau, "On clignote"));

      monScénario.afficherScénario();
	  }


}