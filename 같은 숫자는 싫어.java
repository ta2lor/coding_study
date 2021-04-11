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
			List<Integer> list = new ArrayList<>();
	        int[] arr = {1,1,3,3,0,1,1};
	        int p = arr[0];
	        for(int i=1;i<arr.length;i++){
	            if(p==arr[i]){
	                continue;
	            }else{
	                list.add(p);
	                p = arr[i];
	            }
	                
	        }
	        list.add(arr[arr.length-1]);
	        int[] answer = new int[list.size()];
	        for(int i=0;i<list.size();i++){
	            answer[i] = list.get(i).intValue();
	        }
	        System.out.println(answer);
	        
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
