import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�?");
		String name = sc.next();
		System.out.println("�ֹ�");
		String ssn = sc.next();
		
		char ch =ssn.charAt(7);

		if(ch=='0' || ch=='7' || ch=='8' || ch=='9'){
			System.out.println("�ٽ��Է��ϼ���");
			return;
		} 


		String gender = "";

		switch(ch){
			case '1':
			case '3':gender = "��";break;
			case '2':
			case '4':gender = "��";break;
			case '5':
			case '6':gender = "�ܱ���";break;
		}
		/*
		if(ch == '1' || ch =='3'){
			gender = "��";
		}else if(ch == '2' || ch == '4'){
			gender = "��";
		}else if(ch == '5' || ch == '6'){
			gender = "�ܱ���";
		}
*/
		System.out.println(name + " : " + ssn + " : " + gender);
	}
}