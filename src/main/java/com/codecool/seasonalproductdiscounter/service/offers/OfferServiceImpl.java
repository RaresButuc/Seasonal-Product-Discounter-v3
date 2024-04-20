package com.codecool.seasonalproductdiscounter.service.offers;

import com.codecool.seasonalproductdiscounter.model.offers.Offer;
import com.codecool.seasonalproductdiscounter.model.products.Product;
import com.codecool.seasonalproductdiscounter.service.discounts.DiscountProvider;
import com.codecool.seasonalproductdiscounter.service.discounts.DiscountProviderImpl;
import com.codecool.seasonalproductdiscounter.service.discounts.DiscountService;
import com.codecool.seasonalproductdiscounter.service.discounts.DiscountServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OfferServiceImpl implements OfferService {
    List<Product> products;
    DiscountService discountService;


    public OfferServiceImpl(List<Product> products, DiscountService discountService) {
        this.products = products;
        this.discountService = discountService;
    }

    @Override
    public List<Offer> getOffers(LocalDate date) {
        List<Offer> dateoffers = new ArrayList<>();

        for (Product product :
                products) {
            Offer currentProductOffer = discountService.getOffer(product, date);
            if (currentProductOffer.discounts().size() > 0) {
                dateoffers.add(currentProductOffer);
            }
        }
        return dateoffers;
    }
}
