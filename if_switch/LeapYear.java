import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("year?");
		int y = sc.nextInt();
		String result = "";
		if(y%400 == 0){
			result = "����";
		}else if(y%100 == 0){
			result = "���";
		}else if(y%4 == 0){
			result = "����";
		}else{
			result = "���";
		}

		System.out.println(y + "���� "+ result + "�Դϴ�.");
	}
}