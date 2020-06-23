package Demo02;

public class TowWaylistTest {
        public static void main(String[] args) {
            //双向链表对象
            TowWayList<String> s1 = new TowWayList<>();
            s1.insert("12");
            s1.insert("13");
            s1.insert("18");
            s1.insert("19");
            String getresult = s1.get(1);
//        System.out.println(getresult);
            s1.insert(1,"无所谓");
            String result = s1.get(3);
//            System.out.println(result);
            for (int i = 0; i < s1.length(); i++) {
                System.out.println(s1.get(i));
            }
            System.out.println("--------------");
            System.out.println("第一个元素是"+s1.getFirst());
            System.out.println("最后一个元素为"+s1.getLast());

        }
}
