package com.codecool.seasonalproductdiscounter.ui;

import com.codecool.seasonalproductdiscounter.model.offers.Offer;
import com.codecool.seasonalproductdiscounter.service.offers.OfferService;

import java.time.LocalDate;
import java.util.List;

public class OffersUi extends UiBase {
    private static final boolean authenticationNeeded = false;
    private final OfferService offerService;

    public OffersUi(String title, OfferService offerService) {
        super(authenticationNeeded, title);
        this.offerService = offerService;
    }

    @Override
    public void run() {
        List<Offer> offers = offerService.getOffers(LocalDate.now());
        printOffers("Available Offers: ", offers);
    }

    private void printOffers(String text, List<Offer> offers) {
        System.out.println(text + ": ");
        for (Offer offer : offers) {
            System.out.println(offer.toString());
        }
    }
}
