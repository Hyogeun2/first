package caculator;

public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 100000;
		
		int result1 = a* a / a ;
		int result2 = a / a * a ; 
		
		System.out.println("result1 ="+ result1);
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); 
		System.out.println("result2 ="+ result2);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);

	}

}
