import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        List<String> list = Arrays.asList("student", "teacher", "police", "fireman" );
        //when
        /*"a" 포함하는 문자열*/
        Stream<String> stream = list.stream().filter(name -> name.contains("a"));
        //then
        stream.forEach(job -> System.out.println(job+" "));

    }

} // PersonArrayListTest
