import java.util.Scanner;
import java.util.Random;
public class JeuGrotte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Dragon Dungeon");
		System.out.print("--Bienvenue dans ce monde de merde--");
		String repete = "Oui";
		
		while(repete.equals("Oui"))
		{	
			intro();
			int choix = demandeGrotte();
			int mauvaiseGrotte = rand.nextInt(2)+1; 
			checkGrotte(choix, mauvaiseGrotte);
			repete = demandeRepete(repete);
			
		}	
		
		
		
	}
	public static void intro()
	{
		System.out.println("-- Il y a deux grotte devant toi --");
		System.out.println("Une grotte ou il y a un dragon qui dors et tu surviras");
		System.out.println("OU");
		System.out.println("Une grotte ou il y a un dragon qui va t'enculer comme une merde");	
	}	
	public static int demandeGrotte()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Premiere grotte");
		System.out.print("2.Deuxieme grotte");
		int choix = sc.nextInt();
		return choix;
	
	}
	public static void checkGrotte(int A, int B)
	{
		if(A == B ) 
		{
			System.out.print("Tu es une merde");
		}	
		else
		{	
			System.out.print("Felicitations");
		}	
			
			
	}
	public static String demandeRepete(String A)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Tu veux recommencer ?");
		A = input.nextLine();
		return A;
	}
	
	
	
	
	
	
	
	
	}
