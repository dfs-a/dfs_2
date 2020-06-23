package tree;

public class UF {
    //记录结点元素和该元素所在分组的标识
    private int[] eleAndGroup;
    //记录并查集中数据的分组个数;
    private int count;
    //初始化并查集;
    public UF(int N){
        //初始化分组的数量,默认情况下,有N个分组
        this.count = N;

        //初始化eleAndGroup数组
        this.eleAndGroup = new int[N];

        //初始化eleAndGroup中的元素及其所在的组的标识符,让eleAndgroup数组的索引作为并查集的每个结点的元素,并且让每个索引处的值为它的标识符
        for (int i = 0; i < eleAndGroup.length; i++) {
            eleAndGroup[i] = i;
        }
    }
    //获取当前并查集中的数据有多少个分组;
    public int count(){
        return count;
    }
    //元素p所在分组的标识符
    public int find(int p){
        return eleAndGroup[p];
    }

    //判断并查集中元素p和元素q是否在同一分组中
    public boolean connected(int p,int q){
        if (p>=count && q>=count){
            System.out.println("输入的数超出了范围");
            return false;
        }
        return find(p) == find(q);

    }
    //把p元素所在分组和p元素所在分组合并
    public void union(int p,int q){
        //先找到p的标识符
        int pgroup = find(p);
        //找到q的标识符
        int qgroup = find(q);
        for (int i = 0; i < eleAndGroup.length; i++) {
            if (eleAndGroup[i] == pgroup){
                eleAndGroup[i] = qgroup;
            }
        }
        //分组元素个数-1
        this.count--;
    }
}