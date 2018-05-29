import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 ?");
		int num1;
		num1 = sc.nextInt();
		System.out.println("<OPCODE>");
		String op;
		op = sc.next();
		System.out.println("num2 ?");
		int num2;
		num2 = sc.nextInt();
		int num3 = 0;
		String output = "";
		System.out.println("swithch");
		
		switch(op){
			case "+":
				num3 = num1 + num2;
				break;
			case "-":
				num3 = num1 - num2;
				break;
			case "*":
				num3 = num1 * num2;
				break;
			case "/":
				num3 = num1 / num2;
				break;
			case "%":
				num3 = num1 % num2;
				break;
			default:
				output = "error";
				break;
		}
		if(!output.equals("error")){
			output = num1 + op + num2 + " : " + num3;
		}
		System.out.println(output);
	}
}