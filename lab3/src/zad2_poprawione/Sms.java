package zad2_poprawione;

public class Sms implements Delivery{
    @Override
    public void send(String receiver) {
        System.out.println("Wysłanie reklamy SMSem do odbiorcy: " + receiver);
    }
}
