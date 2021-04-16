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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		try {
			int[] d = {1,3,2,5,4};
			int budget = 9;
			int answer = 0;
		      Arrays.sort(d);
		      for(int i=0;i<d.length;i++){
		          if(d[i]>budget) break;
		          budget-=d[i];
		          answer++;
		      }
		      System.out.println(answer);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
