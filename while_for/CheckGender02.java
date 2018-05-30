import java.util.Scanner;
public class CheckGender02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.stop 1.start");
			int flag = sc.nextInt();
			switch(flag){
				case 0: System.out.println("exit!");
						return;
				case 1: System.out.println("이름?");
						String name = sc.next();
						System.out.println("주민");
						String ssn = sc.next();
		
						char ch =ssn.charAt(7);

						if(ch=='0' || ch=='7' || ch=='8' || ch=='9'){
							System.out.println("다시입력하세요");
							break;
						} 


						String gender = "";

						switch(ch){
							case '1':
							case '3':gender = "남";break;
							case '2':
							case '4':gender = "여";break;
							case '5':
							case '6':gender = "외국인";break;
						}	
		
						System.out.println(name + " : " + ssn + " : " + gender);
						break;
				default:break;
			}
		}
	}
}