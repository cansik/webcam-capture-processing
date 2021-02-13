package ch.bildspur.video;

import processing.core.PApplet;
import processing.core.PImage;

public class Capture extends PImage {
    private PApplet sketch;

    public Capture(PApplet sketch, int width, int height) {
        super(width, height, RGB);

        this.sketch = sketch;
    }

    public void start() {

    }

    public void read() {

    }

    public void stop() {

    }

    public boolean available() {
        return false;
    }
}
