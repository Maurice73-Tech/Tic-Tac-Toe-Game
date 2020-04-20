public class Brett extends TicTacToe {

	private char[][] Brett;
	private char Spieler;
	
	//Brett Konstruktor
	public Brett() {
		Brett = new char[3] [3];
		Spieler = 'O';
		macheSpielfeld();
	}
	
	//Methode macht das Brett in dem alle Felder leer sind
	public void macheSpielfeld() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Brett [i] [j] = '-';
			}
		}
		
	}
	
	//Methode gibt das aktuelle Brett aus
	public void ausgabeBrett() {
		System.out.println("So sieht das Spielfeld derzeit aus: ");
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(Brett[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
	}
	
	//Prüft ob Brett voll ist
	public boolean istBrettvoll() {
		boolean istvoll = true;
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Brett[i][j] == '-') {
                    istvoll = false;
                }
            }
        }

        return istvoll;
    }
	
	//Prüft ob es einen Gewinner gab
	public boolean gewinner() {
		return (reihengewonnen() || spaltengewonnen() || diagonalegewonnen());
	}
	
	//Prüft ob Reihe gewonnen
	public boolean reihengewonnen() {
        for (int i = 0; i < 3; i++) {
            if (pruefen(Brett[i][0], Brett[i][1], Brett[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

	//Prüft ob Spalte gewonnen
    public boolean spaltengewonnen() {
        for (int i = 0; i < 3; i++) {
            if (pruefen(Brett[0][i], Brett[1][i], Brett[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    //Prüft ob Diagonale gewonnen
    public boolean diagonalegewonnen() {
        return ((pruefen(Brett[0][0], Brett[1][1], Brett[2][2]) == true) || (pruefen(Brett[0][2], Brett[1][1], Brett[2][0]) == true));
    }
    
    //Prüft die drei Zeichen auf Gleichheit
    public boolean pruefen(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }
    
    //getter Spieler 
    public char getSpieler() {
		return Spieler;
	}
    
    //Wechselt Spieler
	public void wechselSpieler() {
        if (Spieler == 'O') {
            Spieler = 'X';
        }
        else {
            Spieler = 'O';
        }
    }
	
	//Plaziert Eingabe des Spielers auf dem Brett 
	public boolean plaziereEingabe(int reihe, int spalte) {

        if ((reihe >= 0) && (reihe < 3)) {
            if ((spalte >= 0) && (spalte < 3)) {
                if (Brett[reihe][spalte] == '-') {
                    Brett[reihe][spalte] = Spieler;
                    return true;
                }
            }
        }

        return false;
	}
}
