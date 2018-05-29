import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 ?");
		int num1;
		num1 = sc.nextInt();
		System.out.println("<OPCODE>");
		System.out.print("plus = 1   ");
		System.out.print("minus = 2   ");
		System.out.print("mul = 3   ");
		System.out.print("div = 4   ");
		System.out.println("mod = 5");
		int op;
		op = sc.nextInt();
		System.out.println("num2 ?");
		int num2;
		num2 = sc.nextInt();
		int num3;
		String opcode;

		if(op == 1){
			num3 = num1 + num2;
			opcode = "+";
		}else if(op == 2){
			num3 = num1 - num2;
			opcode = "-";
		}else if(op == 3){
			num3 = num1 * num2;
			opcode = "*";
		}else if(op == 4){
			num3 = num1 / num2;
			opcode = "/";
		}else{
			num3 = num1 % num2;
			opcode = "%";
		}
		
		System.out.println(num1 + opcode + num2 + " : " + num3);

		System.out.println("-----------------------------");
		System.out.println("swithch");
		switch(op){
			case 1:
				num3 = num1 + num2;
				break;
			case 2:
				num3 = num1 - num2;
				break;
			case 3:
				num3 = num1 * num2;
				break;
			case 4:
				num3 = num1 / num2;
				break;
			case 5:
				num3 = num1 % num2;
				break;
		}
		System.out.println(num1 + opcode + num2 + " : " + num3);
	}
}