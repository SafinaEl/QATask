package org.example.JavaOOPandTesting.src.main.java.org.deemoun;

public class Dog extends org.deemoun.Animal {
    private String DogBark;

    public String getBark() {
        return "Dog bark is: " + DogBark;
    }

    public void setBark(String name) { this.DogBark = name; }

}
