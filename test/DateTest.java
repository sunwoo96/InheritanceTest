
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class DateTest {
    @Test
    public void 나이출력() throws Exception {
        //given
        Person wilson = new Person();
        wilson.setBirthDate(LocalDate.of(1996,3,20));
        wilson.setNowDate(LocalDate.now());
        //when
        wilson.setPeriod(ChronoUnit.YEARS.between(wilson.getBirthDate(),wilson.getNowDate()));
        //then
        System.out.println("생일 : "+wilson.getBirthDate());
        System.out.println("현재 : "+wilson.getNowDate());
        System.out.println("나이 : "+wilson.printAge());

        /*달 확인*//*
        System.out.println(wilson.getBirthDate().getMonthValue());
        System.out.println(wilson.getNowDate().getMonthValue());
        *//*일 확인*//*
        System.out.println(wilson.getBirthDate().getDayOfMonth());
        System.out.println(wilson.getNowDate().getDayOfMonth());*/
    }
}