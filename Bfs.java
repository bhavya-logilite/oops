package Bfs;
import java.util.*;
public class Bfs {
	private int V;
	private LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked") Bfs (int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i =0; i<v ; i++ ) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	void addedge( int v, int w) {
		adj[v].add(w);
	}
	void BFS(int s) {
		boolean visited[]= new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + "");
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n= i.next();
				if(! visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
				
			}
		}
	}

	public static void main(String[] args) {
		Bfs g =new Bfs(4);
		g.addedge(0, 1);
		g.addedge(0, 2);
		g.addedge(1, 2);
		g.addedge(2, 0);
		g.addedge(2, 3);
		g.addedge(3, 3);
		g.BFS(0);
	}

}
