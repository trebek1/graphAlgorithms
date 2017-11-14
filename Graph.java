import java.util.*;

// basic graph class 

class Graph {
  public ArrayList<LinkedList<Integer>> adj; 
  private int vertices;
  private int edges; 
  
  public Graph(int v){
    // set number of vertices of future graph 
    vertices = v; 

    // Create Adjacency list to hold vertices 
    adj = new ArrayList<LinkedList<Integer>>(); 

    //Add linked lists for each node (assuming vertices are 1 -> n)
    addLinkedLists();
  }

  private void addLinkedLists(){
    for(int i = 0; i<V(); i++){
      adj.add(new LinkedList<Integer>());
    }
  }

  public int V(){
    return this.vertices; 
  }

  public int E(){
    return this.edges; 
  }

  public void addEdge(int start, int end){
    LinkedList<Integer> connections = this.adj.get(start);
    if (!connections.contains(end)) {
      connections.add(end);
      this.edges++;
    } 
  }

  Iterable<Integer> adj(int v){
    return adj.get(v);
  }

  public static void main(String[] args) {
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

    // print the edges 
    for(int i = 0; i< g.vertices; i++){
      int vertex = i;
      LinkedList<Integer> edges = g.adj.get(vertex); 
      int vSize = edges.size();
      System.out.println("vertex " + vertex + " "); 
      for(int k = 0; k < vSize; k++){
        System.out.println(edges.get(k)); 
      }
    }

    System.out.println("********"); 
    System.out.println("Edges: " + g.E()); 
    System.out.println("Vertices: " + g.V());
    System.out.println("********");

    Iterable<Integer> vertexTwo = g.adj(2); 

    for (int v : vertexTwo){
      System.out.println(v);
    }
  }
} 





