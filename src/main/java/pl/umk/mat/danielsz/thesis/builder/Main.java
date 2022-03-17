package pl.umk.mat.danielsz.thesis.builder;

import pl.umk.mat.danielsz.thesis.dto.Offer;

import java.math.BigDecimal;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        Offer offer = OfferBuilder.builder()
                .withId("offer-id")
                .withSellerId("seller-id")
                .withCategoryId("category-id")
                .withPriceAmount(new BigDecimal("5.00"))
                .withCurrency(Currency.getInstance("PLN"))
                .build();

        System.out.println(offer);
    }
}
