package com.labs.java.core;

public class ObjectDemo extends Object  {

    private int id;
    private String desc;

    public ObjectDemo(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public static void main(String[] args)  {
        ObjectDemo obj1 = new ObjectDemo(107, "Testing toString() #1");
//        String out = obj.toString();

        ObjectDemo obj2 = new ObjectDemo(104, "Testing toString() #2");

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1 == obj2); // false
        System.out.println(obj1.equals(obj2)); // true??

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1.getClass().getClassLoader());

        ObjectDemo obj3 = null;
        try {
            obj3 = (ObjectDemo) obj1.clone();
        }catch(CloneNotSupportedException e) {
            System.out.println("ERROR: CloneNotSupported. " + e.getMessage());
//            System.exit(1);
            return;
        }

//        ObjectDemo obj3 = obj1;

        System.out.println(obj1 == obj3);

        System.out.println(obj3);

    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Desc:" + this.desc;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ObjectDemo) {
            ObjectDemo obj1 = (ObjectDemo) obj;
            return this.id == obj1.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id % 3;

        // 100 % 3 ->  1
        // 103 % 3 -> 1
    }
}
