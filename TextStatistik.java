package lab2;
import java.io.*;
import java.text.DecimalFormat;

public class TextStatistik {
	private static DecimalFormat df = new DecimalFormat("0.00"); //Metod som används för att runda decimaltal till 2 decimaler
	public static void main(String[] args) throws IOException {
		// Läser in filen som gavs som första argument
		BufferedReader input = new BufferedReader(new FileReader(args[0]));
		String ALPHABET = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String SKILJETECKEN = "!,?.";
		String MENAVS = "!.?";
		String ORD = " \n";
		int bokstav = 0;
		int tecken = 0;
		int antMen = 0;
		int antOrd = 0;
		
		//tar in alla bokstäver i ascii från txt
		while(input.ready()) {
			//gör om till char
			char realChar = (char) input.read();
			//kallar på funktionen memberOf
			if(memberOf(realChar,ALPHABET)) {  //räknar ut antal bokstäver
				bokstav ++;
			}
			if(memberOf(realChar,SKILJETECKEN)) { // räknar ut antal skiljetecken
				tecken ++;
			}
			if(memberOf(realChar, MENAVS)) { // räknar ut antal meningar
				antMen ++;
			}
			if(memberOf(realChar, ORD)) { // räknar ut antal ord
				antOrd ++;
			}
		}
		float medOrd = (float) bokstav / (float) antOrd; // räknar ut medellängden per ord
		//skriver ut resultatet
		System.out.println("Antal bokstäver: " + bokstav);
		System.out.println("Antal skiljetecken: " + tecken);
		System.out.println("Antal meningar: " + antMen);
		System.out.println("Antal ord: " + antOrd);
		System.out.println("Medellängd på ord " + df.format(medOrd)); // omvandlar medOrd så att den har enbart 2 decimaler
}
	//Ska kolla om char hör till string, returnera sant eller falskt (våran metod)
	public static boolean memberOf(char realChar, String s) {
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == realChar ) // kollar om varje karaktär i char finns i stringen på varje index.
			{
			return true;
			}
		}
		return false;
		
		
		
		
	}
	
}

