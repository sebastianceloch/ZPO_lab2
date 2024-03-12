package zad2;

public class VoiceMail implements Delivery{
    @Override
    public void send(String language, String receiver) {
        System.out.println("Wysłanie reklamy voice mailem języku " + language + " do odbiorcy: " + receiver);
    }
}
