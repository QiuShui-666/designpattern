package com.qiushui.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class UnitedNationsSecurityCouncil implements UnitedNations {

    private List<Country> countryList = new ArrayList<>();

    @Override
    public void declare(String message, Country colleague) {
        for (Country country : countryList) {
            if (!country.equals(colleague)) {
                country.receive(message);
            }
        }
    }

    @Override
    public void register(Country colleague) {
        countryList.add(colleague);
    }
}
