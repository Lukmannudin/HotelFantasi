package com.company.data.roomdatasource;

import java.util.ArrayList;
import java.util.Random;

public class RoomData {


    private static final int maxBed = 5;
    private static final int maxPillow = 20;
    private static final int maxBlanket = 10;

    private static final int priceBed = 50000;
    private static final int pricePillow = 5000;
    private static final int priceBlanket = 10000;

    private static final ClassicRoom classicRoom = new ClassicRoom();
    private static final ModernRoom modernRoom = new ModernRoom();
    private static final RoyalRoom royalRoom = new RoyalRoom();

    private static final Random randomGenerator = new Random();

    private static final String[] wallpaper = {"nature", "business", "technology", "cartoon", "animals", "travel"};


    public static ArrayList<Room> getRooms() {
        int numRoomClassic = 10;
        int numRoomModern = 10;
        int numRoomRoyal = 5;


        ArrayList<Room> rooms = new ArrayList<>();

        int currentCountRoom = 1;
        while (numRoomClassic + numRoomModern + numRoomRoyal >= currentCountRoom) {

            if (currentCountRoom <= numRoomClassic) {
                ClassicRoom classicRoom = createClassicRoom(currentCountRoom);
                rooms.add(classicRoom);
            }

            if (currentCountRoom > numRoomClassic && currentCountRoom <= numRoomClassic + numRoomModern) {
                ModernRoom modernRoom = createModernRoom(currentCountRoom);
                rooms.add(modernRoom);
            }

            if (currentCountRoom > numRoomClassic + numRoomModern) {
                RoyalRoom royalRoom = createRoyalRoom(currentCountRoom);
                rooms.add(royalRoom);
            }

            ++currentCountRoom;
        }

        return rooms;
    }

    private static ClassicRoom createClassicRoom(int noRoom) {
        ClassicRoom tempClassicRoom = (ClassicRoom) classicRoom.clone();
        tempClassicRoom.noRoom = noRoom;
        tempClassicRoom.numBed = randomGenerator.nextInt(maxBed);
        tempClassicRoom.price = tempClassicRoom.price + (tempClassicRoom.numBed * priceBed);

        return tempClassicRoom;
    }

    private static ModernRoom createModernRoom(int noRoom) {
        ModernRoom tempModernRoom = (ModernRoom) modernRoom.clone();
        tempModernRoom.noRoom = noRoom;
        tempModernRoom.numBed = randomGenerator.nextInt(maxBed);
        tempModernRoom.numBlanket = randomGenerator.nextInt(maxBlanket);
        tempModernRoom.numPillow = randomGenerator.nextInt(maxPillow);
        tempModernRoom.price = tempModernRoom.price + (tempModernRoom.numBed * priceBed)
                + (tempModernRoom.numBlanket * priceBlanket) + (tempModernRoom.numPillow * pricePillow);

        return tempModernRoom;
    }

    private static RoyalRoom createRoyalRoom(int noRoom) {
        RoyalRoom tempRoyalRoom = (RoyalRoom) royalRoom.clone();
        tempRoyalRoom.noRoom = noRoom;
        tempRoyalRoom.numBed = randomGenerator.nextInt(maxBed);
        tempRoyalRoom.numBlanket = randomGenerator.nextInt(maxBlanket);
        tempRoyalRoom.numPillow = randomGenerator.nextInt(maxPillow);
        tempRoyalRoom.wallpaper = wallpaper[randomGenerator.nextInt(wallpaper.length - 1)];

        tempRoyalRoom.price = tempRoyalRoom.price + (tempRoyalRoom.numBed * priceBed)
                + (tempRoyalRoom.numBlanket * priceBlanket) + (tempRoyalRoom.numPillow * pricePillow);
        return tempRoyalRoom;
    }

}
