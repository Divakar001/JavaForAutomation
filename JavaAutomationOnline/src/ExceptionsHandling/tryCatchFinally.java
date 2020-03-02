package ExceptionsHandling;

/**
 * @author Divakar
 *
 */
public class tryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("im inside the try block");
			System.out.println(2/0);
			System.out.println("after exception");
			
		}
		catch(Exception e){
			System.out.println("im inside the catch block");
		}
		finally {
			System.out.println("Inside the finally block");
		}

	}

}
