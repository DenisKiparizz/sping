package music.ganres;

public class RapMusic implements Music {
    @Override
    public String play() {
        return "Rap music is plaing";
    }

    @Override
    public String toString() {
        return "Rap";
    }
}
