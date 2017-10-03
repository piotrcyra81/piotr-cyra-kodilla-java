package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProviderCollector {

    List<Provider> providerList = new ArrayList<>();

    public void addProvider(Provider provider) {
        providerList.add(provider);
    }
}
