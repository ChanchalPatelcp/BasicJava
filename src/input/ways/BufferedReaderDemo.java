package input.ways;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
// it is mainly used for fast input . its faster than the scanner class 
	// two method - read and readLine
	public static void main(String[] args) throws IOException {
	 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = (char) br.read();
		String s = br.readLine();
		String s1 = br.readLine();
		System.out.println(c);
		System.out.println(s1);

	}

}
