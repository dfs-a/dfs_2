package tree;

public class HeapTest {
    public static void main(String[] args) {
        //创建堆对象
        Heap<String> heap = new Heap<>(20);
        //往堆里存入字符串数据
        heap.insert("A");
        heap.insert("B");
        heap.insert("C");
        heap.insert("D");
//        heap.insert("E");
//        heap.insert("F");
//        heap.insert("G");
//        heap.insert("H");
//        heap.insert("I");
        //通过循环从堆中删除数据
        String result = null;
        while ((result  = heap.delMax())!=null){
//            result = heap.delMax();
            System.out.println(result);
        }
    }
}
