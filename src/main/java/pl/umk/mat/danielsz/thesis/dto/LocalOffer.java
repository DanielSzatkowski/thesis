package pl.umk.mat.danielsz.thesis.dto;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public class LocalOffer extends Offer{
    private String city;

    public LocalOffer(String id, String sellerId, String categoryId, Price price, String city) {
        super(id, sellerId, categoryId, price);
        this.city = city;
    }

    public LocalOffer(String id, String sellerId, String categoryId, BigDecimal price, Currency currency, String city) {
        super(id, sellerId, categoryId, new Price(price, currency));
        this.city = city;
    }

    // used for cloning later on
    public LocalOffer(LocalOffer that){
        this(that.getId(), that.getSellerId(), that.getCategoryId(), that.getPrice(), that.getCity());
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "LocalOffer{" +
                super.toString() + ", " +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalOffer)) return false;
        if (!super.equals(o)) return false;
        LocalOffer that = (LocalOffer) o;
        return Objects.equals(getCity(), that.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCity());
    }
}
