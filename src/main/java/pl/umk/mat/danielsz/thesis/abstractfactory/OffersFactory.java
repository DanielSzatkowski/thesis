package pl.umk.mat.danielsz.thesis.abstractfactory;

import pl.umk.mat.danielsz.thesis.dto.Offer;

import java.math.BigDecimal;
import java.util.Currency;

public class OffersFactory implements AbstractOffersFactory {

    @Override
    public Offer createOffer() {
        return new Offer(
                "offer-created-by-OffersFactory",
                "seller-id",
                "category-id",
                new BigDecimal("5.00"),
                Currency.getInstance("PLN"));
    }
}
