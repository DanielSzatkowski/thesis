package pl.umk.mat.danielsz.thesis.abstractfactory;

import pl.umk.mat.danielsz.thesis.dto.LocalOffer;
import pl.umk.mat.danielsz.thesis.dto.Offer;

public class Main {

    public static void main(String[] args) {
        /*
        *   Creating abstract factory for this kind of problem is pointless - this design pattern should be used in completely different situations.
        *   Objects created by abstract factory usually are more 'static' - like sets of buttons, dialog windows etc.
        */

        //factory creating offers without localization
        Offer offer = createOffer(new OffersFactory());

        //factory creating offer with localization
        Offer localOffer = createOffer(new LocalOffersFactory());

        System.out.println(offer);
        System.out.println(localOffer);
    }

    // this method doesn't care what factory it will use
    private static Offer createOffer(AbstractOffersFactory factory){
        return factory.createOffer();
    }
}
