
public class MazeGame
{
    static Maze createGame()
    {
        Maze amaze=new Maze();
        Room r1=new Room(1);
        Room r2=new Room(2);
        Door thedoor=new Door(r1,r2);
        amaze.addRoom(r1);
        amaze.addRoom(r2);
        r1.setSide(Direction.North,new Wall());
        r1.setSide(Direction.East,thedoor);
        r1.setSide(Direction.South,new Wall());
        r1.setSide(Direction.West,new Wall());

        r2.setSide(Direction.North,new Wall());
        r2.setSide(Direction.East,new Wall());
        r2.setSide(Direction.South,new Wall());
        r2.setSide(Direction.West,thedoor);
        return amaze;
    }
    public static void main(String[] args) {
        Maze mez=createGame();
        for(Room room : mez.getRooms())
        {
            System.out.println("rooms no"+room.getRoomNo());
            


        }

    }
}