# Webcam Capture Processing
A very basic webcam capture solution for processing.

This library is a proof of concept and is not intended for production.

```processing
import ch.bildspur.video.*;

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

### Build
Use the [release.sh](release.sh) to build the library.

### About
Developed by cansik - based on [webcam-capture](https://github.com/sarxos/webcam-capture)