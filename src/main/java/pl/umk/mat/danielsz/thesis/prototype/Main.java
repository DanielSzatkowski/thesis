package pl.umk.mat.danielsz.thesis.prototype;

import pl.umk.mat.danielsz.thesis.dto.LocalOffer;
import pl.umk.mat.danielsz.thesis.dto.Offer;

import java.math.BigDecimal;
import java.util.Currency;
public class Main {

    public static void main(String[] args) {
        // example follows copy constructor, but we can implement that in different way - using Cloneable interface
        Offer offer = new Offer(
                "offer-id",
                "seller-id",
                "category-id",
                new BigDecimal("5.00"),
                Currency.getInstance("PLN"));
        Offer localOffer = new LocalOffer(
                "offer-id",
                "seller-id",
                "category-id",
                new BigDecimal("2.00"),
                Currency.getInstance("PLN"),
                "Warsaw");

        OffersPrototypesRepo offersPrototypesRepo = new OffersPrototypesRepo();
        offersPrototypesRepo.add("offer-for-5zl", new Offer(offer));
        offersPrototypesRepo.add("offer-for-2zl", new LocalOffer((LocalOffer) localOffer));

        System.out.println(offersPrototypesRepo.get("offer-for-5zl"));
        System.out.println(offersPrototypesRepo.get("offer-for-2zl"));
    }

}
