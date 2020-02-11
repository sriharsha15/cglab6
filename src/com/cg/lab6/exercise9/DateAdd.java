package com.cg.lab6.exercise9;

import java.time.LocalDate;
import java.time.Period;

public class DateAdd {

	void acceptDate(int years,int month,int date)
    {
   	LocalDate pdate = LocalDate.of(years,month,date);
    LocalDate now = LocalDate.now();
    System.out.println(now);
    Period diff = Period.between(pdate, now);
    System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
            diff.getYears(), diff.getMonths(), diff.getDays());

   	 //Date current=cal.getTime();
   	 // cal.add(Calendar.DATE,date);
   	 //Date coming=cal.getTime();
   	// System.out.println(current);
   	// System.out.println(coming);
    }
}
