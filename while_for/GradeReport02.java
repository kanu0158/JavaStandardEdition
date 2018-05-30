import java.util.Scanner;
public class GradeReport02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("0.stop 1.start");
			int flag = sc.nextInt();
			switch(flag){
				case 0: System.out.println("exit!");
						return;
				case 1: System.out.println("name? ");
						String name = sc.next();
						System.out.println("Korean score?");
						int ks = sc.nextInt();
						if(ks<0 || ks >100){
							System.out.println("korean score error");
							break;
						}
						System.out.println("English score?");
						int es = sc.nextInt();
						if(es<0 || es >100){
							System.out.println("English score error");
							break;
						}
 						System.out.println("Math score?");
						int ms = sc.nextInt();
						if(ms<0 || ms >100){
							System.out.println("Math score error");
							break;
						}

						int avg = (ks+es+ms)/3;
						String grade = "";

						if(avg >= 90){
							grade = "A";
						}else if(avg >= 80){
							grade = "B";
						}else if(avg >= 70){
							grade = "C";
						}else if(avg >= 60){
							grade = "D";
						}else{
							grade = "F";
						}

						System.out.println(name + " [avg] " + avg + " [grade] " + grade);
						break;
				default:break;
			}
		}

	}
}