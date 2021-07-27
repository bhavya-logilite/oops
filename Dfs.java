package dfs;
import java.util.*;
public class Dfs {
	private int V;
	private LinkedList<Integer>adj[];
	@SuppressWarnings("unchecked")Dfs(int v){
		V = v;
		adj = new LinkedList[v];
		for  (int i = 0;i<v; i++)
		adj[i] = new LinkedList<Integer>();
	  }
		void addedge(int v, int w) {
			adj[v].add(w);
		}
		void visit(int v, boolean visited[]) {
			visited[v] = true;
			System.out.println(v + " ");
			Iterator<Integer> i = adj[v].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
				visit(n, visited);}
			}
		}
		void DFS() {
			boolean visited[] = new boolean[V];
			for (int i = 0; i<V ; i++) {
				if(visited[i] == false)
					visit(i, visited);
			}
		}
	public static void main(String[] args) {
		Dfs g =new Dfs(5);
		g.addedge(0, 1);
		g.addedge(0, 2);
		g.addedge(0, 3);
		g.addedge(0, 4);
		g.addedge(1, 1);
		g.addedge(1, 2);
		g.addedge(1, 3);
		g.addedge(1, 4);
		g.DFS();
	}

}
