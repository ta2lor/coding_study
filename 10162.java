package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class hello {
	
	static int[] from;
	static int MAX =100001;
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		int n = sc.nextInt();
		int[] dist = new int[n+1];
		boolean[] check = new boolean[n+1];
		q.add(n);
		int c1=0,c2=0,c3=0;
		while(!q.isEmpty()) {
			int x = q.peek();
			q.remove();
			if(x==0) {
				System.out.println(c1 +" " +c2+" "+c3);
			}
			if(x%10 != 0) {
				System.out.println("-1");
				break;
			}
				
				
			if(x-300>=0 ) {
				if(check[x-300] == false) {
					q.add(x-300);
					c1++;
				}
			}
			else if(x-60>=0) {
				if(check[x-60] == false) {
					q.add(x-60);
					c2++;
				}
			}
			else if(x-10>=0) {
				if(check[x-10] == false) {
					q.add(x-10);
					c3++;
				}
			}
			
		}		
	}
}
