package com.ezen.beans;

public class TestPersonBean {
    public static void main(String[] args) {
        PersonBean person = new PersonBean();

        person.setName("Bob");
        person.setCoding(true);

        // Output: "Bob [coding]"
        System.out.print(person.getName());
        System.out.println(person.isCoding() ? " [coding]" : "");
    }
}
