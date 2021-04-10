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
			int[] answers = {1,2,3,4,5};
	        //int[] answer = new int[3];
	        int[] one = {1,2,3,4,5};
	        int[] two = {2,1,2,3,2,4,2,5};
	        int[] three = {3,3,1,1,2,2,4,4,5,5};
	        List<Integer> ab = new ArrayList<>();
	        
	        int c1=0; int c2=0; int c3=0;
	        int a=0;int b=0;int c=0;
	        for(int i=0;i<answers.length;i++){
	            if(answers[i] == one[a++]){
	                c1++;
	            }
	            if(answers[i] == two[b++]){
	                c2++;
	            }
	            if(answers[i] == three[c++]){
	                c3++;
	            }
	            if(a%5==0)
	                a=0;
	            if(b%8==0)
	                b=0;
	            if(c%10==0)
	                c=0;
	        }
	        int max = (c1>=c2)&&(c1>=c3)?c1:(c2>=c3?c2:c3);
	        int t=0;
	        if(max == c1)
	            ab.add(1);
	        	//answer[t++] = 1;
	        	
	        if(max == c2)
	        	ab.add(2);
	            //answer[t++] = 2;
	        if(max == c3)
	        	ab.add(3);
	            //answer[t++] = 3;
	        int[] answer = ab.stream().mapToInt(Integer::intValue).toArray();
	        for(int i=0;i<answer.length;i++) {
	        	System.out.println(answer[i]);
	        }
	        
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
