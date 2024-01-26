package com.vt.utilities;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class FakerJavaImplements {

    private FakerJavaImplements(){}

    private static final Faker faker = new Faker();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    static int getNumber(int startvalue,int endvalue){
        return faker.number().numberBetween(startvalue, endvalue);
    }
    static String getFirstName(){
        return faker.name().firstName();
    }
    static String getLastName(){
        return faker.name().lastName();
    }
    
    static String getCompanyName() {return faker.company().name();}
    
    static String getDates(){return faker.date().toString();}
    static String getPrice(){ return  faker.commerce().price(0,1000);}
    static String getFoodItem(){return  faker.food().dish();}

    static String getCheckinDate() {
        return dateFormat.format(Calendar.getInstance().getTime());
    }
    static String getCheckoutDate(int daysInFuture) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, daysInFuture);
        Date checkoutDate = calendar.getTime();
        return dateFormat.format(checkoutDate);
    }


}
