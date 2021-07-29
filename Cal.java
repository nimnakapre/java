import java.util.Scanner;

public class Cal{
		public static void main(String[] args) {
			System.out.println("Enter first number:");
			Scanner readinput=new Scanner(System.in);
			double a = readinput.nextDouble();
			
			System.out.println("Enter second number:");
			double b = readinput.nextDouble();
			
			System.out.println("Enter an operator:");
			char c = readinput.next().charAt(0);
			
			double result;
			switch(c){
				case '+':
					result = a + b; 
					break;
				case '-':
					result = a - b; 
					break;					
				case '*':
					result = a * b; 
					break;					
				case '/':
					result = a / b;
					break;
					
				default:
					System.out.println("Incorrect operator!");
					return;
			}
			System.out.println(a+" "+c+" "+b+" = "+result);
			

			
			
		}
}