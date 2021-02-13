package ch.bildspur.video.test;


import ch.bildspur.video.Capture;
import processing.core.PApplet;

public class Sketch extends PApplet {

    public static void main(String... args) {
        Sketch sketch = new Sketch();
        sketch.runSketch();
    }

    public void settings() {
        size(640, 480, FX2D);
    }

    Capture cam;

    public void setup() {
        cam = new Capture(this, 640, 480);
        cam.start();
    }

    public void draw() {
        background(55);

        if (cam.available()) {
            cam.read();
        }

        image(cam, 0, 0, width, height);

        surface.setTitle("Webcam Capture Test - FPS: " + Math.round(frameRate));
    }
}
