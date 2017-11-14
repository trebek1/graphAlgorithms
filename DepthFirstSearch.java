public class DepthFirstSearch{
  private boolean[] checked;
  private int[] edgeTo;
  private int s; 
  public DepthFirstSearch(Graph g, int s){
    s = s; 
    checked = new boolean[g.V()]; 
    edgeTo = new int[g.V()];
    dfs(g,s); 
  }

  private void dfs(Graph g, int v){
    checked[v] = true; 
    System.out.println("Visited " + v + "!"); 

    for(int i : g.adj(v)){
      if(!checked[i]){
        dfs(g,i);
        edgeTo[i] = v;
      }
    }
  }
}