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
			int n = 125;
			int answer = 0;
	        int cnt = 0;
	        List<Integer> list = new ArrayList<>();
	        while(n!=0){
	            list.add(n%3);
	            n/=3;
	        }
	        
	        for(int i=0;i<list.size();i++){
	            answer += Math.pow(3,i) * list.get(list.size()-i-1);
	        }
	        System.out.println(answer);
	        
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
