package ch.bildspur.video;

import com.github.sarxos.webcam.Webcam;
import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.nio.ByteBuffer;

public class Capture extends PImage {
    private final PApplet sketch;
    private Webcam webcam;

    public Capture(PApplet sketch, int width, int height) {
        super(width, height, RGB);

        this.sketch = sketch;
    }

    public void start() {
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(width, height));
        webcam.open();
    }

    public void read() {
        ByteBuffer data = webcam.getImageBytes();

        for(int i = 0; i < pixels.length; i++) {
            pixels[i] = (data.get() & 0xFF) << 16 |
                        (data.get() & 0xFF) << 8 |
                        (data.get() & 0xFF);
        }

        updatePixels();
    }

    public void stop() {
        webcam.close();
    }

    public boolean available() {
        return webcam.isImageNew();
    }
}
