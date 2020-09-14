//to implement vigenere cycle  Cryptography and network security

import java.util.*;
class Vignere 
{ 

static String generateKey(String str, String key) 
{ 
	int x = str.length(); 

	for (int i = 0; ; i++) 
	{ 
		if (x == i) 
			i = 0; 
		if (key.length() == str.length()) 
			break; 
		key+=(key.charAt(i)); 
	} 
	return key; 
} 


static String cipherText(String str, String key) 
{ 
	String cipher_text=""; 

	for (int i = 0; i < str.length(); i++) 
	{  char space = ' ';
		if(str.charAt(i) == ' '){
			
			cipher_text += space;
		}
		else
		{		int x = (str.charAt(i) + key.charAt(i)) %26; 

		 
		x += 'A'; 

		cipher_text+=(char)(x); 
		}
	} 
	return cipher_text; 
} 


static String originalText(String cipher_text, String key) 
{ 
	String orig_text=""; 

	for (int i = 0 ; i < cipher_text.length() && 
							i < key.length(); i++) 
	{ 
		char space = ' ';
		if(cipher_text.charAt(i) == ' ')
			orig_text+= space;
		else{
		int x = (cipher_text.charAt(i) - 
					key.charAt(i) + 26) %26; 

		 
		x += 'A'; 
		orig_text+=(char)(x); 
		}
	} 
	return orig_text; 
} 


public static void main(String[] args) 
{ 


Scanner sc = new Scanner(System.in);
System.out.print("Enter the text: ");
String str = sc.nextLine();
System.out.print("Enter the keyword: ");
String Keyword = sc.nextLine();

	

	String key = generateKey(str,Keyword); 
	 
	System.out.println("  Enter\n  1 for Encryption \n  2 for Decryption");
	int choice = sc.nextInt();
	
	if(choice == 1)
	{
       String cipher_text = cipherText(str, key);
	System.out.println("ENCRYPTED : "
		+ cipher_text + "\n"); 
	}
    else{
	System.out.println("DECRYPTED : "
		+ originalText(str, key));
	}		
	} 
} 


