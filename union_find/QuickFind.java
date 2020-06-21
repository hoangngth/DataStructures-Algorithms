package union_find;

public class QuickFind {

    private int[] id;

    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == qid) {
                id[i] = pid;
            }
        }
    }

    public static void main(String[] args) {
        QuickFind qf = new QuickFind(5);
        qf.union(1, 2);
        qf.union(2, 4);
        boolean isConnected = qf.connected(1, 4);
        System.out.println(isConnected);
    }
}