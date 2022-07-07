package java_practice;

public class StringFirst{
	public static void main(String[] args) {
	
		String x = "i love java so much. its only love. its 100% love. so this is love. trust me its love";
		String y = x.replace(".","");

		String[] a = y.split(" ");
		System.out.println(y);
		
		
		int counter = 0;
		for(int i=0; i<a.length;i++) {
			if(a[i].equals("love")) {
				counter++;
			}
		}
		
		System.out.println(counter);
		String b = y.replaceAll("love", "hate");
		String[] z =b.split(" ");
		
		counter = 0;
		for(int i=0;i<a.length;i++) {
			if(z[i].equals("hate")) {
				counter = counter+1;
			}
		}
		System.out.println(b);
		System.out.println(counter);
		String firstName = "nirob ";
		String lastName = "hossen"; 
		String together = firstName.concat(lastName);
		System.out.println(together);
	}

}
