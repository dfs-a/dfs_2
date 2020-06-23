package Demo02;

public class QueueTest {
    public static void main(String[] args) {
        //创建队列对象
        Queue<String> s = new Queue<>();
        //测试队列的enququ方法
        s.enqueue("a");
        s.enqueue("b");
        s.enqueue("c");
        s.enqueue("d");
        s.enqueue("e");

        for(String str : s){
            System.out.println(str);
        }
        //测试代码的dequeue方法
        String result = s.dequeue();
        System.out.println("出队列的元素是"+result);
        System.out.println("剩余的元素个数是:"+s.size());
    }
}
