public class Cat extends Animal{

    Cat(){}
    Cat(String name, int age, double weight, int leg){
        // 부모클래스의 생성자 super()
        super(name, age, weight, leg);
    }

    /* cry() 오버라이드*/
    @Override
    public void cry(){
        System.out.println("야옹~");
    }

}
