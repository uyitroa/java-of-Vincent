import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int reponse = 1;
		
		while(reponse == 1)
		{	System.out.print("Ecrit le premier nombre: ");
			int nombre1 = sc.nextInt();
			System.out.print("Ecrit le deuxième nombre: ");
			int nombre2 = sc.nextInt();
			int resultat;
			resultat = nombre1 + nombre2;
			System.out.print("Calcule le resultat de "+ nombre1 + " + "+ nombre2 +" = " );
			int input = sc.nextInt();
		
			if (input == nombre1 + nombre2)
			{
				System.out.print("Bien joué ");
				System.out.println("Veux-tu recommencer ? Tape 1 pour oui/Tape 2 pour non");
				reponse = sc.nextInt();
			}
				
			else
			{
				
				while (input != nombre1 + nombre2 )	
				
				{	System.out.print("Recalcule: ");
					input = sc.nextInt();
				if (input == nombre1 + nombre2)
				{
					//System.out.print("Desoler tu es trop nul :)");
					System.out.println("Veux-tu recommencer ? Tape 1 pour oui/Tape 2 pour non");
					reponse = sc.nextInt();
				}	
				}
				}
				
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
