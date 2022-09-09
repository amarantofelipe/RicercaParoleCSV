
public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABILE
		String esempio = "djdhdjdj; esempio;cod-13;AC22;10-10-1999";
		String codice = "AC22";
		boolean cerca = false;
		
		//METHD
		Base base = new Base();
		
		
		//CODING STRING
		System.out.println("Il testo codificato e:  " + base.encode(esempio));
		
		//DECODING STRING
		System.out.println("Il testo decodificato e:  " + base.decoded(base.encode(esempio)));
		
		
		//CHECKING COD
		if (base.check(esempio, codice)) {
			
			System.out.println("Il codice e presente");
		} else {
			
			System.out.println("Il codice non e presente");
		}
		
	}

}
