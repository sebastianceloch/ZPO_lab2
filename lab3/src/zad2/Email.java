package zad2;

public class Email implements Delivery{
    @Override
    public void send(String language, String receiver) {
        System.out.println("Wysłanie reklamy emailem w języku " + language + " do odbiorcy: " + receiver);
    }
}
