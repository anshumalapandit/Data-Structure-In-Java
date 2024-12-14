package graph;
import java.util.*;
public class Bellman {
static class Edge{
	int src;
	int dest;
	int wt;
	Edge(int src,int dest,int wt){
		this.src=src;
		this.dest=dest;
		this.wt=wt;
	}
}
public static void bellman(ArrayList<Edge> graph,int src,int V) {
	int dist[]=new int[V];
	// intialise all distance to +inifty except src
	for(int i=0;i<dist.length;i++) {
		if(i!=src) {
			dist[i]=Integer.MAX_VALUE;
		}
	}
		for(int i=0;i<V-1;i++) {
			// sare edges nikal lo
			for(int j=0;j<graph.size();j++) {
				Edge e=graph.get(j);
				int u=e.src;
				int v=e.dest;
				int wt=e.wt;
				// relaxation step
				//dist[u]!=+infity The check ensures that only reachable vertices are considered for relaxation.
				if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]) {
					// update the distances
					dist[v]=dist[u]+wt;
				}
			}
	}
		// now print all shortest distances
		for(int i=0;i<dist.length;i++) {
			System.out.print(dist[i]+" ");
		}
		System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no. of vertices: ");
      int V=sc.nextInt();
      System.out.println("Enter no. of edges: ");
      int E=sc.nextInt();
      System.out.println("Enter edges details: (src,dest,wt): ");
      ArrayList<Edge> graph=new ArrayList<>();
      for(int i=0;i<E;i++) {
    	  int src=sc.nextInt();
    	  int dest=sc.nextInt();
    	  int wt=sc.nextInt();
    	  graph.add(new Edge(src,dest,wt));
      }
      System.out.println("Enter ur sources: ");
      int src=sc.nextInt();
      bellman(graph,src,V);
	}

}
