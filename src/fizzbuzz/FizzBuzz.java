package fizzbuzz;

public class FizzBuzz {
	
	static int [] valeur = {3, 5} ;
	static String [] mot = {"fizz" , "buzz"} ;
	
	
	public static String fizzbuzz (int entree) {
		StringBuilder resultat = new StringBuilder () ; 
		
		for (int i = 0 ; i < valeur.length ; i ++ ) {
			if (entree % valeur [i] == 0) 
				resultat.append(mot[i]) ;
		}
		
		if (resultat.length() == 0) 
			return Integer.toString(entree) ;
		else 
			return resultat.toString() ;	
	
	}
}

	