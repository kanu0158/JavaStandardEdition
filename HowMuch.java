import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("얼마에요?");
		int price = 0;
		price = sc.nextInt();
	 	System.out.println(price +"원입니다.");
	 	System.out.println("몇개 드릴까요");
	 	int num = 0;
	 	num = sc.nextInt();
	 	System.out.println(num+"개 주세요");
	 	int sum = price * num;
	 	System.out.println("총 금액은 " + sum + "원 입니다.");
	 	System.out.println("비싸요 깍아주세요");
	 	System.out.println("몇 퍼센트 DC 할까요?");
	 	int dc = 0;
	 	dc = sc.nextInt();
	 	String output = "";
	 	if(dc >= 10){
	 		output = "안팔아요";
	 	}else {
	 		int result = sum * (100 - dc)/100;
	 		output = result + "원 입니다.";
	 	}

	 	System.out.println(output);
	}
}