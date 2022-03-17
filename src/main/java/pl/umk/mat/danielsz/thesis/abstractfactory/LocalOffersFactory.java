package pl.umk.mat.danielsz.thesis.abstractfactory;

import pl.umk.mat.danielsz.thesis.dto.LocalOffer;
import pl.umk.mat.danielsz.thesis.dto.Offer;

import java.math.BigDecimal;
import java.util.Currency;

public class LocalOffersFactory implements AbstractOffersFactory{
    @Override
    public Offer createOffer() {
        return new LocalOffer(
                "offer-created-by-LocalOffersFactory",
                "seller-id",
                "category-id",
                new BigDecimal("2.00"),
                Currency.getInstance("PLN"),
                "Warsaw");
    }
}
