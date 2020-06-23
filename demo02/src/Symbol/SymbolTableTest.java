package Symbol;

public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer, String> symboltable = new SymbolTable<Integer, String>();
        //测试put方法
        symboltable.put(1,"海绵宝宝");
        symboltable.put(2,"派大星");
        symboltable.put(3,"章鱼哥");
        System.out.println("插入后的个数为:"+symboltable.size());
        //测试get方法
        String reslut = symboltable.get(1);
        System.out.println("取到的值为"+reslut);
        //测试删除方法
        symboltable.delete(1);
        int num = symboltable.size();
        System.out.println(num);

    }
}
