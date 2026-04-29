package com.sample.questions;

class SingletonDesignDemo {

    private static SingletonDesignDemo singletonDesignDemo = null;

    private SingletonDesignDemo() {
    }

    public static synchronized SingletonDesignDemo getInstance() {

        if (singletonDesignDemo == null)
            singletonDesignDemo = new SingletonDesignDemo();

        return singletonDesignDemo;
    }

    public static void main(String[] args) {
        System.out.println("Checking hashcode value by calling Singleton instance");

        SingletonDesignDemo x = SingletonDesignDemo.getInstance();
        SingletonDesignDemo y = SingletonDesignDemo.getInstance();
        SingletonDesignDemo z = SingletonDesignDemo.getInstance();

        System.out.println("Hash Code of X is: " + x.hashCode());
        System.out.println("Hash Code of Y is: " + y.hashCode());
        System.out.println("Hash Code of Z is: " + z.hashCode());

        // Checking object reference values for all the three
        if (x == y && y == z) {
            System.out.println("The objects are pointing to the same memory location i.e, the same object");
        } else {
            System.out.println("The objects are pointing to the same memory location");
        }
    }
}
