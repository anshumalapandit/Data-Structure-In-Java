class Solution {
    public class Pair{
        double prob;
        int node;
        Pair(double prob,int node){
            this.prob=prob;
            this.node=node;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<double []>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int idx=0;
        for(int edge[]:edges){
          int u=edge[0];
          int v=edge[1];
          adj.get(u).add(new double[]{v,succProb[idx]});
          adj.get(v).add(new double[]{u,succProb[idx]});
          idx++;
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)-> Double.compare(b.prob,a.prob)); // maxheap
        double p[]=new double[n]; // ans by default =0;
        pq.add(new Pair(1,start_node));
        p[start_node]=1; 
        while(pq.size()>0){
            Pair pair=pq.poll();
            double probab=pair.prob;
            int cur=pair.node;
            if(cur==end_node){
                return probab;
            }
            for(double nbr[]:adj.get(cur)){
                int curNbr=(int)nbr[0];
                double nbrProb=nbr[1];
                // perform operation calculate prob
                double overAll=(double)(probab*nbrProb);
                // check kya existing se bada hai if hai to hi update kro
                if(p[curNbr]<overAll){
                    // update+ add in queue
                    p[curNbr]=overAll;
                    pq.add(new Pair(overAll,curNbr));
                }
            }
        }
      return 0.0; // unreachavale 
    }
}
