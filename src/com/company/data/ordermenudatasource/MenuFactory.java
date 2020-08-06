package com.company.data.ordermenudatasource;

import java.util.HashMap;

public class MenuFactory {
    private HashMap<String, SetMenu> setmenu = new HashMap<String, SetMenu>();

    public SetMenu getSetMenu(String setmenuName){
        SetMenu setMenu = setmenu.get(setmenuName);
        if (setMenu == null){
            setMenu = new SetMenu(setmenuName);
            setmenu.put(setmenuName, setMenu);
        }
        return setMenu;
    }
}
