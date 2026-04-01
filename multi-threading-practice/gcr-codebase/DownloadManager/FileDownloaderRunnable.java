package DownloadManager;

import java.util.Random;

public class FileDownloaderRunnable implements Runnable {
    private String fileName;
    private Random random = new Random();

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            for (int progress = 0; progress <= 100; progress += 10) {
                System.out.println("[" + Thread.currentThread().getName() +"] Downloading " + fileName + ": "+progress + "%");
                Thread.sleep(500 + random.nextInt(500)); // random delay
            }
        }catch (InterruptedException e) {
            System.out.println(fileName + " download interrupted.");
        }
    }
}

