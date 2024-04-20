package com.codecool.seasonalproductdiscounter.ui.factory;

import com.codecool.seasonalproductdiscounter.service.products.statistics.ProductStatistics;
import com.codecool.seasonalproductdiscounter.service.users.AuthenticationService;
import com.codecool.seasonalproductdiscounter.ui.StatisticsUi;
import com.codecool.seasonalproductdiscounter.ui.UiBase;

public class StatisticsUiFactory extends UiFactoryBase {
    private static final boolean authenticationNeeded = true;
    private final ProductStatistics productStatistics;

    public StatisticsUiFactory( ProductStatistics productStatistics) {
        super(authenticationNeeded);
        this.productStatistics = productStatistics;
    }

    @Override
    public String getUiName() {
        return "Statistics Ui Factory";
    }

    @Override
    public UiBase create() {
        return new StatisticsUi( productStatistics, getUiName());
    }
}
