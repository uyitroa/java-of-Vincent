import java.util.Scanner;

public class exclass3 
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
		float smallest = smallestOf(nombre1 , nombre2 , nombre3);
		System.out.print("Le nombre le plus petit est " + smallest);
	}
	public static float smallestOf(float A , float B , float C)
	{
	
		float smallest = Math.min(B, C);
		float thesmallest = Math.min(A, smallest);
		return thesmallest;
	
	}
}
