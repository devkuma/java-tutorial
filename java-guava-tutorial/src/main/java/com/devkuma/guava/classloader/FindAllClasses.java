package com.devkuma.guava.classloader;

import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.reflect.ClassPath;

public class FindAllClasses {

    public Set<Class> findAllClasses(String packageName) throws IOException {
        return ClassPath.from(ClassLoader.getSystemClassLoader())
                        .getAllClasses()
                        .stream()
                        .filter(clazz -> clazz.getPackageName()
                                              .startsWith(packageName))
                        .map(clazz -> clazz.load())
                        .collect(Collectors.toSet());
    }

    public static void main(String[] args) throws IOException {
        FindAllClasses instance = new FindAllClasses();

        Set<Class> classes = instance.findAllClasses("com.devkuma.guava");
        for (Class clazz : classes) {
            System.out.println(clazz.getCanonicalName());
        }
    }
}
