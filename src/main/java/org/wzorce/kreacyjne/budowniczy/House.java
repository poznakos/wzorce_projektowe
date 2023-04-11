package org.wzorce.kreacyjne.budowniczy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
public class House {

    private Garden garden;
    private Garage garage;
    private Pool pool;
    private String name;

    public House() {
    }

    public House(Garage garage) {
        this.garage = garage;
        this.garden = new Garden();
        this.pool.metoda1();
    }

    public House(Garden garden) {
    }

    public House(Garage garage, Garden garden) {
    }

    public House(String param1, String param2, String param3, String param4, String param5, String param6, String param7) {
    }

    public House(String nazwaDomu) {
    }

    public static class Garage {
    }

    public static class Garden {
    }

    private class Pool {
        public void metoda1(){}
    }

//    public House(String ulica){}
}
