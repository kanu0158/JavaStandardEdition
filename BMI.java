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
		 	result ="3�� ��";
		}else if(bmi >= 30 && bmi < 35){
			result ="2�� ��";
		}else if(bmi >= 25 && bmi < 30){
			result = "1�� ��";
		}else if(bmi >= 23 && bmi < 25){
			result ="�� ���ܰ�";
		}else if(bmi >= 18.5 && bmi < 23){
			result = "����";
		}else{
			result="��ü��";
		}
		System.out.println(result);

	}
}