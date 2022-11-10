package main.java.homework.day12;

public class Hedgehog {

    private String pattern = "Hedgehog <n>";

    private String name;

    public Hedgehog(int number) {

        this.name = pattern.replace("<n>", String.valueOf(number));
    }

    public void tellMe() throws InterruptedException {

        System.out.println("I am " + name + "!");
        Thread.sleep(50);
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hedgehog{" +
                "pattern='" + pattern + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
