package edu.hillel.oopdemo;

/**
 * Created by vesar on 21.02.2016.
 */
public class mainClass {
    public static void main(String[] args) {
//        System.out.println("cars number = "+ Car.getCounter());
//        Car myCar = new Car(17);
//        System.out.println("cars number = "+ Car.getCounter());
//        AirPlane plane = new AirPlane();
//
//        myCar.accelerate();
//        plane.accelerate();
// ==============================================================================================================

        Earth myEarth = Earth.getInstance();
        System.out.println("Continents = " + myEarth.getContinentsNumber());
        Earth yourEarth = Earth.getInstance();
        System.out.println("Population on yours Earth = " + yourEarth.getPopulation());
        System.out.println("PolutionLevel is = " + myEarth.getPolutionLevel());
        System.out.println("Diametr Earth is = " + myEarth.DIAMETR);
        System.out.println("========================");
        myEarth.spendTime(20);
        System.out.println("Spend 5 years");
        System.out.println("========================");
        System.out.println("Population on my Earth = " + myEarth.getPopulation());











//=================================================================================================================
        // public // видно везде
        // private // только внутри класса
        // protected //видно в пакете и в наследниках


    }
}
