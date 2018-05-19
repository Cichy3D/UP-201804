package pl.szkolenie.gry;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mapa {
	
	public static int N = 20;
	public static final char SCIANA = '#';
	public static final char GRACZ = '@';
	public static final char PUNKT = '$';
	public static final char PUSTO = ' ';
	public static final Random RND = new Random();
	public static final Scanner SCAN = new Scanner(System.in);
	public static int wynik = 0, graczX, graczY;
	public static char[][] mapa = new char[2*N][N];
	
	public static void main(String[] args) {
		generujMape();
		
		System.out.println("          Mapa\n--------========---------");
		System.out.println("Sterowanie: W, A, S, D - ruch; E - koniec\n\n");
		
		while(true) {
			rysMapa();
			
			if(!czyMapaMaZnak(mapa, PUNKT)) {
				System.out.println("  Zwyciêstwo !!! \n\nTwój wynik: "+wynik);
				break;
			} else {
				System.out.println("Punkty: "+wynik);
			}
			
			System.out.print("Twój ruch: ");
			String odp = SCAN.nextLine().toUpperCase();
			
			if(odp.equals("E")) { // wyjœcie
				System.out.println("Koniec.");
				break;
			}
			
			ruch(odp);
		} // while - END
		
		SCAN.close();
	} // main - END

	public static void ruch(String odpowiedzGracza) {
		mapa[graczX][graczY] = PUSTO;
		if(odpowiedzGracza.equals("W") && mapa[graczX][graczY-1]!=SCIANA) {
			graczY--;
		}
		if(odpowiedzGracza.equals("S") && mapa[graczX][graczY+1]!=SCIANA) {
			graczY++;
		}
		if(odpowiedzGracza.equals("A") && mapa[graczX-1][graczY]!=SCIANA) {
			graczX--;
		}
		if(odpowiedzGracza.equals("D") && mapa[graczX+1][graczY]!=SCIANA) {
			graczX++;
		}
		if(mapa[graczX][graczY]==PUNKT) {
			wynik++;
		}
		mapa[graczX][graczY] = GRACZ;
	}

	/** funkcja rysuj¹ca <b>mapê</b> */
	public static void rysMapa() {
		for(int y=0; y < N; y++) {
			for(int x=0; x < 2*N; x++) {
				System.out.print(mapa[x][y]);
			}
			System.out.println();
		}
	}

	/** funkcja generuj¹ca <b>mapê</b> */
	public static void generujMape() {
		for(int x=0; x < mapa.length; x++) {
			for(int y=0; y < mapa[x].length; y++) {
				if(x==0 || y==0 || x==2*N-1 || y==N-1) {
					mapa[x][y] = SCIANA;
				} else {
					if(RND.nextInt(10)==1) {
						mapa[x][y] = PUNKT;
					} else {
						mapa[x][y] = PUSTO;
					}
				}
			}
		}
		
		graczX = RND.nextInt(2*N-2)+1;
		graczY = RND.nextInt(N-2)+1;
		mapa[graczX][graczY] = GRACZ;
		
		for(int i=0; i < N*N; i++) {
			int x = RND.nextInt(2*N-2)+1;
			int y = RND.nextInt(N-2)+1;
			if(mapa[x][y] == PUSTO) {
				mapa[x][y] = SCIANA;
				if(!czyMapaPoprawna()) {
					mapa[x][y] = PUSTO;
				}
			}
		}
	}
	
	/** funkcja sprawdza <b>mapê</b>, czy mo¿na dostaæ siê do ka¿dego punktu do zebrania */
	public static boolean czyMapaPoprawna() {
		char[][] mapa = new char[2*N][];
		for(int x=0; x < 2*N; x++) {
			mapa[x] = Arrays.copyOf(Mapa.mapa[x], N);
		}
		for(int i=0; i < 4*N*N; i++) {
			for(int x=1; x < 2*N-1; x++) {
				for(int y=1; y < N-1; y++) {
					if(mapa[x][y] != SCIANA) {
						if(mapa[x-1][y] == GRACZ || mapa[x+1][y] == GRACZ || mapa[x][y-1] == GRACZ || mapa[x][y+1] == GRACZ) {
							mapa[x][y] = GRACZ;
						}
					}
				}
			}
		}
		
		return !(czyMapaMaZnak(mapa, PUNKT) || czyMapaMaZnak(mapa, PUSTO)); // poprawnie wygenerowana mapa pozwala graczowi na dostêp do wszystkich punktów
	}
	
	/** funkcja sprawdza <b>mapê</b> pod k¹tem obecnoœci punktów do zebrania*/
	public static boolean czyMapaMaZnak(char[][] mapa, char znak) {
		for(int x=1; x < 2*N-1; x++) {
			for(int y=1; y < N-1; y++) {
				if(mapa[x][y] == znak) {
					return true;
				}
			}
		}
		
		return false;
	}

}
