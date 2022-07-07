package java_practice;

public class fibonaccisequence{
	
	public static void main(String[] args) {
		
		int num=0;
		int num2=1;
		for(int i=0;i<=10;i++) {
			int temporary=num+num2;
			System.out.print(temporary+" ");
			num=num2;
			num2=temporary;
		}
		
	}

}
