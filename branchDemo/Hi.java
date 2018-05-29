import java.util.Scanner;
public class Hi{
	public static void main(String[] args){
		System.out.print("이름은?  ");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.print("안녕하세요 " + n);
	}
}