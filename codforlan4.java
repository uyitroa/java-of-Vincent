import java.util.Scanner;
public class codforlan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repete = 1; //Creer une variable repete valeur 1
		while(repete == 1)	//Verifie si while = a 1
		{
			System.out.print("Tu veux combien de nombre ? "); //System Affiche " Tu veux etc "
			int choix = sc.nextInt(); //Le joueur input cb il veut nombre
			int somme ; // Creer variable somme aucune valeur
			somme = 0;	// Valeur somme = 0
			int list[] = new int [choix];	//Creer un tableau avec une longeur que a defini user avec variable choix
			for (int i = 0 ; i < choix; i++) //Pour creer variable i valeur 0 i plus petit nombre quil veut i= i+1 a chaque boucle
			{
				System.out.print("A l'emplacement " + i + "c quoi le nombre :");//Affiche emplacement list 
				int nombre = sc.nextInt();// Input le nombre a la position quil veut
			
				if (i == 0)//Verifie si i = 0
				{
					somme = nombre ;//variable somme = nombre que user a input
				
				}	
				else
				{	
					somme = nombre + somme;// somme = nombre user input + nombre usr input
				}	
			
		
			}		
			System.out.print(somme);// Affiche la somme des nombres 
			System.out.print("Tu veux rejouer ? 1 pr UI/2 pr non");//affiche tu veux rejouer
			repete = sc.nextInt();//Usr input si il veut rejouer ou pas?
		}
	
	}

}
