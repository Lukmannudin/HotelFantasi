package com.company.data.additionalsdatasource;

public class Food implements RoomServices {

    private final String food;
    private final int portion;

    public Food(String food, int portion) {
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
