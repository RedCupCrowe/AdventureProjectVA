import java.util.ArrayList;

public class Map {

    private Room room1, room2, room3,room4, room5, room6,room7, room8, room9;
    private ArrayList<Room> rooms;

    public Room getStartRoom() {
        return room1;
    }

    public Map(){
        rooms = new ArrayList<>();
        // build all rooms
        room1 = new Room("Cauldron Room", """
                You are in a dark cave, the only light to see by, comes from a bubbling cauldron.
                To your east and to your south, you see large mirrors, or what seems to be mirrors at first.
                The mirrors emit a faint humming sound and their reflections are blurry and out of sync with reality.
                Upon closer inspection, they are not looking glasses at all, but portals!
                Maybe one of them can lead you to your desires?""");
        rooms.add(room1);
        room1.addItem(new Item("jar of cauldron goo"));
        room1.addItem(new Item("spatula"));

        room2 = new Room("North America circa 1862", """
                Stepping through the portal, you find yourself in the middle of battlefield
                The people around are wearing what looks to be uniforms from the Union and the confederacy.\s
                Staying may mean catching a stray bullet, leaving may mean surviving.""");
        rooms.add(room2);

        room3 = new Room("Your own bedroom", """
                You open the door and step in. It looks exactly like your
                own bedroom from back home. While it may not be scary or dangerous, it doesn't feel right.
                You're still in the maze, even if this looks like your bedroom.\s
                """);
        rooms.add(room3);

        room4 = new Room("Death Star", """
                You find yourself in eerily familiar surroundings. Everything looks very 80's scifi.
                Turning around you find yourself looking through a massive window onto what can only be the forest moon of Endor.
                A chill runs down your back. You are in a Disney copyrighted movie. Better get out before you're sued.\s
                """);
        rooms.add(room4);

        room5 = new Room("Vault", """
                You step through the portal, and before you, you see whatever your heart desires.
                You have reached the mazes' end, and so, we bid you adieu.\s
                """);
        rooms.add(room5);

        room6 = new Room("White room", """
                You hop through the portal, and for a few frightening seconds, you think you have gone blind.
                Everything is completely white, or at least shades of white. \s
                the portal is nowhere in sight, but the dull hum is still there. You'll have to feel your way out.\s
                """);
        rooms.add(room6);

        room7 = new Room("Dormitory fever dream", """
                As you step through the portal, your head begins to spin.
                Even while disorientated, you look around to try and get your bearings.\s
                You find yourself at the outside door of a dormitory kitchen. Listening, you hear the Chef yelling, 'Stop!'\s
                'Stop!' while several cats inside seem to be serenading him with the Meow Mix commercial theme.
                Suddenly, the repeated thump of a cleaver puts an  abrupt end to the music.
                It seems you came at a bad time. You'd better leave.\s
                """);
        rooms.add(room7);

        room8 = new Room("Dormitory Kitchen", """
                You are in what appears to be a kitchen with a connected cafeteria. Looking out into the cafeteria,\s
                you see students reaching for Pepto-Bismol while trying to stomach the latest version of the Chef's Surprise.\s
                Looking over to the Chef you see him dumping fresh meat into his 50 litre stewing pot.\s
                """);
        rooms.add(room8);

        room9 = new Room("SNAKES", """
                OH NOOOOOOOOOOOOOOOOO there are snakes all around!\s
                Why'd have to be snakes?!\s
                """);
        rooms.add(room9);

        //make all connections
        room2.setConnections(null, room3, null, room1);
        room4.setConnections(room1, null, room7, null);
        room6.setConnections(room3,null, room9, room5);
        room8.setConnections(null, room9, null, room7);
        //Above version has the connections made both ways at the same time,
        // the out-commented segment below is the 'manual' way of doing it.

        /* room1.setConnections(null, room2, room4, null);
        room2.setConnections(null, room3, null, room1);
        room3.setConnections(null, null, room6, room2);
        room4.setConnections(room1, null, room7, null);
        room5.setConnections(null, room6, null, null);
        room6.setConnections(room3, null, room9, room5);
        room7.setConnections(room4, room8, null, null);
        room8.setConnections(null, room9, null, room7);
        room9.setConnections(room6, null, null, room8);*/
    }
}
