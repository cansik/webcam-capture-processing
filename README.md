# Webcam Capture Processing
A very basic webcam capture solution for processing.

```processing
Capture cam;

public void setup() {
    size(640, 480);

    cam = new Capture(this, 640, 480);
    cam.start();
}

public void draw() {
    background(55);

    if (cam.available()) {
        cam.read();
    }

    image(cam, 0, 0, width, height);
}
```