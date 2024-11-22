package graph;
import java.util.*;
public class BFS {
public static class Edge{
	int src;
	int dest;
public Edge(int s,int d) {
	this.src=s;
	this.dest=d;
}
}
public static void createGraph(ArrayList<Edge>[] graph) {
	for(int i=0;i<graph.length;i++) {
		graph[i]=new ArrayList<>();
	}
	graph[0].add(new Edge(0,1));
	graph[0].add(new Edge(0,2));
	graph[1].add(new Edge(1,0));
	graph[1].add(new Edge(1,3));
	graph[2].add(new Edge(2,0));
	graph[2].add(new Edge(2,4));
	graph[3].add(new Edge(3,1));
	graph[3].add(new Edge(3,4));
	graph[3].add(new Edge(3,5));
	graph[4].add(new Edge(4,2));
	graph[4].add(new Edge(4,3));
	graph[4].add(new Edge(4,5));
	graph[5].add(new Edge(5,3));
	graph[5].add(new Edge(5,4));
	graph[5].add(new Edge(5,6));
	graph[6].add(new Edge(6,5));
	
}
public static void bfs_traverse(ArrayList<Edge>[]graph) {
	//we know that in bfs approach we used queue data strcutue
	Queue<Integer> q=new LinkedList<>();
	boolean vis[]=new boolean[graph.length];
	q.add(0); //sourcse =0;
	while(!q.isEmpty()) {
		int cur=q.remove();
		if(!vis[cur]) {
			System.out.print(cur+" "); //if visited nai hai to vis karo
			vis[cur]=true;
			//now vis kar liye abb uske neighbour ko queue mai add karo
			//same as levell order approach
			for(int i=0;i<graph[cur].size();i++) {
				Edge e=graph[cur].get(i); //return src dest but we want dest==padosi
				q.add(e.dest);
			}
			
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=7;
		ArrayList<Edge>[] graph=new ArrayList[V];
		createGraph(graph);
		bfs_traverse(graph);
    
	}

}

