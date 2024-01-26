package com.vt.utilities;

public class RandomUtilsImpliments {
    //business layer --> all the business level changes

    private RandomUtilsImpliments(){}

    public static int getId(){
        return FakerJavaImplements.getNumber(1000,2000);
    }
    public static String getFirstName(){
        return FakerJavaImplements.getFirstName().toLowerCase();
    }
    public static String getLastName(){
        return FakerJavaImplements.getLastName().toLowerCase();
    }
    public static String getDate(){return FakerJavaImplements.getDates();}
    
    public static String getCompanyName(){return FakerJavaImplements.getCompanyName();}
    

    public static int getPrice(){
        String priceString = FakerJavaImplements.getPrice(); // Assuming this returns a string with a double value
        double priceDouble = Double.parseDouble(priceString);
        return (int) priceDouble;
    }
    public static String getfoodItem(){return FakerJavaImplements.getFoodItem();}
    public static String getCheckinDate(){return FakerJavaImplements.getCheckinDate();}
    public static String getCheckoutDate(){return FakerJavaImplements.getCheckoutDate(2);}



}
