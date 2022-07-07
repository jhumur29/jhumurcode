package java_practice;

public class ABC_CompanyHW{ 
	public static void main(String[] args) {
		int[] sales= {6,9,7,10,11,9,7,12,14,15,13,11};
		System.out.println(sales.length);
		int total =0;
		for(int i=0;i<sales.length;i++) {
			total = total+sales[i];
		}
		System.out.println("total sales: "+total);
		double avg = (double)total/sales.length;
		System.out.println("Average sales : "+avg); 
		int counter =0;
		for(int i=0; i<sales.length;i++) {
			if(sales[i]>avg) {
				counter++;
			}
		}
		System.out.println("Number of month where sales is above avg: "+counter);
	}

}
