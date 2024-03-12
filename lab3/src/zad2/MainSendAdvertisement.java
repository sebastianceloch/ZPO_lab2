package zad2;

import java.util.ArrayList;

public class MainSendAdvertisement {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();
        languages.add("EN");
        languages.add("PL");
        languages.add("DE");
        ArrayList<String> receivers = new ArrayList<>();
        receivers.add("johndoe@gmail.com");
        receivers.add("johntravolta@yahoo.com");
        receivers.add("jankowalski@wp.pl");


        Advertisement advertisement = new Advertisement(new Email());
        //advertisement.setDelivery(sms);
        advertisement.setReceivers(receivers);
        advertisement.setLanguage(languages);
        advertisement.Send();

        Advertisement advertisementSms = new Advertisement(new Sms());
        advertisementSms.setLanguage(languages);
        advertisementSms.setReceivers(receivers);
        advertisementSms.Send();

        Advertisement advertisementVoice = new Advertisement(new VoiceMail());
        advertisementVoice.setLanguage(languages);
        advertisementVoice.setReceivers(receivers);
        advertisementVoice.Send();
    }
}
