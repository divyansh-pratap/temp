class Solution {

    public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj) {

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0 ; i<V ; i++){
                adj.add(new ArrayList<>());
                for(int v : adj.get(i)){
                    adj.get(i).add(v);
                }
            }
            return adj;
    }
}