package music;

import music.ganres.ClassicMusic;
import music.ganres.JazMusicFactory;
import music.ganres.Music;
import music.ganres.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicatioContext.xml");
        //1
        Music rockMusic = context.getBean("rockMusic", RockMusic.class);
        PlaceWhereMusicPlay cafe = new PlaceWhereMusicPlay(rockMusic);
        cafe.plaY();

        //2-3
        PlaceWhereMusicPlay cafe2 = context.getBean("cafe", PlaceWhereMusicPlay.class);
        cafe2.plaY();
        System.out.println("Name is: " + cafe2.getName() + "\nValue is:  " + cafe2.getValum());

        PlaceWhereMusicPlay car = context.getBean("car", PlaceWhereMusicPlay.class);
        car.plaY();
        System.out.println("Name is: " + car.getName() + "\nValue is:  " + car.getValum());
        //4 collection
        PlaceWhereMusicPlay radio = context.getBean("collection", PlaceWhereMusicPlay.class);
        radio.showAllGender();

//Init Destroy
        System.out.println("\nInit destroy test\n");
        PlaceWhereMusicPlay rawe = context.getBean("rave", PlaceWhereMusicPlay.class);
        rawe.plaY();


        //Factory method
        JazMusicFactory jazz = context.getBean("jazzMusic",JazMusicFactory.class);
        System.out.println(jazz.play());



        context.close();


    }
}
