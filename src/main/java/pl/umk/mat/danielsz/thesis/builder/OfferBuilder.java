package pl.umk.mat.danielsz.thesis.builder;

import pl.umk.mat.danielsz.thesis.dto.Offer;

import java.math.BigDecimal;
import java.util.Currency;

public class OfferBuilder {
    private String id = null;
    private String sellerId = null;
    private String categoryId = null;
    private BigDecimal price = null;
    private Currency currency = null;

    public static OfferBuilder builder(){
        return new OfferBuilder();
    }

    public OfferBuilder withId(String id){
        this.id = id;
        return this;
    }

    public OfferBuilder withSellerId(String id){
        this.sellerId = id;
        return this;
    }

    public OfferBuilder withCategoryId(String id){
        this.categoryId = id;
        return this;
    }

    public OfferBuilder withPriceAmount(BigDecimal price){
        this.price = price;
        return this;
    }

    public OfferBuilder withCurrency(Currency currency){
        this.currency = currency;
        return this;
    }

    public Offer build(){
        return new Offer(
                id,
                sellerId,
                categoryId,
                new Offer.Price(price, currency)
        );
    }

}
