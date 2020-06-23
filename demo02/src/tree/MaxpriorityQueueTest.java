package tree;

public class MaxpriorityQueueTest {
    public static void main(String[] args) {
        MaxpriorityQueue<String> queue = new MaxpriorityQueue<>(7);
        queue.insert("A");
        queue.insert("B");
        queue.insert("C");
        queue.insert("D");
        queue.insert("E");
        queue.insert("F");
        queue.insert("G");

        while (queue.isEmpty()){
           String max = queue.delMax();
            System.out.println(max+" ");
        }
    }
}
