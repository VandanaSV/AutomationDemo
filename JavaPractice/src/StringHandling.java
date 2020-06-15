
public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Geeks"; 
        concat1(s1);  // s1 is not changed 
        System.out.println("String: " + s1); 
  
        StringBuilder s2 = new StringBuilder("Geeks"); 
        concat2(s2); // s2 is changed 
        System.out.println("StringBuilder: " + s2); 
  
        StringBuffer s3 = new StringBuffer("Geeks"); 
        concat3(s3); // s3 is changed 
        System.out.println("StringBuffer: " + s3); 

	}
	public static void concat1(String s1) 
    { 
        s1 = s1 + "forgeeks"; 
        System.out.println("Inside concat"+s1);
       
    } 
  
    // Concatenates to StringBuilder 
    public static void concat2(StringBuilder s2) 
    { 
        s2.append("forgeeks"); 
        System.out.println("Inside concat"+s2);
    } 
  
    // Concatenates to StringBuffer 
    public static void concat3(StringBuffer s3) 
    { 
        s3.append("forgeeks"); 
        System.out.println("Inside concat"+s3);
    } 

}
