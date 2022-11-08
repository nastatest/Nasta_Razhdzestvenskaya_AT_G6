package main.java.homework.day12;

public class Mouse {

    private String pattern = "Mouse <n>";

    private String name;

    public Mouse(int number) {

        this.name = pattern.replace("<n>", String.valueOf(number));
    }

    public void peep() throws InterruptedException {
        System.out.println(name + " PEEP!");
        Thread.sleep(200);
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
        return "Mouse{" +
                "pattern='" + pattern + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
