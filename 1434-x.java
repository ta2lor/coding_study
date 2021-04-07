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
			int m = sc.nextInt();
			int[] box_size = new int[n];
			int[] book_size = new int[m];
			
			for(int i=0;i<n;i++) {
				box_size[i] = sc.nextInt();
			}
			for(int i=0;i<m;i++) {
				book_size[i] = sc.nextInt();
			}
			
			
			int waste = 0;
			
			
			
			for(int book=0;book<m;book++) {
				int box = 0;
				int temp_box = n-1;
				while(true){
					if(box_size[box] < book_size[book]) {
						box = temp_box--;
					}else {
						box_size[box] -= book_size[book];
						book_size[book] = 0;
						break;
					}
				}
				//1번이 0이면 한칸씩 땡기고 0이 아니면 그대로 진행
				if(box_size[0] == 0) {
					for(int k=0;k<n-1;k++) {
						box_size[k] = box_size[k+1];
					}
					box_size[n-1] = 0;
				}
				
				
			}
			for(int i=0;i<n;i++) {
				waste += box_size[i];
			}
			System.out.println(waste);
			bw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
