package lesson9;

public final class FinalClasses {

    private int someInt;

    public int multiplyBySomeInt(int anotherInt) {
        return anotherInt * someInt;
    }
}

//Final classes cannot be extended
//class ExtendedFinalClasses extends