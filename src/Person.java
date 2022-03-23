import java.time.LocalDate;

public class Person extends Animal implements RunnableAgePrint {

    private LocalDate birthDate;
    private LocalDate nowDate;
    private long period;

    public Person() {
    }

    public Person(String name, int age, double weight, int leg) {
        super(name, age, weight, leg);
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setNowDate(LocalDate nowDate) {
        this.nowDate = nowDate;
    }

    public LocalDate getNowDate() {
        return nowDate;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    public long getPeriod() {
        return period;
    }



    @Override
    public String printAge() {
        if (birthDate.getMonthValue() > nowDate.getMonthValue()) {
            // 생일 달 > 현재 달
            return (getPeriod() + 2) + "살 ";
        }else if(birthDate.getMonthValue() == nowDate.getMonthValue()){
            // 생일 달 == 현재 달
            if(birthDate.getDayOfMonth()>nowDate.getDayOfMonth()){
                // 생일 일 > 현재 일
                return (getPeriod() + 2) + "살 ※같은달!!";

            }else return (getPeriod() + 1) + "살  ※같은달 !! ";

        }else return (getPeriod() + 1) + " 살 ";
    }
}


