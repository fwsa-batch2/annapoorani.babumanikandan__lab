public class Abc {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(a==b);
        String c =new String("abc");
        String d =new String("abc");
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
}
