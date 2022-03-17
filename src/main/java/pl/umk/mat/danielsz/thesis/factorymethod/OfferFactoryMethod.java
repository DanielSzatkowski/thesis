package pl.umk.mat.danielsz.thesis.factorymethod;

import pl.umk.mat.danielsz.thesis.dto.LocalOffer;
import pl.umk.mat.danielsz.thesis.dto.Offer;

import java.math.BigDecimal;
import java.util.Currency;

public class OfferFactoryMethod implements FactoryMethod{
    @Override
    public Offer createOfferForOfficialShop() {
        return new Offer("offer-id", "seller-id", "category-id", new BigDecimal("5.00"), Currency.getInstance("PLN"));
    }
}
