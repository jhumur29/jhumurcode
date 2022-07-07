package java_practice;

public class reversewithspaceSequence {
	
	//input =my name is mohammed   output=demmahoM is eman yM
	static void revStr(String x) {
		
		StringBuffer sb=new StringBuffer(x);
		String reverse= sb.reverse().toString();
		System.out.println(x+" -->"+reverse);
		
	}
	
	public static void main(String[] args) {
		reversewithspaceSequence.revStr("united states of america");
	}
	

}
