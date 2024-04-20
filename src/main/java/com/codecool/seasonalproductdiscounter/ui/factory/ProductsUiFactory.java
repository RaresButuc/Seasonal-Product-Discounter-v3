package com.codecool.seasonalproductdiscounter.ui.factory;

import com.codecool.seasonalproductdiscounter.service.products.browser.ProductBrowser;
import com.codecool.seasonalproductdiscounter.service.users.AuthenticationService;
import com.codecool.seasonalproductdiscounter.ui.ProductsUi;
import com.codecool.seasonalproductdiscounter.ui.UiBase;

public class ProductsUiFactory extends UiFactoryBase {
    private static final boolean authenticationNeeded = true;
    private final ProductBrowser productBrowser;

    public ProductsUiFactory( ProductBrowser productBrowser) {
        super(authenticationNeeded);
        this.productBrowser = productBrowser;
    }

    @Override
    public String getUiName() {
        return "Products";
    }

    @Override
    public UiBase create() {
        return new ProductsUi( productBrowser, getUiName());
    }
}

