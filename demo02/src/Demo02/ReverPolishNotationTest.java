package Demo02;

import java.util.Iterator;

public class ReverPolishNotationTest {
    public static void main(String[] args) {
        //中缀表达式 3*(17-15)+18/6的逆波兰表达式如下
        String[] notation = {"3","17","15","-","*","18","6","/","+"};
        int result = caculate(notation);
        System.out.println("逆波兰表达式的结果为:"+result);
    }
    //@param notation 逆波兰表达式的数组表示方式
    //@return 逆波兰表达式的计算结果
    public static int caculate(String[] noation){
    //定义一个栈,用来存储操作数
        Stack<Integer> oprands = new Stack<>();
        //从左往右遍历逆波兰表达式,得到每一个元素
        for (int i = 0; i < noation.length; i++) {
            var curr = noation[i];
            //判断当前元素是运算符还是操作数
            Integer o1;
            Integer o2;
            Integer result;
            switch (curr){
                case "+":
                    //运算符,从栈弹出两个操作数,完成运算,运算完的结果在压入栈中
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o1+o2;
                    oprands.push(result);
                    break;
                case "-":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o2-o1;
                    oprands.push(result);
                    break;
                case "*":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o1*o2;
                    oprands.push(result);
                    break;
                case "/":
                    o1 = oprands.pop();
                    o2 = oprands.pop();
                    result = o2/o1;
                    oprands.push(result);
                    break;
                default:
                    //操作数,把该操作数放入到栈中
                    //将字符串转换成int
                    oprands.push(Integer.parseInt(curr));
                    break;
            }
        }
        //得到栈中最后一个元素,就是逆波兰表达式的最终结果
        int result = oprands.pop();
        return result;
    }
}
