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
		
		while(!q.isEmpty()) {
			int x = q.peek();
			q.remove();
			if(x==1)
				break;
			if(x%3==0 ) {
				if(check[x/3] == false) {
					q.add(x/3);
					check[x/3] = true;
					dist[x/3] = dist[x]+1;
				}
			}
			if(x%2==0) {
				if(check[x/2] == false) {
					q.add(x/2);
					check[x/2] = true;
					dist[x/2] = dist[x] +1;
				}
			}
			if(x-1>=0) {
				if(check[x-1] == false) {
					q.add(x-1);
					check[x-1] = true;
					dist[x-1] = dist[x] +1;	
				}
			}
			
		}
		System.out.println(dist[1]);
				
	}
}
