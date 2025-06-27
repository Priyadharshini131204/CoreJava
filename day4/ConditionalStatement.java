package day4;
import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mark");
		int mark= sc.nextInt();
		if (mark>=35){
			System.out.println("you are Pass");
		}
		else if (mark<0 && mark<100){
			System.out.println("invalid");
		}
		else{
			System.out.println("you are Fail");
		}
		
		
			
		}
	}


