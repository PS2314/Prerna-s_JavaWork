package testCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;

public class EncodeDecode {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//Encoded
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your password which needs to be encoded");
		String originalInput = reader.readLine();
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		System.out.println("Encoded Password is: '"+ encodedString+"'");
		
		//Decoded 
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		String decodedString = new String(decodedBytes);
		System.out.println("Decoded Password is: '"+ decodedString +"'");

	}

}
