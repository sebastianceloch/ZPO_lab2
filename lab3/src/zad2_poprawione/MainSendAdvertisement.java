package zad2_poprawione;

import java.util.ArrayList;

public class MainSendAdvertisement {
    public static void main(String[] args) {


        ArrayList<Receiver> receivers = new ArrayList<>();
        receivers.add(new Receiver("johndoe@gmail.com"));
        receivers.add(new Receiver("jankowalski@wp.pl"));
        receivers.add(new Receiver("jasnowak@gmail.com"));


        Advertisement advertisement = new Advertisement(new Email(), new PLlanguage());
        //advertisement.setDelivery(sms);
        advertisement.setReceivers(receivers);
        advertisement.Send();

        Advertisement advertisementSms = new Advertisement(new Sms(), new DElanguage());
        advertisementSms.setReceivers(receivers);
        advertisementSms.Send();

        Advertisement advertisementVoice = new Advertisement(new VoiceMail(), new ENlangauge());
        advertisementVoice.setReceivers(receivers);
        advertisementVoice.Send();
    }
}
