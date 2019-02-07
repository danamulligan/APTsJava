import java.util.HashSet;

public class Encryption {
	public String encrypt(String message){

		char counter = 'a';
		char[] cyph = new char[256];
		String encoded = "";
		
		for (int k=0; k<256; k++) {
			cyph[k] = ' ';
		}

		for (char ch : message.toCharArray()) {
			if(cyph[ch] == ' ') 
			{
				cyph[ch] = counter;
				counter++;
			}
			encoded += cyph[ch];
		}
		return encoded;
	}
}