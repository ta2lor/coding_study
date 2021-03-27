package test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.math.*;
public class Main {
	
	static int[][] d = new int[1001][1001];
	static int count = 0;
	static int n;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			
			int n = sc.nextInt();
			for(int i=0;i<=n;i++) {
				Arrays.fill(d[i], -1);
			}
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(1);
			q.add(0);
			d[1][0] = 0;
			while(!q.isEmpty()) {
				int s,c;
				s = q.remove();
				c = q.remove();
				if(d[s][s] == -1) {
					d[s][s] = d[s][c] +1;
					q.add(s);
					q.add(s);
				}
				if(s+c<=n && d[s+c][c] == -1) {
					d[s+c][c] = d[s][c] +1;
					q.add(s+c);
					q.add(c);
				}
				if(s-1>=0 && d[s-1][c] == -1) {
					d[s-1][c] = d[s][c] +1;
					q.add(s-1); q.add(c);
				}
			}
			int ans = -1;
			for(int i=0;i<=n;i++) {
				if(d[n][i] != -1) {
					if(ans==-1 || ans>d[n][i]) {
						ans = d[n][i];
					}
				}
			}
			System.out.println(ans);
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	static class Pair{
		int x,y;
		Pair(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
}
