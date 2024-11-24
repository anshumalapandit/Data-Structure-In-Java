package Practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Kruskal {
public static class Edge implements Comparable<Edge>{
	int src;
	int dest;
	int wt;
	Edge(int s,int d,int w){
		this.src=s;
		this.dest=d;
		this.wt=w;
	}
	// sort = on the basis of weight
	@Override
	public int compareTo(Edge e2) {
		return this.wt-e2.wt;
	}
}
public static int V;
public static int par[];
public static int rank[];
// intislise par
public static void init() {
	for(int i=0;i<V;i++) {
		par[i]=i;
		rank[i]=0;
	}
}
public static int find(int x) {
	if(x==par[x]) {
		return x;
	}
	return find(par[x]); // path compression technique 
}
public static void union(int a,int b) {
	int parA=find(a);
	int parB=find(b);
	if(rank[parA]==rank[parB]) {
		par[parA]=parB;
		rank[parB]++;
	}else if(rank[parA]<rank[parB]) {
		par[parA]=parB;
	}else {
		par[parB]=parA;
	}
}
public static void kruskal(ArrayList<Edge> edges,int V) {
	init();
	Collections.sort(edges); // 0(ElogE)
	int finalcost=0;
	int count=0; 
	for(int i=0;count<V-1;i++) { // 0(V-1)
		Edge e=edges.get(i);
		int parA=find(e.src);
		int parB=find(e.dest); // if they both equal means its the condition of cycle
		if(parA!=parB) {
			union(e.src,e.dest);
			finalcost+=e.wt;
			count++;
		}
	}
	System.out.println("Minimum cost of my mst: "+finalcost);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of vertices: ");
		 V=sc.nextInt();
		 par=new int[V];
		 rank=new int[V];
		System.out.println("Enter no. of edges: ");
		int e=sc.nextInt();
		ArrayList <Edge> edges=new ArrayList<>();
		System.out.println("Enter edges details in the form of (src,dest,wt): ");
		for(int i=0;i<e;i++) {
			int src=sc.nextInt();
			int dest=sc.nextInt();
			int wt=sc.nextInt();
			// now add it to graph
			edges.add(new Edge(src,dest,wt));
		}
		System.out.println("Using Kruskal Algotihm: ");
		kruskal(edges,V);
	}

}
