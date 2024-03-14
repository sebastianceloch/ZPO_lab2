package zad2_poprawa_2;

import java.util.ArrayList;
import java.util.Random;

public class MainSendAdvertisement {
    public static void main(String[] args) {
        ArrayList<Delivery> deliveries = new ArrayList<>();
        deliveries.add(new Sms());
        deliveries.add(new Email());
        deliveries.add(new VoiceMail());
        ArrayList<Receiver> receivers = new ArrayList<>();
        receivers.add(new DEReceiver());
        receivers.add(new PLReceiver());
        receivers.add(new UKReceiver());
        Random random = new Random();
        int randomReceiver = random.nextInt(receivers.size());
        int randomDelivery = random.nextInt(deliveries.size());
        Advertisement ad1 = new Advertisement(receivers.get(randomReceiver), deliveries.get(randomDelivery), new ShampooAd());
        ad1.sendAd();

        ad1.setAds(new SkateboardAd());
        ad1.sendAd();

        ad1.setDelivery(new Email());
        ad1.sendAd();
    }
}
