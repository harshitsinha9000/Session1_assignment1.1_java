//assignment 1.1
package java_session1;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no");
		a=sc.nextInt();
		
		System.out.println("Enter Second no");
		b=sc.nextInt();
		
		sum=a-(-b);
		System.out.println("Addition of tow nos ="+sum);

	}

}
