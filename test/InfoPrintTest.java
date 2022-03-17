import org.junit.jupiter.api.Test;

class InfoPrintTest {

    @Test
    public void animalInfoPrint() throws Exception {
        //given
        Animal ani = new Animal();
        //when
        ani.setName("animal");
        ani.setWeight(100.0);
        ani.setLeg(2);

        //then
        ani.infoPrint(ani);

    }

    @Test
    public void dogInfoPrint() throws Exception {
        //given
        /*  dog 다양성 Test */
        Animal koggi = new Dog();

        //when
        koggi.setName("웰시코기");
        koggi.setWeight(11.0);
        koggi.setLeg(4);
        //then
        koggi.infoPrint(koggi);
    }

    @Test
    public void catInfoPrint() throws Exception {
        //given
        /*  cat 다양성 Test */
        Animal cheese = new Cat();

        //when
        cheese.setName("치즈");
        cheese.setWeight(7.00);
        cheese.setLeg(4);

        //then
        cheese.infoPrint(cheese);
    }
}