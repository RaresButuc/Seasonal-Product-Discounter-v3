package com.codecool.seasonalproductdiscounter.ui;

import com.codecool.seasonalproductdiscounter.service.products.statistics.ProductStatistics;

public class StatisticsUi extends UiBase {
    private static final boolean authenticationNeeded = true;
    private final ProductStatistics productStatistics;

    public StatisticsUi(ProductStatistics productStatistics, String title) {
        super(authenticationNeeded, title);
        this.productStatistics = productStatistics;
    }

    @Override
    public void run() {
        System.out.println("Total products: " + productStatistics.totalProducts());
        System.out.println("Average price of products: " + productStatistics.getAveragePrice());
        System.out.println("Cheapest product: " + "[" + productStatistics.getCheapest() + "]");
        System.out.println("Most expensive product: " + "[" + productStatistics.getMostExpensive() + "]");
    }
}


