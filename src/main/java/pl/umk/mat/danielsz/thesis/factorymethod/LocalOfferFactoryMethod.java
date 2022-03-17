package pl.umk.mat.danielsz.thesis.factorymethod;

import pl.umk.mat.danielsz.thesis.dto.LocalOffer;
import pl.umk.mat.danielsz.thesis.dto.Offer;

import java.math.BigDecimal;
import java.util.Currency;

public class LocalOfferFactoryMethod implements FactoryMethod{
    @Override
    public Offer createOfferForOfficialShop() {
        return new LocalOffer("offer-id", "seller-id", "category-id", new BigDecimal("5.00"), Currency.getInstance("PLN"), "Warsaw");
    }
}
