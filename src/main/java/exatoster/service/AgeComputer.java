package exatoster.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;


@Service
public class AgeComputer implements IAgeComputer{
    @Override
    public int compute(int birthday) {
        LocalDate refDate = LocalDate.of(birthday,1,1);
        LocalDate now = LocalDate.now();
        return Period.between(refDate,now).getYears();
    }
}
