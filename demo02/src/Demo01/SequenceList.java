package Demo01;

public class SequenceList<T> {
    //存储元素的数组
    private T[] eles;
    private int N;

//    public SequenceList(T i) {
//
//    }

    //构造方法
    public SequenceList(int capacity) {
        //初始化数组
        this.eles = (T[])new Object[capacity];
        //初始化长度
        this.N = 0;
    }
    public void clear(){
        this.N = 0;
    }
        //判断当前线性表是否为空表
    public boolean isEmpty(){
        return N==0;

    }
    //获取线性表的长度
     public int length(){
        return N;
     }
     //获取指定位置的元素
     public T get(int i){
        return eles[i];
     }
     //向线性表中添加元素
     public void insert(T t){
        eles[N++] = t;
    }
    //在i元素处插入元素t
    public void insert(int i,T t){
        //先把i索引处的元素及其后面的依次向后移动一位
        for (int index = N; index > i ; index--) {
            eles[index] = eles[index-1];
        }
        //再把t元素放到i索引处即可
        eles[i] = t;
        //元素个数+1
        N++;
    }
    //删除指定位置i处的元素,并返回该元素
    public T remove(int i){
        //记录索引处的值
        T current = eles[i];
        //索引i后面元素依次向前移动一位即刻
        for (int index = i; index < N; index++) {
            eles[index] = eles[index+1];
        }
        //元素个数-1
        N--;
        return current;
    }
    //查找t元素第一次出现的位置
    public int indexof(T t){
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }
}


