import java.util.ArrayList;

public class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String roomDescription;
    private ArrayList<Item> roomItems;


    public Room(String name, String roomDescription){
        this.name = name;
        this.roomDescription = roomDescription;
        roomItems = new ArrayList<>();
    }

    public void addItem(Item item){
        roomItems.add(item);
    }

    public Item takeItem(String itemName){
        int index = -1;
        for(int i=0; i<roomItems.size();i++){
            if (roomItems.get(i).getName().equals(itemName)){
                index = i;
            }

        }
        if (index == -1){
            return null;
        }else{
            Item result = roomItems.get(index);
            roomItems.remove(result);
            return result;
        }
    }



    public void setConnections(Room north, Room east, Room south , Room west){
        if(north != null)  {setNorth(north);}
        if(east != null)   {setEast(east);}
        if(south != null)  {setSouth(south);}
        if(west != null)   {setWest(west);}
        /*this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;*/

    }

    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getSouth() {
        return south;
    }

    public Room getWest() {
        return west;
    }

    public String toString(){
        String result = this.roomDescription + "\nThe following items are scattered around the room:";
        for (Item i: roomItems){
            result += "\n-" + i.toString();
        }
        return result;
    }
    public void setSouth(Room south){
        this.south = south;
        if(south.getNorth() != this){
        south.setNorth(this);}
    }
    public void setNorth(Room north) {
        this.north = north;
        if(north.getSouth() != this){
        north.setSouth(this);}
    }
    public void setEast(Room east){
        this.east = east;
        if(east.getWest() != this){
        east.setWest(this);}
    }

    public void setWest(Room west) {
        this.west = west;
        if(west.getEast() != this){
        west.setEast(this);}
    }

}
