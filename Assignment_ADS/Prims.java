package Practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;
public class Prims {
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
	int v;
	int cost;
	Pair(int v,int cost){
		this.v=v;
		this.cost=cost;
	}
	// now override compareTo methode
	@Override
	public int compareTo(Pair p2) {
		return this.cost-p2.cost; // sort in ascending order
	}
}
public static void prim(ArrayList<Edge> [] graph) {
	boolean vis[]=new boolean[graph.length];
	PriorityQueue<Pair> pq=new PriorityQueue<>();
	pq.add(new Pair(0,0)); // added src
	int finalcost=0;
	while(!pq.isEmpty()) {
		Pair cur=pq.remove();
		if(!vis[cur.v]) {
			// if its is unvisited thenn perform certain operaion only
			vis[cur.v]=true;
			finalcost+=cur.cost;
			// now add its neighbour
			for(int i=0;i<graph[cur.v].size();i++) {
				Edge e=graph[cur.v].get(i);
				if(!vis[e.dest]) {
					// if neighbour unvisited hai to hi add kro
					pq.add(new Pair(e.dest,e.wt));
				}
			}
		}

	}
	System.out.println("Minimum Cost is: "+finalcost);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   //Take vertices as input
   System.out.println("Enter no.of Vertices: ");
   int V=sc.nextInt();
   System.out.println("Enter no. of  edges: ");
   int edges=sc.nextInt();
   ArrayList<Edge> graph[]=new ArrayList[V];
   for(int i=0;i<V;i++) {
	   graph[i]=new ArrayList<>();
   }
   // take edges details
   System.out.println("Enter edges details (src,dest,wt): ");
   for(int i=0;i<edges;i++) {
	   int src=sc.nextInt();
	   int dest=sc.nextInt();
	   int wt=sc.nextInt();
	   graph[src].add(new Edge(src,dest,wt));
	   graph[dest].add(new Edge(src,dest,wt));
   }
   // print result
   System.out.println("MInimum cost of my mst is (using prims algo): ");
   prim(graph);
	}

}
