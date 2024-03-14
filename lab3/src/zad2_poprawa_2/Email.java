package zad2_poprawa_2;

public class Email implements Delivery{
    @Override
    public void send(String language) {
        System.out.println("Sending email");
    }
}
