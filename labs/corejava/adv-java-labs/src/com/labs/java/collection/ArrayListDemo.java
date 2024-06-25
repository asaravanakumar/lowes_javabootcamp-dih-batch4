package com.labs.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        System.out.println("####################Collection Implementation");
        Collection skills = new ArrayList();

        skills.add("Java");
        skills.add("Python");
        skills.add("Node JS");

        System.out.println(skills.size());
        System.out.println(skills);

        skills.remove("Python");
        skills.add("Javascript");

        System.out.println(skills);

        System.out.println("################List Implementation");
        List skillsList = new ArrayList();
        skillsList.add("Java");
        skillsList.add(0,"Python");
        skillsList.add(1,"Javascript");

        System.out.println(skillsList);

        skillsList.set(1, "Node JS");
        System.out.println(skillsList);

        skillsList.remove(0);

        System.out.println(skillsList.get(1));

        System.out.println(skillsList);

        System.out.println("##################Iterator");
        // [Java, Python, Node JS]
        //                   ^
        Iterator it = skills.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("######################ForEach");

        for(Object skill: skills) {
            System.out.println(skill);
        }

    }
}
