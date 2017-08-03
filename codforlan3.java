
public class codforlan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tableau[] = {1,2,3,4};
		int somme;
		somme = 0;
		for(int i = 0; i < tableau.length; i++  )
		{	
			if(i == 0)
			{	
				somme = tableau[0];
			}	
			else
			{	
				 somme = somme + tableau[i];
			}
	
		}	
	
	
		System.out.print(somme);	
	
	}

}
