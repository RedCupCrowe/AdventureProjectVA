import java.util.Scanner;

public class Adventure {
    private static Room currentRoom;
    private static Room room1, room2, room3,room4, room5, room6,room7, room8, room9;

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Welcome to the Haunted house!");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("to play the game you type 'go east/west/north/south' to move in that direction. To exit the game, type 'exit'." +
            "\nTo have the description of the room repeated, type 'look' or 'look around'");
        System.out.println("To get the instructions again, type 'help'.");

        // build all rooms
        room1 = new Room("Entryway", "INSERT ROOM DESCRIPTION HERE");
        room2 = new Room("Parlor", "INSERT ROOM DESCRIPTION HERE");
        room3 = new Room("Kitchen", "INSERT ROOM DESCRIPTION HERE");
        room4 = new Room("Dining Room", "INSERT ROOM DESCRIPTION HERE");
        room5 = new Room("Vault", "INSERT ROOM DESCRIPTION HERE");
        room6 = new Room("Smoking Room", "INSERT ROOM DESCRIPTION HERE");
        room7 = new Room("Cupboard under the stairs", "INSERT ROOM DESCRIPTION HERE");
        room8 = new Room("Boudoir", "INSERT ROOM DESCRIPTION HERE");
        room9 = new Room("Basement", "INSERT ROOM DESCRIPTION HERE");
        //make all connections
        room2.setConnections(null, room3, null, room1);
        room4.setConnections(room1, null, room7, null);
        room6.setConnections(room3,null, room9, room5);
        room8.setConnections(null, room9, null, room7);
       /* room1.setConnections(null, room2, room4, null);
        room2.setConnections(null, room3, null, room1);
        room3.setConnections(null, null, room6, room2);
        room4.setConnections(room1, null, room7, null);
        room5.setConnections(null, room6, null, null);
        room6.setConnections(room3, null, room9, room5);
        room7.setConnections(room4, room8, null, null);
        room8.setConnections(null, room9, null, room7);
        room9.setConnections(room6, null, null, room8);*/


        //set player starting position
        currentRoom = room1;
        boolean running = true;
        Scanner in = new Scanner(System.in);
        while(running){
        String input = in.nextLine();
        switch(input){
            case "go north":
            case "n":
            case "go n":
                if(currentRoom.getNorth() == null){
                    System.out.println("you slam your head into the wall");
                }else{
                System.out.println("going north");
                currentRoom = currentRoom.getNorth();}
                break;
            case "go south":
            case "s":
            case "go s":
                if(currentRoom.getSouth() == null){
                    System.out.println("you slam your head into the wall");
                }else{
                    System.out.println("going south");
                    currentRoom = currentRoom.getSouth();}
                break;
            case "go east":
            case "e":
            case "go e":
                if(currentRoom.getEast() == null){
                    System.out.println("you slam your head into the wall");
                }else{
                    System.out.println("going east");
                    currentRoom = currentRoom.getEast();}
                break;
            case "go west":
            case "w":
            case "go w":
                if(currentRoom.getWest() == null){
                    System.out.println("you slam your head into the wall");
                }else{
                    System.out.println("going west");
                    currentRoom = currentRoom.getWest();}
                break;

            case "look":
            case "look around":
            case "peer":
                System.out.println(currentRoom);
                break;
            case "help":
            case "hlep":
                System.out.println("to play the game you type 'go east/west/north/south' to move in that direction. to exit the game, type 'exit'." +
                        "\n to have the description of the room repeated, type 'look' or 'look around'");
                break;
            case "exit":
                running = false;
            default:
                System.out.println("Invalid command, type 'help' for instructions");
                break;

        }
    }
}
}