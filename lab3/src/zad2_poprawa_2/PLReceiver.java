package zad2_poprawa_2;

public class PLReceiver implements Receiver{
    @Override
    public void sendAdd() {
        System.out.println("Sending PL add");
    }

    @Override
    public String language() {
        return "PL";
    }
}
