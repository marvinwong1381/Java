/* This is a password verifier to test
 * whether the password entered satisfy the below condition:
 * 1.The password must contain at least 10 characters
 * 2.The password must consist of only letters and digits
 * 3.The password must contain at least 2 digits
 */
import java.util.*;
import java.io.*;

class verify 
{
	public static void main(String args[]) 
	{
		verify obj = new verify();
		obj.password();
	}
    void password()
    {
    	int i,character=1,x,chara=0,Break=1,integer=0;
    	char ch;
    	Scanner sc= new Scanner(System.in);
    	while(Break!=0)
    	{
    		String str;
    		System.out.println("Enter Password=");
    		str=sc.nextLine();
    		System.out.println("Password is " + str + ".");
    		if(str.length()>=8)
    		{
    			character=1;
    			integer=0;
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
