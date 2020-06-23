package tree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        //创建二叉查找树对象
        Binary<Integer, String> tree = new Binary<Integer, String>();
        //测试插入
        tree.put(1,"派大星");
        tree.put(2,"章鱼哥");
        tree.put(3,"蟹老板");
        System.out.println("插入完成后的个数为:"+tree.size());
        //测试获取
        System.out.println("键2对应的元素是:"+tree.get(2));
        //测试删除
        tree.delete(3);
        System.out.println("删除后的元素个数为:"+tree.size());
        System.out.println("删除键3后对应的元素:"+tree.get(3));
    }
}
