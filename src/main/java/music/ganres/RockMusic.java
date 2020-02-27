package music.ganres;

public class RockMusic implements Music {
    @Override
    public String play() {
        return "Rock music is plaing";
    }

    @Override
    public String toString() {
        return "Rock";
    }
}
