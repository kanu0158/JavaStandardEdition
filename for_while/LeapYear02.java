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
							result = "윤년";
						}else if(y%100 == 0){
							result = "평년";
						}else if(y%4 == 0){
							result = "윤년";
						}else{
							result = "평년";
						}

						System.out.println(y + "년은 "+ result + "입니다.");
						break;
			}
		}
	}
}