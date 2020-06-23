package tree;

import Demo02.Queue;

public class Digraph {
    //顶点数量
    private final int v;
    //边的数目
    private int E;
    //邻接表
    private Queue<Integer>[] adj;
    public Digraph(int v){
        //初始化顶点的数量
        this.v = v;
        //初始化边的数量
        this.E = 0;
        //初始化邻接表
        this.adj = new Queue[v];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Integer>();
        }
    }
    //获取顶点数目
    public int v(){
        return v;
    }
    //获取边的数目
    public int E(){
        return E;
    }
    //向有向图中添加一条边 v->w
    public void addEdge(int v,int w){
        //只需要让顶点w出现在顶点v的邻接表中,因为边是有方向的,最终,顶点v的邻接表中存储的相邻顶点的含义:v->其他顶点
        adj[v].enqueue(w);
        E++;
    }
    //获取由v指出的边所连接的所有顶点
    public Queue<Integer> adj(int v){
        return adj[v];
    }

    //该图的反向图
    private Digraph reverse(){
        //创建有向图对象
        Digraph r = new Digraph(v);
        for (int v = 0;v<v;v++){
            //获取由该顶点v指出的所有边
            for (Integer w:adj[v]){//原图中表示的是由顶点v->w的边
                r.addEdge(w,v);//w->v
            }
        }
        return r;
    }
}
