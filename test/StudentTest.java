import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    public void 학생정보() throws Exception {
        //given
        Student st1 = new Student();

        //when
        st1.setName("나학생");
        st1.setAge(18);
        st1.setWeight(60.0);
        st1.setLeg(2);

        //then
        st1.infoPrint(st1);
    }
}