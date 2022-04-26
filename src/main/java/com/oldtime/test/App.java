package com.oldtime.test;

import org.bytedeco.javacpp.indexer.UByteIndexer;
import org.bytedeco.opencv.global.opencv_highgui;
import org.bytedeco.opencv.global.opencv_imgcodecs;
import org.bytedeco.opencv.global.opencv_imgproc;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Size;

import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    private static final String path = "src/main/resources/static/";

    private static final String charStr = " .,-'`:!1+*abcdefghijklmnopqrstuvwxyz<>()\\/{}[]?234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ%&@#$";

    public static void main( String[] args ) throws IOException {
        Mat img = opencv_imgcodecs.imread(path + "cards.png");

        opencv_imgproc.resize(img, img,new Size(), 0.3, 0.3, opencv_imgproc.CV_INTER_LINEAR);


        Mat imgGray = new Mat(img.size());
        opencv_imgproc.cvtColor(img, imgGray, opencv_imgproc.COLOR_BGR2GRAY);
        //opencv_imgproc.threshold(imgGray, imgGray, 127, 255, opencv_imgproc.CV_THRESH_BINARY);
        opencv_highgui.imshow("gray", imgGray);
        StringBuilder strImage = new StringBuilder();
        opencv_highgui.waitKey(0);
        UByteIndexer indexer = imgGray.createIndexer();
        int[]  bgr = new int[3];
        for (long i = 0; i < indexer.rows() -1; i++) {
            for (long j = 0; j <indexer.cols()-1; j++) {
                indexer.get(i,j, bgr);
                int gray = (bgr[0] + bgr[1] + bgr[2]) %  charStr.length() ;
                strImage.append(charStr.charAt(gray));
            }
            strImage.append("\n");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(path + "file.txt");
        fileOutputStream.write(strImage.toString().getBytes());
        fileOutputStream.close();
    }
}
