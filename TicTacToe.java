import java.util.Scanner;
/*
 * TicTacToe Spiel 
 * @Author Maurice73-Tech 
 */

public class TicTacToe {

	private char[][] Brett;
	private char Spieler;
	
	//Konstruktor
	public TicTacToe() {
		Brett = new char[3] [3];
	}
	
	//Methode spielregeln
	public void spielregeln() {
		System.out.println("Aber bevor wir beginnen; Sind Sie mit den Spielregeln von TicTacToe vertraut?");
		System.out.println("Ja" + " Nein");
		String ja = "Ja";
		String nein = "Nein";
		Scanner scanen = new Scanner(System.in);
		String eingabe = scanen.nextLine();
		if (eingabe.equals(ja)) {
			System.out.println("Sehr gut");		
		}
		else {
			System.out.println("Die Spielregeln:");
			System.out.println("Auf einem quadratischen, 3×3 Felder großen Spielfeld setzen die beiden Spieler abwechselnd ihr Zeichen. ");
			System.out.println("Der eine setzt Kreuze und der andere Kreise, in ein freies Feld.");
			System.out.println("Der Spieler, der als Erster drei Zeichen in eine Zeile, Spalte oder Diagonale setzen kann, gewinnt.\n");
		}
	}
	
	//Methode spielregeln in begrüßung implementiert
	public void begrüßung() {
		System.out.println("Herzlich willkommen zu den XLVI TicTacToe Meisterschaften XO");
		spielregeln();
		System.out.println("So mögen die TicTacToe Spiele beginnen!");
	}
}
