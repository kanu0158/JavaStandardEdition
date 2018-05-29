import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How much?");
		int price = 0;
		price = sc.nextInt();
	 	System.out.println(price +" won.");
	 	System.out.println("How many?");
	 	int num = 0;
	 	num = sc.nextInt();
	 	System.out.println(num+" number please");
	 	int sum = price * num;
	 	System.out.println("total " + sum + " won");
	 	System.out.println("Too expensive DC please");
	 	System.out.println(" %DC?");
	 	int dc = 0;
	 	dc = sc.nextInt();
		String output = "NONO";
	 	
	 	if(dc < 10){
	 		output = sum * (100 - dc)/100 + "won";
	 	}

	 	System.out.println(output);
	}
}