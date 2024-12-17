package unit3;

/**
Name: Gavin Chester
Date: 2024/12/17
Description: The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.
*/

public class MathPlus {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Returns the distance between two points in a 2D coordinate system
     * @param x1 -> the x-coordinate of the first point
     * @param y1 -> the y-coordinate of the first point
     * @param x2 -> the x-coordinate of the second point
     * @param y2 -> the y-coordinate of the second point
	 * @return the distance between the two points
	 */
		
	public static double distance(double x1, double y1, double x2, double y2) {       
			    return Math.sqrt(Math.pow(y2 - y1,2) + Math.pow(x2 - x1,2));
			}
	
	/**
	 * Returns the hypotenuse of a triangle given the lengths of the other two sides.
     * @param x1 -> the x-coordinate of one vertex
     * @param y1 -> the y-coordinate of one vertex
     * @param x2 -> the x-coordinate of another vertex
     * @param y2 -> the y-coordinate of another vertex
     * @return the hypotenuse of the triangle
	 */
	
	public static double hypotenuse(double x1, double y1, double x2, double y2) {     
	    double ac = Math.abs(y2 - y1);
	    double cb = Math.abs(x2 - x1);
	        
	    return Math.hypot(ac, cb);
	}
	
    /**
     * Returns the number of factors of the given number.
     * @param number - the number to find factors for
     * @return the number of factors of the input number
     */

	public static int numOfFactors(int nunber) { 
		for (int number = 1; number <= number; number++) {
			   if (number % number == 0) {
				return number;   
			  
			  
			   }
			   return 2;
		}
	}

    /**
     * Returns true if the given number is prime, and false otherwise.
     * @param number - the number to check if prime or not
     * @return true if the number is prime, false otherwise
     */

	public static boolean isPrime(int number) {
		if (number <= 1)
            return false;
//        for (int n = 2; number < number; number++){
//            if (number % number == 0)
//                return false;

        return true;
        
        }
        
	}
	
//}

	

			   
	
	
		

