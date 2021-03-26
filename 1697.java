package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class cb {
	static Queue<Integer> q = new LinkedList<>();

	static int MAX =100001;
	public static void main(String[] args){
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] dist = new int[100001];
		boolean[] check = new boolean[100001];
		q.add(n);
		while(!q.isEmpty()) {
			int now = q.peek();
			
			if(now == k)
				break;
			q.remove();

			if(now-1>=0) {
				if(check[now-1]== false) {
					q.add(now-1);
					check[now-1] = true;
					dist[now-1] = dist[now] +1;
				}
			}
			if(now+1<MAX) {
				if(check[now+1]== false) {
					q.add(now+1);
					check[now+1] = true;
					dist[now+1] = dist[now] +1;
				}
			}
			if(2*now<MAX) {
				if(check[now*2]== false) {
					q.add(now*2);
					check[now*2] = true;
					dist[now*2] = dist[now] +1;
				}
			}
			
			
		}
		System.out.println(dist[k]);
	}


}
