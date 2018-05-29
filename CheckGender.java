import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름?");
		String name = sc.next();
		System.out.println("주민");
		String ssn = sc.next();
		
		char ch =ssn.charAt(7);

		if(ch=='0' || ch=='7' || ch=='8' || ch=='9'){
			System.out.println("다시입력하세요");
			return;
		} 


		String gender = "";
		if(ch == '1' || ch =='3'){
			gender = "남";
		}else if(ch == '2' || ch == '4'){
			gender = "여";
		}else if(ch == '5' || ch == '6'){
			gender = "외국인";
		}

		System.out.println(name + " : " + ssn + " : " + gender);
	}
}