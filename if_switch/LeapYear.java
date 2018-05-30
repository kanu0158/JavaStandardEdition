import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("year?");
		int y = sc.nextInt();
		String result = "";
		if(y%400 == 0){
			result = "윤년";
		}else if(y%100 == 0){
			result = "평년";
		}else if(y%4 == 0){
			result = "윤년";
		}else{
			result = "평년";
		}

		System.out.println(y + "년은 "+ result + "입니다.");
	}
}