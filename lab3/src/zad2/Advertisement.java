package zad2;
import java.util.Random;
import java.util.ArrayList;

public class Advertisement {
    Delivery delivery;
    private ArrayList<String> receivers;
    private ArrayList<String> language;

    public Advertisement(Delivery delivery)
    {
        this.delivery = delivery;
    }
    public void setReceivers(ArrayList<String> receivers) {
        this.receivers = receivers;
    }

    public void setLanguage(ArrayList<String> language) {
        this.language = language;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void Send()
    {
        Random random = new Random();
        String randomReceiver = receivers.get(random.nextInt(receivers.size()));
        String randomLangauge = language.get(random.nextInt(language.size()));
        delivery.send(randomLangauge, randomReceiver);
    }
}
