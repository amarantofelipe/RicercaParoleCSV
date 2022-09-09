import java.util.Base64;

public class Base {
		
	public String encode(String esempio) {
		
		Base64.Encoder enc = Base64.getEncoder();
		String encoded = enc.encodeToString(esempio.getBytes());
		return encoded;
	}
		
	public String decoded(String encoded) {
		
		Base64.Decoder dec = Base64.getDecoder();
		String decoded = new String(dec.decode(encoded));
		return decoded;
	}
	
	public boolean check(String esempio, String codice) {
		
		boolean cerca = false;
		
		String [] str = esempio.split(";");
		
		for (int i=0; i<str.length; i++) {
			
			if (str[i].equalsIgnoreCase(codice)) {
				
				cerca = true;
			}
		}
		return cerca;
	}
}
