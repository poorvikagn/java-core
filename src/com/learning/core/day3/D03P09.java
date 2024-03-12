package com.learning.core.Day3;
import java.util.*;
public class D03P09 {
		public static boolean possibleOrderAmongString(String s[], int n)
		{
			int m = 26;
			boolean mark[] = new boolean[m];
			int in[] = new int[26];
			int out[] = new int[26];		    
			
			ArrayList<ArrayList<Integer>> adj = new ArrayList< ArrayList<Integer>>();
			for(int i = 0; i < m; i++)
				adj.add(new ArrayList<>());
			for(int i = 0; i < n; i++) 
			{
				int f = (int)(s[i].charAt(0) - 'a');
				int l = (int)(s[i].charAt(s[i].length() - 1) - 'a');
				mark[f] = mark[l] = true;
				in[l]++;
				out[f]++;
				adj.get(f).add(l);
		    }
			for(int i = 0; i < m; i++)
			{
				if (in[i] != out[i])
					return false;
			}
			return isConnected(adj, mark,s[0].charAt(0) - 'a');
		}
		public static boolean isConnected(ArrayList<ArrayList<Integer>> adj,boolean mark[], int src)
		{
		    boolean visited[] = new boolean[26];
		    dfs(adj, visited, src);
		    for(int i = 0; i < 26; i++)
		    {
		    	if (mark[i] && !visited[i])
		    		return false;
		    }
		    return true;
		}
		public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean visited[], int src)
			{
			    visited[src] = true;
			    for(int i = 0; i < adj.get(src).size(); i++)
			        if (!visited[adj.get(src).get(i)])
			            dfs(adj, visited, adj.get(src).get(i));
			}
			 
		public static void main(String[] args)
		{
			String s[] = { "ab", "bc", "cd", "de", "ed", "da" };
		    int n = s.length;
		    if (possibleOrderAmongString(s, n))
		    	System.out.println("Ordering is possible");
		    else
		    	System.out.println("Ordering is not possible");
		}
	}