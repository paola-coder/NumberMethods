package Loops;

	public class NumberMethods {
		
		public static boolean isPrime(int num) {
			//num>1, u will need a loop
			boolean prime = true;
			for ( int count = 2; count < num ; count++ ) {
				if ( num % count==0) {
					prime = false;
					count = num;
				// exits loop
				}
				
			}
			//This method should set prime true if num is prime.
			//This method should set prime false if num is composite.
			//This method should return isPrime;
			//write code that determines number is prime; number divisible by one and itself
			//
			return prime;
		}
		
		public static int divisorSum(int num) {
			int sum = 0;
			for (int count = 1; count < num; count++ ) {
				if ( num % count ==0) {
					sum = sum + count;
				}
			}
			/*
			This method should return the sum of all of the divisors of n
			if divisorSum(8) is called, a value of 7 should be returned because
			the proper divisors of 8 are 1, 2, and 4., adds divisors
			*/
			
			return sum;
		}
		
		public static boolean isStrong(int num) {
			boolean strong = false;
			if(isPrime(num)== false ) {
				if (num > divisorSum(num)) {
					strong =true;
				}
			}
			/*
			 A number is considered strong if it is:
			 1) Greater than the sum of its divisors
			 2) A composite number
			 */
			//isStrong(8)
			/*
			 A number is considered weak if it is:
			 1) Less than the sum of its divisors
			 2) A composite number
			 */
			
			/*
			 * This method should check if n is strong.
			 * The call isStrong(8) should return true because 8 > (1 + 2 + 4) = 7
			 * The call isStrong(12) should return false because 12 < (1 + 2 + 3 + 4 + 6) = 16
			 */
			
			//This method MUST use the divisorSum and isPrime method
			
			return strong;
		}
		
		public static void printDivisors(int num) {
			 for (int count = 1;count < num;count++) {
				 if (num % count==0) {
					 System.out.print(count+ " ");
				 }
			 }
			/*
			 This method should print the divisors of n (not including n)
			 on a single line.
			 If printDivisors(12) is called, 1 2 3 4 6		should be printed.
			 */
			 System.out.println(" ");
		}
		
		public static void printPrimes(int num) {
			for (int count = 2; count < num; count++ ) {
				if (isPrime(count)==true) {
					System.out.print(count+ " ");
				}
			}
			//This method prints all prime numbers less than n on a single line
			//The call printPrimes(30) should print 2 3 5 7 11 13 17 19 23 29
			//This method MUST use the isPrime method
			//
			System.out.println(" ");
		}
		
		public static void printComposites(int num) {
			for (int count = 2; count < num ; count++ ) {
				if (isPrime(count)==false) {
					System.out.print(count+ " ");
				}
				
			}
			System.out.println(" ");
			//This method prints all composite numbers less than n on a single line
			//The call printComposites(30) should print 4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 
			//This method MUST use the isPrime method
		}
		
		public static void printStrong(int num) {
			for (int count=1; count < num; count++) {
				if (isStrong(count)==true) {
					System.out.print(count+ " ");
				}
			}
			//This method prints all the strong numbers less than n on a single line
			//The call printStrong(30) should print 4 8 9 10 14 15 16 21 22
			//ask martin if those r all numbers
			//This method MUST use the isStrong method
			System.out.println(" ");
		}
		
		public static void printWeak(int num) {
			for (int count=1; count < num; count++) {
				if (isPrime(count)==false) {
					if (isStrong(count)==false) {
					System.out.print(count + " ");
				
					}
				
				}
			}
			System.out.println(" ");
			//This method prints all the weak numbers less than n on a single line
			//The call printWeak(30) should print 6 12 18 20 24 28
			//This method MUST use the isStrong method
		}

			
		
		
		public static void main(String[] args) {
			printComposites(30);
			printPrimes(30);
			printStrong(30);
			printWeak(30);
//			
// ask if he wants divisors printed !
			//
		}

	}

