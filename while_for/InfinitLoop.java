import java.util.Scanner;
public class InfinitLoop{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);

		while(true){
			System.out.println("0.stop 1.start");
			int flag = sc.nextInt();
			switch(flag){
				case 0:System.out.println("exit!");
					   return;
				case 1:System.out.println("order please!");
					   break;
				default:break;
			}
		}
		
	}
}