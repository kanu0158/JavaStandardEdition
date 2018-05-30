import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 월?");
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

	}
}
/*
1 31/
2 28
3 31/
4 30//
5 31/
6 30//
7 31/
8 31/
9 30//
10 31/
11 30//
12 31/
*/