package union_find;

public class QuickFind {

    private int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
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
        QuickFind qfuf = new QuickFind(5);
        qfuf.union(1, 2);
        qfuf.union(2, 4);
        boolean isConnected = qfuf.connected(1, 4);
        System.out.println(isConnected);
    }
}