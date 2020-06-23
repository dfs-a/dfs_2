package tree;

public class RedBlackTreeTest {
    public static void main(String[] args) {
        RedBlackTree01<String, String> tree = new RedBlackTree01<>();
        String r1 = tree.get("1");
        System.out.println(r1);
        tree.put("1","阿");
        tree.put("2","咩");
        String r2 = tree.get("1");
        System.out.println(r2);

        String r3 = tree.get("2");
        System.out.println(r3);
    }
}
