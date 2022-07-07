package java_practice;

import java.util.StringJoiner;

public class BUGGY_BREAD {
	
	public static void main(String[] args) {
		StringJoiner strJoiner=new StringJoiner(".");
		strJoiner.add("Buggy").add("Bread");
		System.out.println(strJoiner);
	}

}
