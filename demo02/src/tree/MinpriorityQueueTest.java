package tree;

import com.sun.source.tree.WhileLoopTree;

public class MinpriorityQueueTest {
    public static void main(String[] args) {
        MinpriorityQueue<String> queue = new MinpriorityQueue<String>(10);
        queue.insert("G");
        queue.insert("F");
        queue.insert("E");
        queue.insert("D");
        queue.insert("C");
        queue.insert("B");
        queue.insert("A");

        while(!queue.isEmpty()){
            String min = queue.delMin();
            System.out.print(min+" ");
        }
    }
}
