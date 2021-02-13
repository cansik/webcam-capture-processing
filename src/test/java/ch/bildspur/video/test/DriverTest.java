package ch.bildspur.video.test;

import com.github.sarxos.webcam.Webcam;

import java.util.List;

public class DriverTest {
    public static void main(String[] args) {
        List<Webcam> cams = Webcam.getWebcams();

        System.out.println("Cameras found: " + cams.size());
        for(Webcam cam : cams) {
            System.out.println(cam.getName());
        }
    }
}
