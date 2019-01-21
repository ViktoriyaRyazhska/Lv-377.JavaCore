package com.company;

public class Month {
   public int numberMonth;
    public int dayAmaunt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Month() {
    }

    public Month(int numberMonth, int dayAmaunt) {
        this.numberMonth = numberMonth;
        this.dayAmaunt = dayAmaunt;
        this.name = name;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public void setNumberMonth(int numberMonth) {
        this.numberMonth = numberMonth;

    }

    public int getDayAmaunt() {
        return dayAmaunt;
    }

    public void setDayAmaunt(int dayAmaunt) {
        this.dayAmaunt = dayAmaunt;
    }


    @Override
    public String toString() {
        return "Month{" +
                "numberMonth=" + numberMonth +
                ", dayAmaunt=" + dayAmaunt +
                '}';
    }

    static String getInfo (String name, int dayAmaunt){
      return name + ", " + dayAmaunt;
    }
}


