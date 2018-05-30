import java.util.Scanner;
public class MonthEndday02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.stop 1.start");
			switch(sc.nextInt()){
				case 0:System.out.println("exit!");return;
				case 1: System.out.println("몇 월?");
						int mon = sc.nextInt();
						String end = "";
						switch(mon){
							case 1:
							case 3:
							case 5:
							case 7:
							case 8:
							case 10:
							case 12:end = "31";break;
							case 4: 
							case 6:
							case 9:
							case 11:end = "30";break;
							case 2:end = "28";break;
						}
						System.out.println(mon + "월의 말일은 " + end +"일 입니다.");
						break;
			}
		}
		
	}
}