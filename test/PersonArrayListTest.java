import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class PersonArrayListTest {
    List<Person> list = new ArrayList<>() {};

    Person teacher = new Person("선생님",35,80.0,2);
    Person student = new Person("학생",17,60,2);

    Stream<Person> listStream = list.stream();

    @Test
    public void 리스트출력() throws Exception{
        //given
        //when
        list.add(teacher);
        list.add(student);
        //then
        /* for Each 문 */
        //for (Person p:list) { System.out.println(p);}
        list.forEach(System.out::println);


    } // 리스트출력()

    @Test
    public void 객체비교() throws Exception {
        //given

        //when
        list.add(teacher);
        list.add(student);
        Person p1 = list.get(0);
        Person p2 = list.get(1);

        //then
        /*객체 비교 */
        assertEquals(p1,teacher);
        assertEquals(p2,student);
    }

    @Test
    public void 스트림테스트() throws Exception {
        //given
        List<String> list = Arrays.asList("student", "teacher", "police", "fireman", "teacher");
        //when
        /* Filter "a" 포함하는 문자열*/
        Stream<String> stream1 = list.stream().filter(name -> name.contains("a"));
        /*Map 대문자로 데이터 변환*/
        Stream<String> stream2 = list.stream().map(s -> s.toUpperCase(Locale.ROOT));
        /*sorted 정렬 */
        Stream<String> stream3 = list.stream().sorted();
        /*distinct 중복 제거*/
        Stream<String> stream4 = list.stream().distinct();

        //then
        System.out.println("** 문자 포함");
        stream1.forEach(job -> System.out.println(job+" "));
        System.out.println("**대문자 변환");
        stream2.forEach(s -> System.out.println(s+" "));
        System.out.println("**정렬");
        stream3.forEach(s -> System.out.println(s+" "));
        System.out.println("**중복 제거");
        stream4.forEach(s -> System.out.println(s+" "));
    }

} // PersonArrayListTest
