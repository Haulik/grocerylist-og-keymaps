import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args)throws FileNotFoundException, NoSuchElementException, NullPointerException {

        GroceryList list = new GroceryList();
        list.readlist();
        list.addItem();
        list.showGrocList();

    }
}
