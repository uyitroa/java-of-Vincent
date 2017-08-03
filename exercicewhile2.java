import java.util.Scanner;
public class exercicewhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String repete = "O";
		while (repete.equals("O"))
		{
			System.out.println("Choisissez le mode de conversion :");
			System.out.println("1 - De Centimetre à Decimetre ");
			System.out.println("2 - De Decimetre à Centimetre");
			int choix = sc.nextInt();
			System.out.print("Taper l'unité à convertir : ");
			float unite = sc.nextFloat();
			if(choix == 1)
			{		
				float decimetre = unite / 10;
				System.out.println( unite + "cm correspond à " + decimetre + "dm" );
			}	
			
			if(choix == 2) 
			{	
				float centimetre = unite * 10;
				System.out.println( unite + " dm correspond à " + centimetre + " cm ");
	
			
			}
			System.out.print("Veux-tu recommencer ? O/N ");
			sc.nextLine();
			repete = sc.nextLine();
		}
	
	
	
	
	
	
	
	
	
	}

}
