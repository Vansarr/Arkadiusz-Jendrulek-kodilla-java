package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private List<Country> countryList = new ArrayList<>();

    public void addCountry (Country country) {
        countryList.add(country);
    }

    public List<Country> getCountryList() {
        return countryList;
    }

}
