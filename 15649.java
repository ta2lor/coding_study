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
import java.util.List;
import java.util.Scanner;
import java.math.*;
public class Main {
	static int[] arr;
	static boolean[] visited;
	static BufferedWriter bw;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			String input = br.readLine();
			int n = Integer.parseInt(input.split(" ")[0]);
			int m = Integer.parseInt(input.split(" ")[1]);
			
			arr = new int[m];
			visited = new boolean[n];
			dfs(0,n,m);
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	public static void dfs(int depth, int n, int m) throws IOException {
		
		if(depth == m) {
			for(int i=0;i<m;i++) {
				bw.write(arr[i]+" ");
			}
			bw.write("\n");
			return ;
		}
		
		for(int i=0;i<n;i++) {
			
			if(visited[i] == false) {
				//visited[i] = true;
				arr[depth] = i+1;
				dfs(depth+1,n,m);
				
				//visited[i] = false;
		}
			
			
		}
		return ;
		
	}
}
