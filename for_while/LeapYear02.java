import java.util.Scanner;
public class LeapYear02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.stop 1.start");
			
			switch(sc.nextInt()){
				case 0:System.out.println("exit!");return;
				case 1:
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
						break;
			}
		}
	}
}