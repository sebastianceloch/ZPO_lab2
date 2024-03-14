package zad2_poprawione;

public class VoiceMail implements Delivery{
    @Override
    public void send(String receiver) {
        System.out.println("Wysłanie reklamy voice mailem do odbiorcy: " + receiver);
    }
}
