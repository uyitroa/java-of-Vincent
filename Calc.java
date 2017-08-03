import java.util.Scanner;


public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.+ "); // "1.+"
		System.out.println("2.-"); //Ecrire "2.-"
		System.out.println("3.x"); //Ecrire"3.x"
		System.out.println("4./"); //Ecrire "4./"
		System.out.print("Choisit un operateur entre ces propositions : "); //Choisir l'operateur
		int choix = sc.nextInt(); //Utilisateur tape son choix
		System.out.print("Ecrit le premier nombre : "); //System ecrit le 1er nombre
		int nombre1 = sc.nextInt(); //User tape 1er nombre
		System.out.print("Ecrit le deuxieme nombre : "); //System ecrit le 2eme nombre
		int nombre2 = sc.nextInt(); //User tape le 2eme nombre
		//debugPrint("on est dehors de la condition ");
		if (choix == 1) //Verifie si user choisit 1er nombre
		{
			//debugPrint("on est dedans la condition ");
			System.out.print("Vous avez choisi l'addition. "); //System ecrit que User a choisit 1er nombre
			System.out.print("Donne le resultat de " +nombre1+ " + " +nombre2 +" : ");		
			int input = sc.nextInt(); //User tape resultat calcul
			
			
			//debugPrint("On est dehors de la condition");
			if (input == nombre1 + nombre2) //Verifie si User a donné le resultat
			{	
				//debugPrint("On est dans la condition");
				System.out.print("Bravo");
			}
			
			else //si le resultat ne correspond pas
			{	
				System.out.print("Ta gueule");
			}	
		}
		
		
		if (choix == 2)
		{	System.out.println("Vous avez choisi la soustraction. ");
			System.out.print("Donne le resultat de " +nombre1 +" - "+ nombre2 +" : " );
			int input = sc.nextInt();
		
			if (input == nombre1 - nombre2)
			{
				System.out.print("Bravo");
			}
			else
			{	
				System.out.print("Ta gueule");
			}
		}
	
		if (choix == 3)
		{	System.out.println("Vous avez choisi la multiplication. ");
			System.out.print("Donne le resultat de " + nombre1 + " x " + nombre2 + " : ");
			int input = sc.nextInt();
			if (input == nombre1 * nombre2)
			{	
				System.out.print("Bravo");
			}	
			else
			{
				System.out.print("Ta gueule ");
			}
		}
			
		
		
		if (choix == 4)
		{	System.out.println("Vous avez choisi la division. ");
			System.out.print("Donne le resultat de " + nombre1 + " / " + nombre2 + " : ");
			int input = sc.nextInt();
			if (input == nombre1 / nombre2)
			{	
				System.out.print("Bravo");
			}
			else	
			{	
				System.out.print("Ta gueule");
			}	
		}
	}

	public static void debugPrint(String A)
	{
		System.out.println(A);
	}


}

