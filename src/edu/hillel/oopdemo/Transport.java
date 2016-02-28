package edu.hillel.oopdemo;

/**
 * Created by vesar on 21.02.2016.
 */
public class Transport {
    int velocity;
    int age;
    private final int MAX_X = 100;
    private final int MAX_Y = 100;
    private final int MIN_X = -100;
    private final int MIN_Y = -100;

    int posX, posY;

    Transport(int initX, int iniY) {
        posX = initX;
        posY = iniY;
        age = 0;
    }
    void moveTo(int dX, int dY) {
        posX += dX;
        posY += dY;

        if (posX > MAX_X)
            posX = MAX_X;
        else if (posX + dX < MIN_X)
            posX = MIN_X;

        if (posY > MAX_Y)
            posY = MAX_Y;
        else if (posY + dY < MIN_Y)
            posY = MIN_Y;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float value) {
        if (value >= 0)
            age = (int)value;
        else
            System.out.println("wrong age");
    }

    public void getPosition() {
        System.out.println("Position is (" + posX + ";" + posY + ")");
    }


}
