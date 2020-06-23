package tree;

import Demo02.Queue;

public class BinaryErgodocTest {
    public static void main(String[] args) {
        //前序排列
        //创建树对象
//        Binary<String, String> tree = new Binary<>();
//        //往树中添加数据
//        tree.put("E","5");
//        tree.put("B","2");
//        tree.put("G","7");
//        tree.put("A","1");
//        tree.put("D","4");
//        tree.put("F","6");
//        tree.put("H","8");
//        tree.put("C","3");
//        //遍历
//        Queue<String> keys = tree.preErgodic();
//        for (String key:keys){
//            String value = tree.get(key);
//            System.out.println(key+"---"+value);
//        }


        //中序遍历
//        Binary<String, String> tree = new Binary<>();
//        //往树中添加数据
//        tree.put("E","5");
//        tree.put("B","2");
//        tree.put("G","7");
//        tree.put("A","1");
//        tree.put("D","4");
//        tree.put("F","6");
//        tree.put("H","8");
//        tree.put("C","3");
//        //遍历
//        Queue<String> keys = tree.midErgodic();
//        for (String key:keys){
//            String value = tree.get(key);
//            System.out.println(key+"---"+value);
//        }

        //后序遍历
//        Binary<String, String> tree = new Binary<>();
//        //往树中添加数据
//        tree.put("E","5");
//        tree.put("B","2");
//        tree.put("G","7");
//        tree.put("A","1");
//        tree.put("D","4");
//        tree.put("F","6");
//        tree.put("H","8");
//        tree.put("C","3");
//        //遍历
//        Queue<String> keys = tree.afterErgodic();
//        for (String key:keys){
//            String value = tree.get(key);
//            System.out.println(key+"---"+value);
//        }


        //层序遍历
        Binary<String, String> tree = new Binary<>();
        //往树中添加数据
        tree.put("E","5");
        tree.put("B","2");
        tree.put("G","7");
        tree.put("A","1");
        tree.put("D","4");
        tree.put("F","6");
        tree.put("H","8");
        tree.put("C","3");
        //遍历
        Queue<String> keys = tree.layerErgodic();
        for (String key:keys){
            String value = tree.get(key);
            System.out.println(key+"---"+value);
        }
    }
}
