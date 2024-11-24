package Practice;

import java.util.*;
public class Dijkstra {
public static class Edge{
	int src;
	int dest;
	int wt;
	Edge(int s,int d,int w){
		this.src=s;
		this.dest=d;
		this.wt=w;
	}
}
public static class Pair implements Comparable<Pair>{
	int n;
	int path;
	Pair(int n,int path){
		this.n=n;
		this.path=path;
	}
	@Override
	public int compareTo(Pair p2) {
		return this.path-p2.path;
	}
}
public static void dks(ArrayList<Edge> graph[],int src) {
	int dist[]=new int[graph.length];
	boolean vis[]=new boolean[graph.length];
	// sare edges ko initialise to + infinity except src
	for(int i=0;i<graph.length;i++) {
		if(i!=0) {
			dist[i]=Integer.MAX_VALUE;
		}
	}
	PriorityQueue<Pair> pq=new PriorityQueue<>();
	pq.add(new Pair(src,0));
	while(!pq.isEmpty()) {
		Pair cur=pq.remove();
		if(!vis[cur.n]) {
			vis[cur.n]=true;
			// now explore and calculate its neighbour distance
			for(int i=0;i<graph[cur.n].size();i++) {
				Edge e=graph[cur.n].get(i);
				int u=e.src;
				int v=e.dest;
				int wt=e.wt;
				if(dist[u]+wt<dist[v]) {
					// upadte and add into pq
					dist[v]=dist[u]+wt;
					pq.add(new Pair(v,dist[v]));
				}
			}
		}
	}
	// print  imp 
	System.out.println("Shortest distance from source : "+src);
	for(int i=0;i<dist.length;i++) {
		System.out.println("to vertex: "+i+"-->" +(dist[i]==Integer.MAX_VALUE? "Unreachable" : dist[i]));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter no. of vertices: ");
   int v=sc.nextInt();
   System.out.println("Enter no. of edges: ");
   int e=sc.nextInt();
   ArrayList<Edge> graph[]=new ArrayList [v];
   // initialise kro arraylist
   for(int i=0;i<v;i++) {
	   graph[i]=new ArrayList<>();
   }
   System.out.println("Enter edges details in the form (src,dest,wt): ");
   for(int i=0;i<e;i++) {
	   int src=sc.nextInt();
	   int dest=sc.nextInt();
	   int wt=sc.nextInt();
	   // add in undirected graph
	   graph[src].add(new Edge(src,dest,wt));
	   graph[dest].add(new Edge(src,dest,wt));
   }
   // call dijstra
   System.out.println("Enter source node: ");
   int src=sc.nextInt();
   dks(graph,src);
	}

}
