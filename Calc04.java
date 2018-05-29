import java.util.Scanner;
public class Calc04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("num1?");
		int num1 = sc.nextInt();
		System.out.println("op?");
		String op = sc.next();
		System.out.println("num2?");
		int num2 = sc.nextInt();
		int num3 = 0;

		if(op.equals("+")){
			num3 = num1 + num2;
		}else if(op.equals("-")){
			num3 = num1 - num2;
		}else if(op.equals("*")){
			num3 = num1 * num2;
		}else if(op.equals("/")){
			num3 = num1 / num2;
		}else{
			num3 = num1 % num2;
		}

		System.out.println(num1 + op + num2 + " : " + num3);
	}
}