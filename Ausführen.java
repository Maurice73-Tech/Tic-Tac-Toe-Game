import java.util.Scanner;

public class Ausführen {

	public static void main(String[] args) {
	  try {
		Scanner sc = new Scanner(System.in);
		TicTacToe spiel = new TicTacToe();
		Brett brett = new Brett();
		spiel.begrüßung();
		brett.macheSpielfeld();
		brett.ausgabeBrett();
		int reihe;
		int spalte;
		do {
			System.out.println("Spieler " + brett.getSpieler() + " ist an der Reihe. Bitte geben Sie eine Reihe und eine Spalte ein:"); 
			reihe = sc.nextInt()-1;
			spalte = sc.nextInt()-1;
			brett.plaziereEingabe(reihe, spalte);
			brett.ausgabeBrett();
			brett.wechselSpieler();
		} while(!brett.istBrettvoll() && !brett.gewinner());
		
		if (brett.istBrettvoll() && !brett.gewinner()) {
			System.out.println("Das Spiel endet Unentschieden");
			System.out.println("Spielen Sie doch erneut");
		}
		else {
			brett.wechselSpieler();
			System.out.println("Herzlichen Glückwunsch der/die Spieler*in " + brett.getSpieler() + " hat gewonnen!");
		}
	  } catch(Exception e) {
		  System.out.println("Ungültige Eingabe, bitte starten Sie das Spiel neu");
	  }
	}
}
