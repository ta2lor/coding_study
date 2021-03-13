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

public class Main {


	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			String input = br.readLine();
			String[] num = input.split(" ");
			BigInteger a = new BigInteger(num[0]);
			BigInteger b = new BigInteger(num[1]);
			
			System.out.println(a.add(b));
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
