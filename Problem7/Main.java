public class Main {
    public static void main(String[] args) {

        System.out.println("Viral Vaghela 23BIT224");

        Football soccer = new Football();
        // Volleyball volley = new Volleyball();
        // Basketball basket = new Basketball();
        Beachball beach = new Beachball();
        
        System.out.println(soccer.VAR);
        soccer.Play();
        soccer.Kick();
        // volley.Play();
        // basket.Play();
        beach.Play();
        beach.Kick();
    }
}

interface Playable {
    int VAR = 404;
    
    void Play();
    void Kick();
}

class Football implements Playable {
    public void Play() {
        System.out.println("lets play football");
    }
    
    public void Kick() {
        System.out.println("Taking a Football Kick...");
    }
}

abstract class Volleyball implements Playable {
    public void Play() {
        System.out.println("lets play Volleyball");
    }
}

abstract class Basketball implements Playable {
    public void Play() {
        System.out.println("lets play Basketball");
    }
}

class Beachball extends Volleyball {
    public void Kick() {
        System.out.println("Taking a Beachball Kick...");
    }
}