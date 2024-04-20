package com.codecool.seasonalproductdiscounter.ui.factory;

import com.codecool.seasonalproductdiscounter.service.offers.OfferService;
import com.codecool.seasonalproductdiscounter.service.products.browser.ProductBrowser;
import com.codecool.seasonalproductdiscounter.service.products.statistics.ProductStatistics;
import com.codecool.seasonalproductdiscounter.service.users.AuthenticationService;
import com.codecool.seasonalproductdiscounter.ui.OffersUi;
import com.codecool.seasonalproductdiscounter.ui.UiBase;

public class OffersUiFactory extends UiFactoryBase {
    private static final boolean authenticationNeeded = false;
    private final OfferService offerService;

    public OffersUiFactory(OfferService offerService) {
        super(authenticationNeeded);
        this.offerService = offerService;
    }

    @Override
    public String getUiName() {
        return "Offers Ui Factory";
    }

    @Override
    public UiBase create() {
        return new OffersUi(getUiName(), offerService);
    }
}
