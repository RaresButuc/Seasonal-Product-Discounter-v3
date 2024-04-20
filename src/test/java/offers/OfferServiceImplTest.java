package offers;

import com.codecool.seasonalproductdiscounter.model.offers.Offer;
import com.codecool.seasonalproductdiscounter.model.products.Product;
import com.codecool.seasonalproductdiscounter.service.discounts.DiscountProvider;
import com.codecool.seasonalproductdiscounter.service.discounts.DiscountProviderImpl;
import com.codecool.seasonalproductdiscounter.service.discounts.DiscountService;
import com.codecool.seasonalproductdiscounter.service.discounts.DiscountServiceImpl;
import com.codecool.seasonalproductdiscounter.service.offers.OfferService;
import com.codecool.seasonalproductdiscounter.service.offers.OfferServiceImpl;
import com.codecool.seasonalproductdiscounter.service.products.provider.RandomProductGenerator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OfferServiceImplTest {
    private final OfferService offerService;
    private final RandomProductGenerator provider;
    DiscountService discountService;
    DiscountProvider discountProvider;

    public OfferServiceImplTest() {
        this.provider = new RandomProductGenerator(50, 10, 70);
        this.discountProvider = new DiscountProviderImpl();
        this.discountService = new DiscountServiceImpl(discountProvider);
        this.offerService = new OfferServiceImpl(provider.getProducts(),discountService);
    }

    @Test
    void gettingOffersForADate() {
        List<Offer> offersForProducts = offerService.getOffers(LocalDate.parse("2023-03-24"));

        for (Offer offer :
                offersForProducts) {
            System.out.println(offer);
        }
        boolean countOffers = offersForProducts.size() > 0;
        assertTrue(countOffers);
    }
}
