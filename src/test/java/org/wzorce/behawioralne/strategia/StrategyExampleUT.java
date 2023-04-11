package org.wzorce.behawioralne.strategia;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StrategyExampleUT {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("--beforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("--afterEach");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }

    @Test
    public void strategyExample(){
        StrategyUsage strategyUsage = new StrategyUsage();

        strategyUsage.strategy(new Child());
        strategyUsage.strategy(new Kiddo());
    }

}
