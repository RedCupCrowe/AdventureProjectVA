import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> playerItems = new ArrayList<>();


    public void take(String itemTaken){
        Item item = currentRoom.takeItem(itemTaken);
        if (item == null){
            System.out.println("No item of that description");
        }else{
            playerItems.add(item);
        }

    }
    public void inventory(){
        for (Item i : playerItems){
            System.out.println(i.toString());
        }
    }

    public void drop(String itemDropped){
        int index = -1;
        for(int i=0; i<playerItems.size();i++){
            if (playerItems.get(i).getName().equals(itemDropped)){
                index = i;
            }

        }
        if (index == -1){
            System.out.println("No item of that description");
        }else{
            Item item = playerItems.get(index);
            playerItems.remove(item);
            currentRoom.addItem(item);
    }
    }




    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void goNorth() {
        if (currentRoom.getNorth() == null) {
            System.out.println("you slam your head into the wall. No portal here it seems.");
        } else {
            System.out.println("going north");
            currentRoom = currentRoom.getNorth();
            System.out.println(currentRoom.toString());
        }
    }

    public void goSouth() {
        if (currentRoom.getSouth() == null) {
            System.out.println("you slam your head into the wall. No portal here it seems.");
        } else {
            System.out.println("going south");
            currentRoom = currentRoom.getSouth();
            System.out.println(currentRoom.getSouth());
        }
    }

    public void goEast() {
        if (currentRoom.getEast() == null) {
            System.out.println("you slam your head into the wall. No portal here it seems.");
        } else {
            System.out.println("going south");
            currentRoom = currentRoom.getEast();
            System.out.println(currentRoom.getEast());
        }
    }

    public void goWest() {
        if (currentRoom.getWest() == null) {
            System.out.println("you slam your head into the wall. No portal here it seems.");
        } else {
            System.out.println("going south");
            currentRoom = currentRoom.getWest();
            System.out.println(currentRoom.getWest());
        }

    }
}
