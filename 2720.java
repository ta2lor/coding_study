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
			
			int n = sc.nextInt();
			
			while(n-- >0) {
				int x = sc.nextInt();
				int c1=0,c2=0,c3=0,c4=0;
				while(true) {
					if(x-25>=0) {
						c1++;
						x-=25;
					}else if(x-10>=0) {
						c2++;
						x-=10;
					}else if(x-5>=0) {
						c3++;
						x-=5;
					}else if(x-1>=0) {
						c4++;
						x-=1;
					}

					if(x==0) {
						System.out.println(c1+" "+c2+" "+ c3+" "+ c4);
						break;
					}
				}
				
			}
			
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
