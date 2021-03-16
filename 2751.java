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
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			int n= Integer.parseInt(br.readLine());
			int[] num = new int[n];
			ArrayList<Integer> num1 = new ArrayList<>();
			for(int i=0;i<n;i++) {
				num[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(num);
			
			for(int i=0;i<n;i++) {
				bw.write(num[i] + "\n");
			}
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
