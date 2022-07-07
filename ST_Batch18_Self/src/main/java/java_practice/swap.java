package java_practice;

public class swap {
	//public static void main(String[] args) {
		public void getSwap(int a,int b) {
			
			System.out.println("before swap a value="+a);
			System.out.println("Before swap b value="+b);
	a=a+b;
		b=a-b;
			a=a-b;
			System.out.println("after swap a value="+a);
			System.out.println("after swap a value="+b);
		
	}

		public static void main(String[] args) {
			swap obj=new swap();
			obj.getSwap( 10, 20);
		}
		
}
