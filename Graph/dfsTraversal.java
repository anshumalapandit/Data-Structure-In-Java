package graph;

import java.util.*;

import graph.BFS.Edge;

public class DFS {
public static class Edge{
	int src;
	int dest;
	Edge(int s,int d){
		this.src=s;
		this.dest=d;
	}
}
public static void createGraph(ArrayList<Edge>[]graph) {
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
public static void dfs_traverse(ArrayList<Edge>[]graph,int cur,boolean vis[]) {
	//visit
	// 1.first print 2. then marks true vis
	System.out.print(cur+" ");
	vis[cur]=true;
	for(int i=0;i<graph[cur].size();i++) {
		Edge e=graph[cur].get(i);
		if(!vis[e.dest]) {
			//now curr mera neighbour ban jayega
			dfs_traverse(graph,e.dest,vis);
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int V=7;
    ArrayList<Edge>[] graph=new ArrayList[V];
	createGraph(graph);
	dfs_traverse(graph,0,new boolean[V]);
	
	}

}

