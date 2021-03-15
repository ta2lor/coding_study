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

	public static int temp(String n) {
		String[] x = n.split("");
		for(int i=0;i<x.length-2;i++) {
			if(x[i].equals("6") && x[i+1].equals("6") && x[i+2].equals("6"))
				return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			int n= Integer.parseInt(br.readLine());
			int x = 666;
			int cnt = 1;
			while(cnt != n) {
				x++;
				if(String.valueOf(x).contains("666")) {
					cnt++;
				}
				
				
			}
			System.out.println(x);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
