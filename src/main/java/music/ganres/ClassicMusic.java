package music.ganres;

public class ClassicMusic implements Music {

    @Override
    public String play() {
       return"Classic music is plaing";
    }

    @Override
    public String toString() {
        return "Classic";
    }
}
