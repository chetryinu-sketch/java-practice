import Media.Music;
import Media.Video;

public class Main {

    public static void main(String[] args) {

        System.out.println("Name: Inu Chetry");
        System.out.println("URN: 2581328");
        System.out.println();

        Music music = new Music();
        Video video = new Video();

        music.play();
        video.play();

        int num = 10;
        Integer number = num;

        System.out.println("Autoboxing: " + number);

        String str = "25";
        int value = Integer.parseInt(str);

        System.out.println("Integer.parseInt(): " + value);

        Integer x = 50;
        int y = x;

        System.out.println("Unboxing: " + y);
    }
}