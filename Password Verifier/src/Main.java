/* This is a password verifier to test
 * whether the password entered satisfy the below condition:
 * 1.The password must contain at least 10 characters
 * 2.The password must consist of only letters and digits
 * 3.The password must contain at least 2 digits
 */
import java.util.*;
import java.io.*;
import java.util.Random;
class verify
{
   void password(String pw)
  {
    	int i,character=1,chara=0,Break=1,integer=0;
    	char ch;
    	while(Break!=0)
    	{
    		String str;
    		str=pw;
    		if(str.length()>=8)
    		{
    			for(i=0;i<str.length();i++)
    			{
    				ch=str.charAt(i);
    				System.out.print(""+ch);
    				if (ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='-'||ch=='_'||ch=='+'||ch=='='||ch==','||ch=='.'||ch=='?'||ch=='>'||ch=='?'||ch=='['||ch==']'||ch=='{'||ch=='}')
    				{
    					character=0;
    					chara++;
    				}
    				else if(ch=='0'||ch=='1'|| ch=='2'|| ch=='3'|| ch=='4'|| ch=='5'|| ch=='6'|| ch=='7'|| ch=='8'||ch=='9')
    				{
    					integer++;
    				}
    				else {}
    	
    			}
    		}
    		else
        	{
        		System.out.println("The entered password is too short");
        	}
    		if(character==0||integer<2)
    		{
    			System.out.println("\n*The entered password must contain at least 10 characters and at least 2 numbers only\n\n");
    			break;
    		}
    		else
    		{
    			System.out.println("\n\t------------");
    			System.out.println("The password is valid\t");
    			System.out.println("\t------------");
    			Break=0;
    		}
    	}
    }    
  }
class generator
  {
	  char[] generatePswd(int len)
	  {
		  System.out.println("Your Password:");
		  String charsCaps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		  String chars="abcdefghijklmnopqrstuvwxy";
		  String nums="123456789";
		  
		  String passSymbols = charsCaps + chars +nums;
		  Random rnd = new Random();
		  char[] password = new char[len];
		  int index = 0;
		  for(int i= 0; i<len;i++) 
		  {
			  password[i]=passSymbols.charAt(rnd.nextInt(passSymbols.length()));
		  }
		  return password;
	  }
   }
  
public class Main
 {
  public static void main(String args[]) 
	{
	    generator pw1=new generator();
	    String str = String.valueOf(pw1.generatePswd(10));
	    verify obj= new verify();
	    obj.password(str);
	}
 }

