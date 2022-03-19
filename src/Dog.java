public class Dog extends Animal {

    public Dog() {}
    public Dog(String name, double weight, int leg){
        // 부모클래스의 생성자 super()
        super(name, weight, leg);
    }

    /* cry() 오버라이드*/
    @Override
    public void cry(){
        System.out.println("왈왈~");
    }

}
