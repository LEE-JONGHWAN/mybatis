package com.ezen.beans;

public class PersonBean implements java.io.Serializable { // 조건 1: Serializable
	private static final long serialVersionUID = -2794443708249108104L;
	private String name; // 조건 3: private
    private boolean coding;

    // 조건 2: 기본 생성자 (인자가 없는).
    public PersonBean(){}

    // 	조건 4: getter/setter
    public String getName(){return this.name;} 
    public void setName(String name){this.name = name;}

    // Different semantics for a boolean field (is vs. get)

    public boolean isCoding(){return this.coding;}
    public void setCoding(boolean coding){this.coding = coding;}

}