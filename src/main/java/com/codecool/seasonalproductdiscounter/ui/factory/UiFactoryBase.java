package com.codecool.seasonalproductdiscounter.ui.factory;

import com.codecool.seasonalproductdiscounter.service.users.AuthenticationService;
import com.codecool.seasonalproductdiscounter.ui.UiBase;

public abstract class UiFactoryBase {
    private final boolean authenticationNeeded;

    public UiFactoryBase(boolean authenticationNeeded) {
        this.authenticationNeeded = authenticationNeeded;
    }

    public abstract String getUiName();

    public abstract UiBase create();

    public boolean isAuthenticationNeeded() {
        return authenticationNeeded;
    }
}

