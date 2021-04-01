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
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			while(sc.hasNextInt()) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int cnt = 0;
				if(b<=(a+c)/2) {
					System.out.println(c-b-1);
				}else {
					System.out.println(b-a-1);
				}
				
			}
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
