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
import java.util.Map;
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
			String[] participant = {"mislav", "stanko", "mislav", "ana"};
			String[] completion = {"stanko", "ana", "mislav"};
			
			String answer = "";
	        
			HashMap<String,Integer> h = new HashMap();
	        int cnt = 0;
	        for(String word : participant){
	            if(h.get(word) == null) {
	            	h.put(word, 1);
	            }else {
	            	h.put(word, h.get(word)+1);
	            }
	        }
	        for(String comp : completion) {
	        	h.put(comp, h.get(comp)-1);
	        }

/*
Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i]))
                return participant[i];
        }
        
        return participant[participant.length-1];
*/
	        System.out.println(h);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
