import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	static int n;
	static String dict[];
	static int alph[];
	static int dfsarr[];
	static int dfsvisit[];
	public static void main(String args[]) throws IOException {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 			n=bf.read();
 			dict=new String[n];
 			alph=new int['Z'-'a'];
 			for(int i=0;i<n;i++) {
 				dict[i]=bf.readLine();
 				for(int j=0;j<dict[i].length();j++) {
 					if(alph[dict[i].charAt(j)])
 				}
 			}
 	
 			for(char k:map.keySet()) {
 				Alph+=k;
 			}
			System.out.println(dfs(Alph.length(),0));
			
	}
	public static int dfs(int target,int now) {
		int res=0;
		if(target==now) {
			return calc();
		}
		for(int i=0;i<=9;i++) {
			if(dfsvisit[i]==1)
				continue;
			dfsvisit[i]=1;
			dfsarr[now-1]=i;
			res=Math.max(dfs(target,now+1),res);
			dfsvisit[i]=0;
		}
		return res;
	}
	public static int calc() {
		int sum=0;
		for(String word:dict) {
			String 
			for(int i=0;i<word.length();i++) {
				word.charAt(i)
			}
		}
	}
}
