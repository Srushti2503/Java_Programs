package MultiLevelInheritance;


/*Create class Media → Audio → Song
Add methods like play(), pause(), lyrics().

 */


public class Media {
    void play() {
        System.out.println("Media is playing");
    }
    public static void main(String[] args) {
        Song s = new Song();

        s.play();
        s.pause();
        s.lyrics();
    }
}
class Audio extends Media {
    void pause() {
        System.out.println("Audio is paused");
    }
}

class Song extends Audio {
    void lyrics() {
        System.out.println("Displaying song lyrics");
    }
}
