package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Lesson20Generics {
    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add("SomeText");
        myList.add(1);

        //Casting to string in order to retrieve a string
        //Otherwise, without declaring the type when creating the list,
        // it considers everything to be an OBJECT

        String someText = (String) myList.get(0);
        int someInteger = (Integer) myList.get(1);


        //That equals to >
        //example with Generics. Always declare the type right away
        List<String> myList2 = new ArrayList<String>();
        String someText2 = myList2.get(0);

    }
}
