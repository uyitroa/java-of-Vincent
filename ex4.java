import java.util.*;
public class ex4 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.print("Ecris un nbr ");
		String nombre = sc.nextLine();
		int somme = sommeChiffres(nombre);
		System.out.print("Le resultat est " + somme);
	}
	public static int sommeChiffres(String A)
	{
		int list[] = new int[A.length()]; 
		int somme = 0;
		for(int i = 0 ; i < A.length() ; i++ )
		{	
			char trouverChiffre = A.charAt(i); 
			int convertint = Character.getNumericValue(A.charAt(i));
			list[i] = convertint;
			somme = somme + convertint;
		}	
		return somme;
	}	

}
