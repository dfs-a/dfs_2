package Symbol;

public class OrderlySymbolTableTest {
    public static void main(String[] args) {
        OrderlySymbolTable<Integer, String> integer = new OrderlySymbolTable<>();
        integer.put(1,"海绵宝宝");
        integer.put(3,"派大星");
        integer.put(4,"章鱼哥");
        integer.put(5,"蟹老板");
        integer.put(2,"珍妮");
        System.out.println(integer.get(4));
    }
}
