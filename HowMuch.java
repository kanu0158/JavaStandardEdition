import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�󸶿���?");
		int price = 0;
		price = sc.nextInt();
	 	System.out.println(price +"���Դϴ�.");
	 	System.out.println("� �帱���");
	 	int num = 0;
	 	num = sc.nextInt();
	 	System.out.println(num+"�� �ּ���");
	 	int sum = price * num;
	 	System.out.println("�� �ݾ��� " + sum + "�� �Դϴ�.");
	 	System.out.println("��ο� ����ּ���");
	 	System.out.println("�� �ۼ�Ʈ DC �ұ��?");
	 	int dc = 0;
	 	dc = sc.nextInt();
	 	String output = "";
	 	if(dc >= 10){
	 		output = "���Ⱦƿ�";
	 	}else {
	 		int result = sum * (100 - dc)/100;
	 		output = result + "�� �Դϴ�.";
	 	}

	 	System.out.println(output);
	}
}