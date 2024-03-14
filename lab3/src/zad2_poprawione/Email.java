package zad2_poprawione;

public class Email implements Delivery{
    @Override
    public void send(String receiver) {
        System.out.println("Wysłanie reklamy emailem do odbiorcy: " + receiver);
    }
}
