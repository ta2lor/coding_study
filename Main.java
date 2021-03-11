package test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	  public static String reverseStr(String s) {
		    return (new StringBuffer(s)).reverse().toString();
	  }
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {

			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			for (int q=0;q<n;q++) {
				
				String input = br.readLine();
				String[] word = input.split("");
				boolean flag = true;
				for(int i=0;i<input.length();i++) {
					for(int j=0;j<i;j++) {
						if(!word[i].equals(word[i-1]) && word[i].equals(word[j])) {
							flag = false;
							break;
						}
					}
				}
				if(flag) {
					cnt++;
				}
				
			}
			System.out.println(cnt);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
