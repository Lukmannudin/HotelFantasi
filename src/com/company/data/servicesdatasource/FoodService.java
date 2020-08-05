package com.company.data.servicesdatasource;

public class FoodService implements Services {

    private final String food;
    private final int portion;

    public FoodService(String food, int portion) {
        this.food = food;
        this.portion = portion;
    }

    public String getFood() {
        return food;
    }

    public int getPortion() {
        return portion;
    }

    @Override
    public int accept(CustomerServices visitor) {
        return visitor.visit(this);
    }
}
