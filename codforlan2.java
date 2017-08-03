import java.util.Scanner;
public class codforlan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Tu veux combien de numero ?");
		int choix = sc.nextInt();
		int tableau[] = new int [choix];
		for (int i = 0 ; i < choix; i++)
		{
			System.out.print("à l'emplacement " + i + " tape ton numero : " );
			int choix1 = sc.nextInt();
			tableau[i] = choix1; 
			System.out.println(tableau[i]); 
			//System.out.println("Les nombres que ta tapé sont : " + tableau[i]);
			
		}
		System.out.println("Les nombres que ta tapé sont : " + tableau);
	
	
	}		
}
