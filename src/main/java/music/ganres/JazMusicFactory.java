package music.ganres;

public class JazMusicFactory implements Music {
    private JazMusicFactory() {
    }

    public static JazMusicFactory getInstance() {
        return new JazMusicFactory();
    }

    @Override
    public String play() {
        return "Jazz Music is plaing";
    }

    @Override
    public String toString() {
        return "Jazz";
    }
}
