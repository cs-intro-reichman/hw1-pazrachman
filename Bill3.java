// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		 
		
		Double pricefor3 = Double.parseDouble(args[3]);
		 Double p =Math.ceil(pricefor3 /3);
		System.out.println("Dear " + name1 + ", " + name2 + ", " + name3 + " : pay " + p + " Shekels each.");

		
		
		


	}
}
