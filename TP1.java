import java.util.Scanner;
public class TP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int repete = 1;	
		while(repete == 1)
		{	
			System.out.println("Choisissez le mode de conversion: ");
			System.out.println("1 - Convertir Celsius en Fahrenheit");
			System.out.println("2 - Convertir Fahrenheit en Celsius");
			int choix = sc.nextInt();
			System.out.print("Temperature à convertir : ");
			int temperature = sc.nextInt();
			if(choix == 1)				 
			{
				int fa;
				fa = 9 * temperature / 5 + 32;
				System.out.println(temperature + " correspond à " + fa);
				
			}
				
			if(choix == 2) 
			{	
				int ce;
				ce = (temperature - 32) * 5 / 9;
				System.out.println(temperature + " correspond à " + ce );
			
			
			
			}
			System.out.println("Souhaitez-vous convertir une autre température ? 1.Oui / 2.Non : ");
			repete = sc.nextInt();
			
		}
	
	}

}
