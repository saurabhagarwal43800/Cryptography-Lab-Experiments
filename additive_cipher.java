//A Java Program to illustrate Caesar Cipher Technique 
import java.util.*;
class AdditiveCipher
{ 
	public static StringBuffer encrypt(String text, int s) 
	{ 
		StringBuffer result= new StringBuffer(); 

		for (int i=0; i<text.length(); i++) 
		{ 
			if (Character.isUpperCase(text.charAt(i))) 
			{ 
				char ch = (char)(((int)text.charAt(i) + 
								s - 65) % 26 + 65); 
				result.append(ch); 
			} 
			else
			{ 
				char ch = (char)(((int)text.charAt(i) + 
								s - 97) % 26 + 97); 
				result.append(ch); 
			} 
		} 
		return result; 
	}

	public static String decrypt(String Encrypted, int Shift) {
		
	
		String solved = "";
		
		
		System.out.println(Encrypted.length());
		
		for (int i = 0; i < Encrypted.length(); i++) {
			char C = Encrypted.toUpperCase().charAt(i); 	
			if(C == ' ' ) {
				System.out.print(" ");
				solved += C;
				} 
			else {
					C = (char)(((int)C - Shift + 65) % 26 + 65);
					System.out.print(C);
					solved += C;
				} 
			
		} 
		
		return solved;
		
	}	

	// Driver code 
	public static void main(String[] args) 
	{  Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the plain text: ");
	   String text = sc.nextLine();
		System.out.print("Enter the key: ");
		int s = sc.nextInt();
		System.out.println("Enter 1 for encryption: \nEnter 2 for decryption: ");
		
		 int choice = sc.nextInt();
		System.out.println("Text  : " + text); 
		System.out.println("Shift : " + s); 
		if(choice == 1)
		{
		System.out.println("Encrypt: " + encrypt(text, s)); 
		}else
		{
			 decrypt(text,s);
		}
	} 
} 
