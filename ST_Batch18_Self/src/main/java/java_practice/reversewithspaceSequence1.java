package java_practice;

public class reversewithspaceSequence1 {
	
static void revStr(String x) {
		
		StringBuffer sb=new StringBuffer(x);
		String reverse= sb.reverse().toString();
		System.out.println(x+" -->"+reverse);
		
	}

  static void revwithSpsSeq(String x) {
	  String nospace=x.replaceAll(" ","");
	  StringBuffer sb=new StringBuffer(nospace);
	  String reverse=sb.reverse().toString();
	  
	  char[] revArray=reverse.toCharArray();
	  char[] result=new char[x.length()];
	  System.out.println("Input");
	  System.out.println(x);
	  System.out.println("output");
	  int j=0;
	  for(int i=0;i<x.length();i++) {
		  if(x.charAt(i)==' ') {
			  result[i]=' ';
		  }
		  else if(x.charAt(i)!=' ') {
			  result[i]=revArray[j];
			  j++;
		  }
		  System.out.print(result[i]);
	  }
	  
  }
	
	public static void main(String[] args) {
	//reversewithspaceSequence1 revwithSpsSeq;
		//	reversewithspaceSequence1 revwithSpsSeq;
		reversewithspaceSequence1.revwithSpsSeq("My name is mohammed");
	}
	

}
