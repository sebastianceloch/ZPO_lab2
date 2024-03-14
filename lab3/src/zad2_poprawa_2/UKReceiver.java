package zad2_poprawa_2;

public class UKReceiver implements Receiver{
    @Override
    public void sendAdd() {
        System.out.println("Sending UK add");
    }

    @Override
    public String language() {
        return "UK";
    }
}
