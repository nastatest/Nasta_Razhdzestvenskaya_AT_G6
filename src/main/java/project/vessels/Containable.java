package main.java.project.vessels;

import main.java.project.contents.Transformable;

public interface Containable {

    public void addStuff(Transformable stuff); //adds some stuff (e.g. water, sand) to Containable object

    public Transformable removeStuff(); //removes all stuff away

    public boolean isEmpty(); //returns true if there is no stuff inside

    public int getFreeSpace(); //returns an integer value of free millilitres

    public void open() throws InterruptedException; //forces Containable to be opened

    public void close(); //forces Containable to be closed
}
