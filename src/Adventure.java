import java.util.Scanner;

public class Adventure {
    private static Map map;
    private static Player player;

    public static void main(String[] args) {
        map = new Map();
        player = new Player();

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                       Welcome to the portal maze!                       ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println(
                """
                          #########################################################################\s
                          ##                    Type 'go north' to move north                    ##\s
                          ##                    Type 'go east' to move east                      ##\s
                          ##                    Type 'go north' to move south                    ##\s
                          ##                    Type 'go west' to move west                      ##\s
                          ##           Type 'look' to look around in the current scenario        ##\s
                          ##      Type 'help' to have these instructions repeated back to you    ##\s
                          ##                    Type 'exit' to quit the game                     ##\s
                          ##                             Good Luck!                              ##\s
                          #########################################################################\s
                        """);

        //set player starting position
        player.setCurrentRoom(map.getStartRoom());
        System.out.println();
        System.out.println(player.getCurrentRoom());
        boolean running = true;
        Scanner in = new Scanner(System.in);
        while(running){
        String input = in.nextLine();
        if(input.startsWith("take ")){
            player.take(input.substring(5));
        }else if(input.startsWith("drop ")){
            player.drop(input.substring(5));
        }else{


        switch(input) {
            case "go north":
            case "n":
            case "go n":
            case "north":
                player.goNorth();
                //samme gøres for s/e/w
                break;
            case "go south":
            case "s":
            case "go s":
            case "south":
                player.goSouth();
                break;
            case "go east":
            case "e":
            case "go e":
            case "east":
                player.goEast();
                break;
            case "go west":
            case "w":
            case "go w":
            case "west":
                player.goWest();
                break;

            case "look":
            case "look around":
            case "peer":
                System.out.println(player.getCurrentRoom());
                break;
            case "help":
            case "hlep":
                System.out.println(
                        """
                                  #########################################################################\s
                                  ##                    Type 'go north' to move north                    ##\s
                                  ##                    Type 'go east' to move east                      ##\s
                                  ##                    Type 'go north' to move south                    ##\s
                                  ##                    Type 'go west' to move west                      ##\s
                                  ##           Type 'look' to look around in the current scenario        ##\s
                                  ##      Type 'help' to have these instructions repeated back to you    ##\s
                                  ##                    Type 'exit' to quit the game                     ##\s
                                  ##                             Good Luck!                              ##\s
                                  #########################################################################\s
                                """);
                break;
            case "exit":
                running = false;
                break;
            case "inventory":
            case "items":
                player.inventory();
                break;
            default:
                System.out.println("Invalid command, type 'help' for instructions");
                break;
        }
        }
    }
}
}