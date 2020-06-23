package Demo01;

public class Dome03 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.println(j);
//            }
//            System.out.println("------");
//        }
        SequenceList<String> s1 = new SequenceList<>(10);
        s1.insert("12");
        s1.insert("13");
        s1.insert("18");
        s1.insert("19");
        String getresult = s1.get(1);
//        System.out.println(getresult);
        s1.insert(1,"无所谓");
        String result = s1.get(3);
//        System.out.println(result);
//        System.out.println(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.get(i));
        }
    }
}
