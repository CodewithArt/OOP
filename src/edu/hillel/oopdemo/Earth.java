package edu.hillel.oopdemo;

/**
 * Created by vesar on 28.02.2016.
 */
public class Earth {


    public final double DIAMETR;
    private int continentsNumber;
    private long population;
    private double polutionLevel;

    public int getContinentsNumber() {
        return continentsNumber;
    }

    public long getPopulation() {
        return population;
    }

    public double getPolutionLevel() {
        return polutionLevel;
    }

    private Earth() {
        DIAMETR = 30000;
        continentsNumber = 5;
        population = 14000;
        polutionLevel = 5;

    }


    private static Earth instance;
    public static Earth getInstance() {
        if (instance == null)
            instance = new Earth();
        return instance;
    }

    public void spendTime(int years) {
        population *= Math.pow(2, years/10);
        polutionLevel = population / 1_000_000;
        polutionLevel = polutionLevel > 100 ? 100 : polutionLevel;
        continentsNumber = polutionLevel > 80 ? 2 : 5;
    }
}
