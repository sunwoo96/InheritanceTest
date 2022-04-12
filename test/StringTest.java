import org.junit.Test;

public class StringTest {

    /* 불변 */
    String a = "hello"; // 리터럴 할당
    String b = "hello"; // 리터럴 할당
    String c = new String("hello"); // 객체 할당
    String d = a + " world";

    /* 가변 */
    StringBuilder e = new StringBuilder("hello");
    StringBuffer f  = new StringBuffer("hello spring");

    @Test
    public void stringBuilderTest(){
        System.out.println(a.equals(b)); // 값을 비교 true
        System.out.println(a==b); // 주소 비교 true
        System.out.println(a==c); // 주소 비교 false
        System.out.println(a.equals(c)); // 값을 비교 true
        System.out.println(d); // hello world

        System.out.println(e.append(" spring"));
        System.out.println(f);


    }
}
