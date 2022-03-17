package pl.umk.mat.danielsz.thesis.prototype;

import pl.umk.mat.danielsz.thesis.dto.Offer;

import java.util.HashMap;
import java.util.Map;

public class OffersPrototypesRepo {
    private Map<String, Offer> offersMap = new HashMap<>();

    public void add(String name, Offer offer){
        offersMap.put(name, offer);
    }

    public Offer get(String name){
        return offersMap.get(name);
    }
}
