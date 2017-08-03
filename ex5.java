import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Combien de lettre tu veux ? ");
		int lettre = sc.nextInt();
		sc.nextLine();
		String list[] = new String[lettre];
		int repete = 1;
		for(int i = 0 ; i < lettre ; i++ )
		
		{	
			System.out.print(" A l'emplacement " + (i + 1) + " ecris ta lettre : " );
			String lettre1 = sc.nextLine();
			list[i] = lettre1;	
		}
		while(repete == 1)	
		{	 System.out.print("Tu veux savoir la position de quel lettre ? ");
	         String position = sc.nextLine(); 
	         for (int i = 0; i < list.length ; i++)
	         {
	             if (list[i].equals(position))
	             {
	                 System.out.println("La position de "+ position + " est " + (i + 1));
	             }
	         }   
	         System.out.print("Tu veux refaire ? 1.O/2.N ");
	         repete = sc.nextInt();     
		}    
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
