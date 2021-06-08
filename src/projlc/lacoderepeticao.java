package projlc;

import java.util.Scanner;

public class lacoderepeticao {

	public static void main(String[] args) {
		// brincando com o While
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		
		while (x<9) {
			x = sc.nextInt();
			
			System.out.println("x = "+ x);
		}
		
		sc.close();
	}

}
