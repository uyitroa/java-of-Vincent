import java.util.Scanner;
public class lol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Ecrit le premier nombre de fucking shit : ");
		int nombre1 = sc.nextInt();
		System.out.print("Ecrit le deuxième numero de pute : ");
		int nombre2 = sc.nextInt();
		int resultat = nombre1 + nombre2;
		System.out.print("Donne le résultat de "+nombre1 +" + "+ nombre2+ " = " );
		int lol = sc.nextInt();
		
		if (lol == nombre1 + nombre2)
			System.out.print("BRAVO");
		else
			System.out.print("T nul");
	}

}