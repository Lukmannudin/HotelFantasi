package com.company.data.ordermenudatasource;

public class ListOrder {
    //SetMenu Array
    private static final SetMenu[] setMenus = new SetMenu[50];

    //room array
    private static final MenuContext[] rooms = new MenuContext[50];

    private static int menuCount = 0;
    private static MenuFactory menuFactory;

    public static void takeOrder(String SetMenuIn, int room){
        setMenus[menuCount] = menuFactory.getSetMenu(SetMenuIn);
        rooms[menuCount] = new MenuContext(room);
        menuCount++;
    }

    public static void addOrder(){
        menuFactory = new MenuFactory();

        takeOrder("Single", 1);
        takeOrder("Double", 2);
        takeOrder("Special", 3);
        takeOrder("Double", 4);
        takeOrder("Single", 4);
    }

    public static void listOrderMenu(){
        for (int count = 0; count < menuCount; count++){
            setMenus[count].serveMenu(rooms[count]);
        }
    }
}
