import java.util.*;
public class BreadthFirstSearch {
	Queue<Integer> q = new LinkedList<>(); 
	int s; 
	boolean[] visited; 
	int[] edgeTo; 

	public BreadthFirstSearch(Graph g, int s){
		s = s; 
		visited = new boolean[g.V()];
		edgeTo = new int[g.V()];
		bfs(g, s); 
	}

	private void bfs(Graph g, int e){
		q.add(e);
		visited[e] = true; 
		System.out.println("visited " + e + "!");
		while(!q.isEmpty()){
			int target = q.poll();
			Iterable<Integer> neighbors = g.adj(target);
			for(int n : neighbors){
				if(!visited[n]){
					q.add(n); 
					visited[n] = true; 
					edgeTo[n] = target; 
					System.out.println("visited " + n + "!");
				}
			}	
		}

		
	}
}