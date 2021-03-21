package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class cb {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		try {
			String a;
			while(true) {
				a = br.readLine();
				if(a.equals(".")) {
					break;
				}
				//System.out.println(a);
				if(!check(a)) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}
			
		}catch(Exception e) {	
			System.out.println(e);
		}
		
	}

	private static boolean check(String s) {
		Stack<String> stack = new Stack<>();
		String[] a = s.split("");
		for(int i=0;i<a.length;i++) {
			if(a[i].equals("[") || a[i].equals("(")) {
				stack.push(a[i]);
			}else if(a[i].equals("]") || a[i].equals(")")) {
				if(stack.isEmpty())
					return false;
				String tmp = stack.pop();
				if((a[i].equals("]") && !tmp.equals("[")) || (a[i].equals(")") && !tmp.equals("("))) {
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
		//return true;
	}
}
