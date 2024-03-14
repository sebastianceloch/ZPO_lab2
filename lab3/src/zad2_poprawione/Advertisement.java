package zad2_poprawione;
import java.util.Random;
import java.util.ArrayList;

public class Advertisement {
    Delivery delivery;
    private ArrayList<Receiver> receivers;
    Translate translate;

    public Advertisement(Delivery delivery, Translate translate)
    {
        this.delivery = delivery;
        this.translate = translate;
    }
    public void setReceivers(ArrayList<Receiver> receivers) {
        this.receivers = receivers;
    }

    public void setTranslator(Translate translate) {
        this.translate = translate;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }


    public void Send()
    {
        Random random = new Random();
        Receiver randomReceiver = receivers.get(random.nextInt(receivers.size()));
        translate.translate();
        delivery.send(randomReceiver.getEmail());
    }
}
