package pl.szkolenie.gry;

import java.util.Random;
import java.util.Scanner;

public class Mapa {
	
	public static int N = 10;
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
		graczX = RND.nextInt(2*N-2)+1;
		graczY = RND.nextInt(N-2)+1;
		mapa[graczX][graczY] = GRACZ;
		
		System.out.println("          Mapa\n--------========---------");
		System.out.println("Sterowanie: W, A, S, D - ruch; E - koniec\n\n");
		
		while(true) {
			rysMapa();
			System.out.print("Twój ruch: ");
			String odp = SCAN.nextLine().toUpperCase();
			
			if(odp.equals("E")) { // wyjœcie
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
		System.out.println("Punkty: "+wynik);
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
						if(RND.nextInt(5)==1) {
							mapa[x][y] = SCIANA;
						} else {
							mapa[x][y] = PUSTO;
						}
					}
				}
			}
		}
	}

}
