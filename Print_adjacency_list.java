class Solution {

    public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj) {

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for(int i = 0 ; i<V ; i++){
                graph.add(new ArrayList<>());
                for(int v : adj.get(i)){
                    graph.get(i).add(v);
                }
            }
            return graph;
    }
}