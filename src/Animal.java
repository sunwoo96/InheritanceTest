public  class Animal {

    private String name;
    private double weight;
    private int leg;

    public Animal(String name, double weight, int leg) {
        this.name = name;
        this.weight = weight;
        this.leg = leg;
    }

    // default 생성자
    public Animal(){}

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
