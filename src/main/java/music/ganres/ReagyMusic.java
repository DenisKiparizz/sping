package music.ganres;

public class ReagyMusic implements Music {
    public void doInit() {
        System.out.println("Init method");
    }

    public void doDestroi() {
        System.out.println("Destroy method");
    }

    @Override
    public String play() {
        return "Reagy music is plaing";
    }

    @Override
    public String toString() {
        return "Reagy" ;
    }
}
