package dsa;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();//declaration
		st.push(10);//push means add number
		st.push(20);
		System.out.println(st);
		st.pop();//pop means remove number
		System.out.println(st.peek());//peek means last number print karega
		st.push(20);
		System.out.println(st+"-> "+st.peek()+" "+st.size());
		st.push(30);
		System.out.println(st+"-> "+st.peek()+" "+st.size());
		st.push(40);
		System.out.println(st+"-> "+st.peek()+" "+st.size());
		st.pop();
		System.out.println(st+"-> "+st.peek()+" "+st.size());
		st.pop();
		System.out.println(st+"-> "+st.peek()+" "+st.size());
		st.pop();
		System.out.println(st+"-> "+st.peek()+" "+st.size());
	}

}
