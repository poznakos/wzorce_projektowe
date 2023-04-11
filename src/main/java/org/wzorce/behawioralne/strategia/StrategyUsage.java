package org.wzorce.behawioralne.strategia;

public class StrategyUsage {

    public void strategy(Parent parent){
        metoda1();
        parent.parentMethod();
        metoda2();
    }

    private void metoda1() {
        System.out.println("----Run");
    }

    private void metoda2() {
        System.out.println("----End");
    }
}
