package org.wzorce.kreacyjne.prostafabryk;

public class Bakery {

//    private static String dupa = "asd";
//
//    private String name = "qwe";

    public static Bake create(String order){
        switch(order){
            case "kajzerka":
                return new Kajzerka();
            case "grahamka":
                return new Grahamka();
            default:
                throw new RuntimeException("Ni ma");
        }
    }

}
