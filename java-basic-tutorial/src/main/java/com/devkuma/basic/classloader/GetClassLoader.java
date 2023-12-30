package com.devkuma.basic.classloader;

class GetClassLoader {
    public static void main(String[] args) {
        // Bootstrap class loader
        System.out.println("- Bootstrap Class Loader");
        ClassLoader bootstrap = "".getClass().getClassLoader();
        System.out.println(bootstrap);
        if (bootstrap != null) {
            ClassLoader parent = bootstrap.getParent();
            System.out.println(parent);
        } else {
            System.out.println("No parent");
        }

        // Platform Class Loader
        System.out.println("- Platform Class Loader");
        ClassLoader extensions = GetClassLoader.class.getClassLoader().getParent();
        System.out.println(extensions);
        if (extensions != null) {
            ClassLoader parent = extensions.getParent();
            System.out.println(parent);
        } else {
            System.out.println("No parent");
        }

        // System Class Loader
        System.out.println("- System Class Loader");
        DemoClass myObj = new DemoClass();
        ClassLoader systems = myObj.getClass().getClassLoader();
        System.out.println(systems);
        if (systems != null) {
            ClassLoader parent = systems.getParent();
            System.out.println(parent);
        } else {
            System.out.println("No parent");
        }

        // Context Classloader
        System.out.println("- Context Classloader");
        ClassLoader threads = Thread.currentThread().getContextClassLoader();
        System.out.println(threads);
        if (threads != null) {
            ClassLoader parent = threads.getParent();
            System.out.println(parent);
        } else {
            System.out.println("No parent");
        }
    }
}

class DemoClass {
    String getClassName() {
        return "DemoClass";
    }
}
