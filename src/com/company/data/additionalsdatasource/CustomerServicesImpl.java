package com.company.data.additionalsdatasource;

public class CustomerServicesImpl implements CustomerServices {

    @Override
    public int visit(Additional additional) {
        int cost = 0;
        String service = additional.getService();
        switch (service) {
            case "Pools": {
                int price = 200000;
                int time = additional.getTime();
                cost = price * time;
                break;
            }
            case "Rental Car": {
                int price = 300000;
                int time = additional.getTime();
                cost = price * time;
                break;
            }
            case "Spa": {
                int price = 150000;
                int time = additional.getTime();
                cost = price * time;
                break;
            }
        }
        return cost;
    }

    @Override
    public int visit(Food foodService) {
        int cost = 0;

        String food = foodService.getFood();
        switch (food) {
            case "Nasi Goreng Spesial": {
                int price = 50000;
                int portion = foodService.getPortion();
                cost = price * portion;
                break;
            }
            case "Pizza": {
                int price = 150000;
                int portion = foodService.getPortion();
                cost = price * portion;
                break;
            }
            case "Spaghetti": {
                int price = 85000;
                int portion = foodService.getPortion();
                cost = price * portion;
                break;
            }
        }

        return cost;
    }

}
