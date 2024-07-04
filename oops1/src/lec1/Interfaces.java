package lec1;



interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    int speed =7;
    void applyBrake(int decrement){
        speed = speed-decrement;
    }
    void speedUp(int increment){
        speed = speed +increment;
    }

}

public class Interfaces {
    public static void main(String[] args) {

    }
}
