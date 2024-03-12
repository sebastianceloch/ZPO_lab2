public class Character {
    Attack attack;

    public Character(Attack attack)
    {
        this.attack = attack;
    }

    public void Attack()
    {
        attack.attack();
    }
}
