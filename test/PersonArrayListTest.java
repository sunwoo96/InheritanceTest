import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PersonArrayListTest {
    ArrayList<Person> list = new ArrayList<>() {};

    Person teacher = new Person("선생님",35,80.0,2);
    Person student = new Person("학생",17,60,2);

    @Test
    public void 리스트출력() throws Exception{
        //given
        //when
        list.add(teacher);
        list.add(student);
        //then
        for (Person p:list) { System.out.println(p);}

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

} // PersonArrayListTest
