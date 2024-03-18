import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Audio {
    public static void AudioLive(File file)
            throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        String response = " ";
        do {
            try {
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                else
                    Runtime.getRuntime().exec("clear");
            } catch (IOException | InterruptedException ex) {
            }

            System.out.println("Chill waaaaa.........");
            System.out.println("What do you want to do?");
            System.out.println("1. Play");
            System.out.println("2. Stop");
            System.out.println("3. Reset");
            System.out.println("4. Exit");
            do {
                System.out.print("Enter your choice: ");

                response = scanner.nextLine();

            } while (!response.equals("1") && !response.equals("2") && !response.equals("3") && !response.equals("4"));
            switch (response) {
                case "1":
                    clip.start();
                    break;
                case "2":
                    clip.stop();
                    break;
                case "3":
                    clip.setMicrosecondPosition(0);
            }
        } while (!response.equals("4"));
        clip.stop();
    }
}
