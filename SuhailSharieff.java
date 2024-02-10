import java.util.*;
import java.lang.*;
import java.io.*;

public class SuhailSharieff
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter number of time u wanna test my code: ");
		int t=sc.nextInt();
		for(int v=0;v<t;v++){
		    System.out.println("enter your password: ");
		    String s=sc.next();
            int l=s.length();
            //a to z is 97 to 122
            char[]st=new char[l]; 
            for (int i = 0; i < l; i++) {
                st[i]=s.charAt(i);
            }
            if(l%2==0){
                for (int i = 0; i < (l); i+=2) {
                    char temp=st[i];
                    st[i]=st[i+1];
                    st[i+1]=temp;
                    
                }
            }else{
                for (int i = 0; i < st.length-1; i+=2) {
                    char temp=st[i];
                    st[i]=st[i+1];
                    st[i+1]=temp;
                    
                }
            }
            System.out.println("Yor secret code is: ");
            for (int i = 0; i < st.length; i++) {
               st[i]=(char)('a'+'z'-(int)(st[i]));
               
               System.out.print(st[i]);
            }
	    
		}

	}
}
