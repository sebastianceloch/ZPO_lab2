package zad2_poprawa_2;

public class Advertisement {
    Receiver receiver;
    Delivery delivery;
    Ads ads;

    public Advertisement(Receiver receiver, Delivery delivery, Ads ads) {
        this.receiver = receiver;
        this.delivery = delivery;
        this.ads = ads;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setAds(Ads ads) {
        this.ads = ads;
    }

    public void sendAd()
    {
        delivery.send(receiver.language());
        receiver.sendAdd();
        ads.adText();
    }

}
