package tree;

import Demo02.Queue;

public class EdgeWeightedGraph {
    //顶点总数
    private final int v;
    //边的总数
    private int E;
    //邻接表
    private Queue<Edge>[] adj;
    //创建一个含有v个顶点的空加权无向图

    public EdgeWeightedGraph(int v) {
        this.v = v;
        this.E = 0;
        this.adj = new Queue[v];
        for (int i=0;i<adj.length;i++){
            adj[i] = new Queue<Edge>();
        }
    }
    //获取图中顶点的数量
    public int v(){
        return v;
    }
    //获取图中边的数量
    public int E(){
        return E;
    }
    //向加权无向图中添加一条边e
    public void addadj(Edge e){
        //需要让边e同时出现在e这个边的两个顶点的邻接表中
        int v = e.either();
        int w = e.other(v);

        adj[v].enqueue(e);
        adj[w].enqueue(e);
        //边的数量加1
        E++;
    }
    //获取和顶点v关联的所有边
    public Queue<Edge> adj(int v){
        return adj[v];
    }
    //获取加权无向图的所有边
    public Queue<Edge> edges(){
        //创建一个队列对象,存储所有的边
        Queue<Edge> allEdges = new Queue<>();
        //遍历图中的每一个顶点,找到该顶点的邻接表,邻接表中存储了该顶点关联的每一条边

        //因为这是无向图,所以同一条边同时出现在了它关联的两个顶点的邻接表中,需要让一条边只记录一次;
        for (int v = 0;v<v;v++){
            //遍历v顶点的邻接表,找到每一条和v关联的边
            for (Edge e:adj(v)){
                if (e.other(v)<v){
                    allEdges.enqueue(e);
                }
            }
        }
        return allEdges;
    }
}
