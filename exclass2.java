import java.util.*;
public class exclass2 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);	
	System.out.print("Ecris ton premier nombre : ");
	float nombre1 = sc.nextFloat();
	System.out.print("Ecris ton deuxieme nombre : ");
	float nombre2 = sc.nextFloat();
	System.out.print("Ecris ton troisieme nombre : ");
	float nombre3 = sc.nextFloat();
	float resultat = moyenneDe(nombre1 , nombre2 , nombre3);
	System.out.print("La moyenne est de " + resultat);
	}	
	
	public static float moyenneDe(float A , float B , float C )
	{
		float moyenne = (A + B + C) / 3; 
		return moyenne;
	}

}

