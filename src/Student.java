public class Student extends Person{

    Student(){}
    Student(String name, int age, double weight, int leg){
        super(name, age, weight, leg);
    }

    public void study(){
        System.out.println("studing....");
    }

}
