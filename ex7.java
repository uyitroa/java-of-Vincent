import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int repete = 1;
		int resultat = 0;
		//while(repete == 1)	
		System.out.println("Choisi option: "); //Demande au user de choisir dans l'une des options disponible
		System.out.println("1. + ");
		System.out.println("2. - ");
		System.out.println("3. x ");
		System.out.println("4. / ");
		int option = sc.nextInt(); //User choisit option
		if (option == 1) //si il choisi l'option 1
		{	
			System.out.print("Cb de nombre veux-tu ? "); //Demander au user de chosir le nombre de nombre qu'il veut 		
			int nombre = sc.nextInt(); //User choisit cb de nombre il veut
			int list[] = new int[nombre]; //affiche les operations a faire print 
			for(int i = 0 ; i < list.length ; i++) //demander plusieurs fois les nombres a l'emplacmen t user veut
			{	
				System.out.print(" A l'emplacement " + i + " ecris ton nombre : "); 
				int nombrejoueurinput = sc.nextInt(); //user ecrit les nombre qu'il veut pour pouvoir additoner 
				list[i] = nombrejoueurinput; //pour pouvoir enregistrer nombre ds list
				resultat = list[i] + resultat; //a calculer les nombre que user a ecrit 
				//System.out.print(resultat);
			}	
			System.out.print("Le resultat de ");
			for(int f = 0 ; f < list.length ; f++) //afficher le calcul 
			{	
				if(f < nombre - 1 ) //permet de eviter que il affiche un + apr le drn nb lst 
				{
					System.out.print(list[f] + " + " );
				}
				
			}
			System.out.print(list[nombre - 1]);
			System.out.printf(" est de ");
			System.out.print(resultat);
		
		}
		if (option == 2)
		{
			System.out.print("Cb de nombre veux-tu ? ");		
			int nombre1 = sc.nextInt();
			int list[] = new int[nombre1];
			for(int a = 0 ; a < nombre1 ; a++)	
			{	
				System.out.print(" A l'emplacement " + a + " ecris ton nombre : ");
				int position1 = sc.nextInt();
				list[a] = position1;
				resultat = list[a] - resultat;
			}	
			System.out.print("Le resultat de ");
			for(int c = 0 ; c < list.length ; c++)
			{	
				System.out.print(list[c]);
				if(c < nombre1 - 1 )
				{
					System.out.print(" - " );
				}
				
			}
			//System.out.print(list[nombre1 - 1]);
			System.out.printf(" est de ");
			System.out.print(resultat);
			
		}		
		//System.out.println("On est dehors du condtion, essaie de entrer");
		if (option == 3)
		{	
			//System.out.println("on est dedans du condition");
			System.out.print("Combien de nombre veux-tu ?");
			int nombre2 = sc.nextInt();
			int list[] = new int[nombre2];
			//System.out.println("On est dehors de la boucle, essaie de entrer");
			//System.out.println("Nombre2: " + nombre2 + "  o: 0 ");
			for (int o = 0 ; o < nombre2 ; o++)
			{	
				//System.out.println("On est dedans de la boucle");
				System.out.print("A l'emplacement " + o + " ecris ton nombre : ");
				int position2 = sc.nextInt();
				list[o] = position2;
				//System.out.println("On est dehors du condition");
				if(o == 0)
				{
					//System.out.println("On est dedans du condition, dans le if");
					//System.out.println("Resultat avant de calculer dans if: " + resultat);
					resultat = list[o];
					//System.out.println("Resultat dans if: " + resultat);
				}
				else
				{	
					//System.out.println("On est dedans du condition, dans le else");
					//System.out.println("Resultat avant de calculer dans else: " + resultat);
					resultat = resultat * list[o];
					//System.out.println("Resultat dans else: " + resultat);
				}	
			
			
			}	
			System.out.print("Le resultat de ");
			for(int k = 0 ; k < list.length ; k++)
			{	
				if(k < nombre2 - 1)
				{	
					System.out.print(list[k] + " x " );
				}	
			
			}	
			System.out.print(list[nombre2 - 1]);
			System.out.print(" est de ");
			System.out.println(resultat);
			//System.out.print(140);
			//System.out.print(list);
			//System.out.print(105);
		}	
		if (option == 4)	
		{		
			System.out.print("Combien de nombre veux-tu ?");
			int nombre3 = sc.nextInt();
			int list[] = new int[nombre3];
			for (int z = 0 ; z < nombre3 ; z++)
			{	
				System.out.print("A l'emplacement " + z + " ecris ton nombre : ");
				int position3 = sc.nextInt();
				list[z] = position3;
				if (z == 0)
				{
					resultat = list[z];
				}
				else
				{
					resultat = resultat / list[z];
				}
			}	
			System.out.print("Le resultat de ");	
			for(int u = 0 ; u < list.length ; u++)
			{
				if(u < nombre3 - 1)
				{	
					System.out.print(list[u] + " / ");
				}	
			
			}
			System.out.print(list[nombre3 - 1]);
			System.out.print("est de ");
			System.out.print(resultat);
		}
	
	}

}