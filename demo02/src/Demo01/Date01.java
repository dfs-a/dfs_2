package Demo01;

import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        demo01();
//        demo02();
        demo03();
    }

//    private static void demo02() {
//        Date date = new Date(1591098592666L);
//        System.out.println(date);
//
//    }

    public static void demo01(){
        Date date = new Date();
        System.out.println(date);
//        System.out.println(System.currentTimeMillis());
    }
    public static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
