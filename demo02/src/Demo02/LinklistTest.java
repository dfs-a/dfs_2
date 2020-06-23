package Demo02;

import Demo01.SequenceList;

public class LinklistTest {
    public static void main(String[] args) {
        //单向链表对象
        Linklist<String> s1 = new Linklist<>();
        s1.insert("12");
        s1.insert("13");
        s1.insert("18");
        s1.insert("19");
        String getresult = s1.get(1);
//        System.out.println(getresult);
        s1.insert(1,"无所谓");
        String result = s1.get(3);
        System.out.println(result);
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.get(i));
        }
    }
}
