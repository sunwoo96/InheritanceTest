public class Cat extends Animal{

    Cat(){}
    Cat(String name, double weight, int leg){
        // 부모클래스의 생성자 super()
        super(name, weight, leg);
    }

    /* cry() 오버라이드*/
    public void cry(){
        System.out.println("야옹~");
    }

}
