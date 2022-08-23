package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;
        double total =0;

        try{
            //Write the logic
            for (int i = 0; i < ageRawData.length ; i++) {
                total =  total + Integer.parseInt(ageRawData[i]) ;
                avg = total/ageRawData.length;}

            //Handle specific exception
        }
            catch (NumberFormatException e)
        {
            System.out.println("e = " + e);
            return e.toString();
        }
        return String.valueOf(avg);
    }



}
