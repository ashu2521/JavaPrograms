import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Grp implements Comparable<Grp> {
	public int getV1() {
		return v1;
	}

	public void setV1(int v1) {
		this.v1 = v1;
	}

	public int getV2() {
		return v2;
	}

	public void setV2(int v2) {
		this.v2 = v2;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	int v1;
	int v2;
	int w;

	Grp(int v1, int v2, int w) {
		this.v1 = v1;
		this.v2 = v2;
		this.w = w;
	}

	@Override
	public int compareTo(Grp o) {
		// TODO Auto-generated method stub
			return this.w - o.w;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grp other = (Grp) obj;
		if ((v1 == other.v1 && v2 == other.v2) || (v1 == other.v2 && v2 == other.v1))
			return true;
		return false;
	}
}sasdaww
 
public class MST_Kruskal {
	static LinkedList<Grp> Algorithm(int n, int e, LinkedList<Grp> G){
		int min_cost = 0;
		int selected[] = new int[n+1];
		Collections.sort(G);
		LinkedList<Grp> mst = new LinkedList<>();
		for(Grp g : G){
			//System.out.println(g.getV1() + " " + g.getV2() + " " + g.getW());
			if(selected[g.getV1()] != 1 || selected[g.getV2()] != 1){
				mst.add(g);
				selected[g.v1] = 1;
				selected[g.v2] = 1;
			}
		}
	
		return mst;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		LinkedList<Grp> G = new LinkedList<>();
		for (int i = 0; i < e; i++) {
			int u1 = sc.nextInt();
			int u2 = sc.nextInt();
			int w = sc.nextInt();
			G.add(new Grp(u1, u2, w));
		}
		LinkedList<Grp> mst = Algorithm(n, e, G);
		int min_cost = 0;
		for( Grp g : mst){
			System.out.println(g.v1 + " " + g.v2 + " " + g.w);
			min_cost += g.w;
		}
		System.out.println(min_cost);
	}
}
