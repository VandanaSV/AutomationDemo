import java.util.*;
public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String for reversal");
		String str=sc.next();
		sc.close();
		String newstr="";
		for (int i=str.length()-1;i>=0;i--)
		{
			
			newstr=newstr+str.charAt(i);
			
		}
		System.out.println("\n"+"ReversedString: "+newstr);
	}

}
