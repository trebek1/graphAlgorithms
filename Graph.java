import java.util.*;

class Graph {
  public ArrayList<LinkedList<Integer>> adj; 
  public int size; 
  
  public Graph(int v){
    System.out.println("created a graph " + v);
    size = v; 
    adj = new ArrayList<LinkedList<Integer>>(); 
    for(int i = 0; i<v; i++){
      adj.add(new LinkedList<Integer>());
    }


    System.out.println("Number of verticies in graph " + this.adj.size());
  }

  public void addEdge(int start, int end){
    LinkedList<Integer> connections = this.adj.get(start);
    if (!connections.contains(end)) {
      connections.add(end);
    } 
  }
  public static void main(String[] args) {
    System.out.println("hello world");
    Graph g = new Graph(6);

    g.addEdge(0,1);
    g.addEdge(0,2);
    g.addEdge(1,4);
    g.addEdge(1,3);
    g.addEdge(1,0);
    g.addEdge(2,0);
    g.addEdge(2,3);
    g.addEdge(2,5);
    g.addEdge(3,1);
    g.addEdge(3,2);
    g.addEdge(4,1); 
    g.addEdge(5,2); 

    for(int i = 0; i< g.size; i++){
      int vertex = i;
      LinkedList<Integer> edges = g.adj.get(vertex); 
      int vSize = edges.size();
      System.out.println("vertex " + vertex + " "); 
      for(int k = 0; k < vSize; k++){
        System.out.println(edges.get(k)); 
      }
    }
  }
} 