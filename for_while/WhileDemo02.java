import java.util.Scanner;
public class WhileDemo02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("first input?");
		int n1 = sc.nextInt();
		System.out.println("second input?");
		int n2 = sc.nextInt();

		int big=0, small=0;

		if(n1>n2){
			big = n1;
			small = n2;
		}else{
			big = n2;
			small = n1;
		}
		/*
		if(num1 > num2){//swap  
			temp = num1;
			num1 = num2;
			num2 = temp;
		}*/
		String result = "";
		String op = "+";
		int count = small;
		int sum = 0;

		while(count<=big){
			if(count == big){
				op=" = ";
			}
			
			result += count + op;
			sum += count;
			count++; 
		}
		System.out.print(result+sum);

	}
}