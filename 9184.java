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
	static int[][][] arr = new int[51][51][51];
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			
			
			
			while(true) {
				
				String k = br.readLine();
				String[] temp = k.split(" ");
				int a = Integer.parseInt(temp[0]);
				int b = Integer.parseInt(temp[1]);
				int c = Integer.parseInt(temp[2]);
				if(a==-1 && b==-1 && c==-1) {
					break;
				}
				
				System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	private static int w(int a, int b, int c) {
		

		if(a<=0 || b<=0 || c<=0) 
			return 1;
		
		if(a>20 || b>20 || c>20) 
			arr[a][b][c] = w(20,20,20);
		
		if(arr[a][b][c] != 0) 
			return arr[a][b][c];
		
		if(a<b && b<c) 
			arr[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
		else 
			arr[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
		
	
		
		return arr[a][b][c];
		
	}
}
