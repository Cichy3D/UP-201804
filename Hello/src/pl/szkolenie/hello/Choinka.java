package pl.szkolenie.hello;

public class Choinka {

	public static void main(String[] args) {
//		for(int y = 0; y<10; y++) {
//			for(int x = 0; x<=y; x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		String s = "";
		for(int y = 0; y<10; y++) {
			s += (char)(((int)'A')+y);
			System.out.println(s);
		}
		
		System.out.print("*\n*\n**\n");
		
		

	}

}
