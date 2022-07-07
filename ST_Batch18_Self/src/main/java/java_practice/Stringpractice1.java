package java_practice;

public class Stringpractice1 {
	
	public static void main(String[] args) {
		String name= "united states of america";
		String country=new String("united atates of america");
		int count=0;
		for(int i=0;i<country.length();i++) {
			if(country.charAt(i)=='e') {
				//System.out.println("");
				System.out.println(name.charAt(i)+"::"+count);
				System.out.println("Index of e::"+i);
				count++;
			}
		}
	}

}
