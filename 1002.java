package test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.math.*;
public class Main {


	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			int n= Integer.parseInt(br.readLine());
			int[] output = new int[n];
			for(int i=0;i<n;i++) {
				String input = br.readLine();
				String[] l = input.split(" ");
				int x1 = Integer.parseInt(l[0]);
				int y1 = Integer.parseInt(l[1]);
				int r1 = Integer.parseInt(l[2]);
				int x2 = Integer.parseInt(l[3]);
				int y2 = Integer.parseInt(l[4]);
				int r2 = Integer.parseInt(l[5]);
				
				double d= Math.sqrt((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1));
				if(x1==x2 && y1==y2) {
					if(r1 != r2) {
						output[i] = 0;
					}else {
						output[i] = -1;
					}
				}else{
					int min = Math.abs(r1-r2);
					if(r2+r1>d && min<d ) {
						output[i] = 2;
					}else if(r2+r1 == d || min==d) {
						output[i] = 1;
					}else if(min>d || r2+r1<d) {
						output[i] = 0;
					}
				}
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(output[i]);
			}System.out.println();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
