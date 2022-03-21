public  class Animal implements RunnableCry {

    private String name;
    private int age;
    private double weight;
    private int leg;

    public Animal(String name, int age, double weight, int leg) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.leg = leg;
    }

    // default 생성자
    public Animal(){}

    @Override
    public void cry(){
        System.out.println("animal cry");
    };

    public void infoPrint(Animal ani){
        System.out.println("이름 : "+ani.getName()+" 체중 : "+ani.getWeight() +" kg 다리 : "+ani.getLeg()+"개");
    }

    /* getter, setter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }


}
