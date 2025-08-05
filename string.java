import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int v=s.nextInt();
	     int e=s.nextInt();
	     int adj[][]=new int[v][v];
	     for(int i=0; i<e; i++){
	          int sv=s.nextInt();
			  
	           int ev=s.nextInt();
	           
	           adj[sv][ev]=1;
	           adj[ev][sv]=1;
	     }
	     boolean vis[]=new boolean[v];
	     for (int i=0; i<v; i++){
	         
	         vis[i]=false;
	     }
	     dfs,v,vis,0);
	     for(int i=0; i<v;i++){
	         if(vis[i]==false){
	             System.out.println("dis graph");
	             return;
	         }
	     }
		System.out.println("Hello World");
	}
}v