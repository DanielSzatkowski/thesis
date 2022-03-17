package pl.umk.mat.danielsz.thesis.factorymethod;

public class Main {
    public static void main(String[] args) {
        FactoryMethod localOfferFactoryMethod = new LocalOfferFactoryMethod();
        FactoryMethod offerFactoryMethod = new OfferFactoryMethod();


        System.out.println(localOfferFactoryMethod.createOfferForOfficialShop());
        System.out.println(offerFactoryMethod.createOfferForOfficialShop());
    }
}
