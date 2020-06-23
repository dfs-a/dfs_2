package Demo02;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //测试压栈
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        for (String item : stack) {
            System.out.println(item);
        }
        System.out.println("---------");
        //测试弹栈
        String result = stack.pop();
        System.out.println("弹出的元素为:"+result);
        System.out.println("还有"+stack.size());
    }
}
