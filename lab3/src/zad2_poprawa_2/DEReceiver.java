package zad2_poprawa_2;

public class DEReceiver implements Receiver{
    @Override
    public void sendAdd() {
        System.out.println("Sending DE add");
    }

    @Override
    public String language() {
        return "DE";
    }
}
