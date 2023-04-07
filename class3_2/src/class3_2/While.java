package class3_2;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		//input a int
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int digitsCount = 0;
		int digitNum;
		int result = 0;
		//find digits _while loop
		do 
		{
			digitNum = num % 10;
			num = num / 10;
			digitsCount++;
//			System.out.println(digitsCount);
			System.out.println(digitNum +  " " + digitsCount);
			//数字奇偶	
			if((digitNum % 2 == 0 && digitsCount % 2 == 0) 
				||(digitNum % 2 == 1 && digitsCount % 2 == 1) ) {	
				result +=  (int)Math.pow(2,(digitsCount-1));
				System.out.println(result);
			}
		} while(num > 0);
		//find each number at the digit
//		System.out.println("Digit Count: " + digitsCount);
		System.out.println(result);
//		System.out.println(digitNum);
//		do 
//		{
//			digitNum = num % 10;
//			
//		} while(digitNum > 0);
//		System.out.println(digitNum);
	}

}
