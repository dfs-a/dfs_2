package Demo02;

public class BreacktsMathTest {
    public static void main(String[] args) {
        String str = "(上海(长安)";
        boolean macth = isMatch(str);
        if (macth==true){
            System.out.println("匹配");
        }else{
            System.out.println("不匹配");
        }
    }
    /*
    判断str中的括号是否匹配
    @param str 括号组成的字符串
    @return 如果匹配,返回true 如果不匹配,返回false
    用栈解决括号匹配问题
     */
    private static boolean isMatch(String str) {
        //创建栈对象,用来存储左括号
        Stack<String> stack = new Stack<>();
        //从左往右遍历字符串
        for (int i = 0; i < str.length(); i++) {
            String currChar = str.charAt(i)+"";
            //判断当前字符串是否为左括号,如果是,则把字符放入栈中
            if (currChar.equals("(")){
                stack.push(currChar);
            }else if (currChar.equals(")")){
                //继续判断当前字符串是否是有符号,如果是,则从栈中弹出一个左括号,并判断弹出的结果是否为null,如果为null则返回false,如果有,则返回true
                String pop = stack.pop();
                if (pop==null){
                    return false;
                }
            }
        }
        //判断栈中还有没有剩余的左括号,如果有,则证明括号不匹配
        if (stack.size()==0){
//            System.out.println("匹配");
            return true;
        }else{
//            System.out.println("不匹配");
            return false;
        }
    }
}
