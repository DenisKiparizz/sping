package music;

import music.ganres.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlaceWhereMusicPlay {
    private Music music;
    private String name;
    private int valum;
    private List<Music> allGender;

    public List<Music> getAllGender() {
        return allGender;
    }

    public void setAllGender(List<Music> allGender) {
        this.allGender = allGender;
    }

    public String getName() {
        return name;
    }

    public int getValum() {
        return valum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValum(int valum) {
        this.valum = valum;
    }

    public PlaceWhereMusicPlay() {
    }

    public PlaceWhereMusicPlay(Music music) {
        this.music = music;
    }



    public void setMusic(Music music) {
        this.music = music;
    }

    //IoC
    public void plaY() {
        System.out.println("Particular gender: " + music.play());
    }


    public void showAllGender() {
        System.out.println("All genger is:");
        allGender.forEach(System.out::println);
    }
}
