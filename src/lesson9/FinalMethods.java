package lesson9;

public class FinalMethods {

    //intialized during declaration
    final int CONSTANT_PI = 3;
    private int someVar;

    //non-initialized during declaration
    //HAS TO BE INITIALIZED INSIDE ALL CONSTRUCTORS
    final int CONSTANT_NOINIT;



    public FinalMethods() {
        CONSTANT_NOINIT = 5;
    }

    public FinalMethods(int someVar) {
        CONSTANT_NOINIT = 5;
        this.someVar = someVar;
    }




    public final void printHello() {
        System.out.println("Hello!");
    }
}


//class ExtendedFinalMethods extends FinalMethods{

//FINAL METHODS CANNOT BE OVERRIDDEN
//    @Override
//    public void printHello() {
//        System.out.println("Bye!");
//    }
//}
