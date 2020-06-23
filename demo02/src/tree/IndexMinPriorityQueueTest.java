package tree;

import Demo02.Queue;

public class IndexMinPriorityQueueTest {
    public static void main(String[] args) {
        IndexMinpriorityQueue<String> queue = new IndexMinpriorityQueue<String>(10);

        queue.insert(0,"A");
        queue.insert(1,"B");
        queue.insert(2,"C");
        queue.insert(3,"D");
        queue.insert(4,"E");
        queue.insert(5,"G");

        queue.changeItem(2,"K");

        while (!queue.isEmpty()){
            int index = queue.delMin();
            System.out.print(index+"");
        }
    }
}
