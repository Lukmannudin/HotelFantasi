package com.company.data.ordermenudatasource;

public class SetMenu implements MenuSet{
    private final String menu;
    public SetMenu(String chooseMenu){
        this.menu = chooseMenu;
    }
    public String getMenu(){return this.menu;}

    @Override
    public void serveMenu(MenuContext context) {
        System.out.println("Serving Set Menu "+menu+ " to Room "+ context.getRoomNumber());
    }


}
