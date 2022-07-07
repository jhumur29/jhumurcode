package java_practice;

public class StringToInt {
	public static void main(String[] args) {
		String price="$44.00";
		String newPrice=price.replace("$", "");
		System.out.println(newPrice+22);
		double convertedPrice=Double.parseDouble(newPrice);
		System.out.println(convertedPrice+22);
	}

}
