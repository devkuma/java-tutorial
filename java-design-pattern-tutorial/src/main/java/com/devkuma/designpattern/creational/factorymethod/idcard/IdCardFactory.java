package com.devkuma.designpattern.creational.factorymethod.idcard;

import com.devkuma.designpattern.creational.factorymethod.framwork.Factory;
import com.devkuma.designpattern.creational.factorymethod.framwork.Product;

import java.util.ArrayList;

public class IdCardFactory extends Factory {

    private ArrayList<String> owners = new ArrayList();

    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    protected void registerProduct(Product product) {
        IdCard icCard = (IdCard) product;
        String owner = icCard.getOwner();
        owners.add(owner);
    }

    public ArrayList<String> getOwners() {
        return owners;
    }
}