package com.devkuma.designpattern.iterator;

public class Main {
    public static void main(String[] args) {

        ClassRoom classRoom = new ClassRoom(4);
        classRoom.appendStudent(new Student("devkuma"));
        classRoom.appendStudent(new Student("kimkc"));
        classRoom.appendStudent(new Student("yunho"));
        classRoom.appendStudent(new Student("etkim"));

        Iterator iterator= classRoom.iterator();

        while (iterator.hasNext()) {
            Student student = (Student)iterator.next();
            System.out.println(student.getName());
        }
    }
}
