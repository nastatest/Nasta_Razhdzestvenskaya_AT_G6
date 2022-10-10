package main.java.classwork.day2;

public class FirstClass {

    private int x = 2;
    private int y = 3;

    private String name = "Bugagashka";
    private String surname = "Bo";

    public void doMath() {
        System.out.println(x + y);
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
