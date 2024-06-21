package com.labs.java.pkg1;

// Import class from different package

import com.labs.java.pkg2.*;
import com.labs.java.core.*;

// static import
import static com.labs.java.pkg2.PackageDemo.*;

public class PackageTest {
    public static void main(String[] args) {
        incrementCounter();
        printCounter();

        System.out.println(COUNTER);

//        PackageDemo obj1 = new PackageDemo();
//
//        PackageDemo1 obj2 = new PackageDemo1();

    }
}
