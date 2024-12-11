import java.util.*;
import java.lang.*;
import java.io.*;

public class NotUse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    Map<Integer,Integer> map = new HashMap<>();
		    int score = 0;
		    for(int i=0; i<n; i++){
            int a = sc.nextInt();
		        if(map.containsKey(a)){
               score++;
              }
              else{
               score= 1;
              }
              map.put(a, score);
		    }
          Set<Integer> key = map.keySet();
          for(int k : key){
            if(map.get(k)%2!=0){
               System.out.println(k);
               break;

            }
          }
		}

	}
}
