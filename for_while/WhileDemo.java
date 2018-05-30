public class WhileDemo{
	public static void main(String[] args){
		int count = 1;
		String op = " + ";
		String result ="";
		int sum = 0;

		while(count < 11){
			sum += count;
			result += count ;
			if(count == 10){
				op = " = ";
			}
			result += op;
			count++;
		}
		System.out.print(result + sum);

	}
}