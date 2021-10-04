public class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private String roomDescription;


    public Room(String name, String roomDescription){
        this.name = name;
        this.roomDescription = roomDescription;
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

        return this.name + ": " + this.roomDescription;

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
