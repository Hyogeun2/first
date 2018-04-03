package algorithm;

public class Fibonacci {

	public static void main(String[] args) {
		int a=1; //첫째항
		int b=1; //둘쨰항
		int c=0; //항을 옮길 때 도움을 줄 변수
		int hap=2; //합계
		int n = 8; //항의 갯수
		
		for (int i=3; i<=n;i++) {
			c = a+b;
			hap = hap + c;
			a=b;
			b=c;
			
			
		}
		System.out.println(hap);
	}

}
