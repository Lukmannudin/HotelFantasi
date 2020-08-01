package com.company.notifer;

import java.util.ArrayList;

public abstract class Notifer {

    public ArrayList<Notifer> wrappee = new ArrayList<>();

    public abstract void send(String message);

    public String description= "sending by ";
}
