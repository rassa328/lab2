package lab2;
import java.util.*;

public class GissaTalet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);		
		int tal1 = -1;
		
		while (tal1 < 0 || tal1 > 100)
		{
		System.out.println("Mata in ett värde mellan 0 och 100");
		tal1 = in.nextInt();
		}
		
		for(int i = 0; i < 50; i++)
		{
			System.out.println();
		}
	    
		System.out.println("Gissa talet");
		int tal2 = in.nextInt();
		int antGiss = 1;
		while (tal2 != tal1)
		{
			if (tal2 < tal1)
			{
				System.out.println("Du gissade för lågt försök igen");
			}
			else if (tal2 > tal1)
			{
				System.out.println("Du gissade för högt försök igen");
			}
			antGiss++;
			tal2 = in.nextInt();
			
		}
		
		System.out.println("Du gissade rätt på " + antGiss + " försök");
		
		
	}

}
