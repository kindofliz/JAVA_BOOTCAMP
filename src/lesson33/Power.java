package lesson33;

public class Power {

    public float pow (float base, int power) {


        float result = 1;

        for (int i = 0; i < power; i++) {
            result = result * base;
        }

        return result;
    }
}
