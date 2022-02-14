/**
 * 
 */
package prerequisites;

/**
 * @author nopalfi
 * This is some example of ExceptionHandling works.
 * In this class i write some specific Exception Error.
 * 'try' keyword will try to execute the code inside it, and will throw exception if its caught one.
 * We can also use 'Exception e' if we don't want to specify the exception type.
 * 'finally' keyword will always get executed no matter what type of exception that got caught.
 *
 */
public class ExceptionHandlingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("0 / 1 = "+0 / 1);
			System.out.println("1 / 0 = "+1 / 0);
			System.out.println("0 / 0 = "+0 / 0);
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[3]);
		} catch (ArithmeticException e) {
			System.err.println("Error ArithmeticException caught : "+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error ArrayIndexOutOfBoundsException caught : "+e.getMessage());
		} finally {
			System.out.println("This section will always be executed.");
		}
	}

}
