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
			String s= "1235";
			
			boolean answer = true;
	        
	        String[] word = s.split("");
	        
	        
	        if(s.length()==4 || s.length()==6){
	            answer = true;
	        }else 
	            answer = false;
	        for(String w : word){
	            
	                if(!(w.equals("1") || w.equals("2") || w.equals("3") || 
	                     w.equals("4") || w.equals("5") || w.equals("6") || w.equals("7") || 
	                     w.equals("8") || w.equals("9") || w.equals("0"))){
	                    answer =false;
	                }
	           
	                
	        }
	        System.out.println(answer);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
