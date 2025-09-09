import java.math.BigDecimal;

public class Working {
    int a = 5;
    Integer b = a;
    int c = b;
    short sh = 2;
    int d =sh;
    Integer in = d;
    //ст 25
    //regex
    //TODO finish tests
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        BigDecimal big = new BigDecimal(10 );
        String a = "New String";
        String b = new String("New String");
        String c = "New String";
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.replace("e","ab"));
        System.out.println(a);
        a.split(" ");
       char [] charArray = {'A', 'B'};
    String d = new String(charArray);
    }
}
