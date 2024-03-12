package zad2;

public class Sms implements Delivery{
    @Override
    public void send(String language, String receiver) {
        System.out.println("Wysłanie reklamy SMSem w języku " + language + " do odbiorcy: " + receiver);
    }
}
