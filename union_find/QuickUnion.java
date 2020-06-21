package union_find;

// Weighted QuickUnion not yet implemented (this is to reduce the height of the tree)
public class QuickUnion {
    
    private int[]id;

    public QuickUnion(int n) {
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; // One-pass improvement (path compression)
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        id[root(p)] = root(q);
    }

    public static void main(String []agrs) {
        QuickUnion qu = new QuickUnion(5);
        qu.union(1, 2);
        qu.union(2, 4);
        boolean isConnected = qu.connected(1, 4);
        System.out.println(isConnected);
    }
}