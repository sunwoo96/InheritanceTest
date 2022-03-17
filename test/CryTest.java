import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CryTest {

    @Test
    @DisplayName("동물 cry")
    public void animalCryTest() throws Exception {
        //given
        Animal ani = new Animal();
        //when
        ani.setName("animal");
        //then
        ani.cry();
    }

    @Test
    @DisplayName("강아지 cry")
    public void  dogCryTest() throws Exception{

        //given
        /*  dog 다양성 Test */
        Animal koggi = new Dog();

        //when
        koggi.setName("웰시코기");

        //then
        koggi.cry();
    }

    @Test
    @DisplayName("고양이 cry")
    public void catCryTest() throws Exception {
        //given
        /*  cat 다양성 Test */
        Animal cat1 = new Cat();

        //when
        cat1.setName("치즈");
        //then
        cat1.cry();
    }
}