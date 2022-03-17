package pl.umk.mat.danielsz.thesis.dto;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public class Offer {
    private String id;
    private String sellerId;
    private String categoryId;
    private Price price;

    public Offer(String id, String sellerId, String categoryId, Price price) {
        this.id = id;
        this.sellerId = sellerId;
        this.categoryId = categoryId;
        this.price = price;
    }

    public Offer(String id, String sellerId, String categoryId, BigDecimal price, Currency currency) {
        this.id = id;
        this.sellerId = sellerId;
        this.categoryId = categoryId;
        this.price = new Price(price, currency);
    }

    // used for cloning later on
    public Offer(Offer that){
        this(that.getId(), that.getSellerId(), that.getCategoryId(), that.getPrice());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id='" + id + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Offer)) return false;
        Offer offer = (Offer) o;
        return Objects.equals(getId(), offer.getId()) && Objects.equals(getSellerId(), offer.getSellerId()) && Objects.equals(getCategoryId(), offer.getCategoryId()) && Objects.equals(getPrice(), offer.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSellerId(), getCategoryId(), getPrice());
    }

    public static class Price {
        private BigDecimal price;
        private Currency currency;

        public Price(BigDecimal price, Currency currency) {
            this.price = price;
            this.currency = currency;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        @Override
        public String toString() {
            return "Price{" +
                    "price=" + price +
                    ", currency=" + currency +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Price)) return false;
            Price price1 = (Price) o;
            return Objects.equals(getPrice(), price1.getPrice()) && Objects.equals(getCurrency(), price1.getCurrency());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getPrice(), getCurrency());
        }
    }
}
