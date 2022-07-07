package java_practice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {10,30,50,20,80,70,40,100,110,120,130,150};
		//int x = Arrays.stream(a).max().getAsInt();
		//System.out.println(x);
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}

	}

}
