
public class StringClassDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		//String : It is one of the prebuilt class in java.
		//Two types of defining a string.
		
		/* 1 String literals
		   2. By creating object of string */
		
		String a= " javatraining"; //String where variable "a" acts as object as well as variable.
		
		System.out.println(a.charAt(2));
        System.out.println(a.indexOf("h"));
        System.out.println(a.substring(3, 6));
        System.out.println(a.substring(5));
        System.out.println(a.concat("going good"));
		//length
        System.out.println(a.length());	
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		//Split
		String arr[]= a.split("t");
		System.out.println (arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
	
	}

}
