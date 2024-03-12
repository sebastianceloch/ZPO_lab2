import java.util.ArrayList;

public class MainGame {
    public static void main(String[] args) {
        ArrayList<Character> hero = new ArrayList<>();
        hero.add(new Character(new Archer()));
        hero.add(new Character(new Gunner()));
        hero.add(new Character(new Knight()));
        hero.add(new Character(new Shooter()));

        for(Character a : hero)
        {
            a.Attack();
        }
    }
}
