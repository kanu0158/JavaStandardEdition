import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("weight?");
		int w = sc.nextInt();
		System.out.println("tall?");
		int t = sc.nextInt();
		double dt = (double)t/100;
		double bmi = (double)w/(dt*dt);
		System.out.println("bmi = " + bmi);
		String result = "";
		if(bmi >= 35){
		 	result ="3단 비만";
		}else if(bmi >= 30 && bmi < 35){
			result ="2단 비만";
		}else if(bmi >= 25 && bmi < 30){
			result = "1단 비만";
		}else if(bmi >= 23 && bmi < 25){
			result ="비만 전단계";
		}else if(bmi >= 18.5 && bmi < 23){
			result = "정상";
		}else{
			result="저체중";
		}
		System.out.println(result);

	}
}