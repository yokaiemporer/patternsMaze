import java.util.*;
class ComplexMaze implements MazeBuilder
{
    ArrayList< Room > rooms=new ArrayList<Room>();

    public void mazeType()
    {
        System.out.println("ComplexMaze");
    }
    public void buildMaze()
    {
        
        Room r1=MazeFactory.makeRoom(1);
        Room r2=MazeFactory.makeRoom(2);
        Room r3=MazeFactory.makeRoom(3);
        Door thedoor=MazeFactory.makeDoor(r1,r2);
        Door thedoor2=MazeFactory.makeDoor(r2,r3);
        addRoom(r1);
        addRoom(r2);
        addRoom(r3);
        r1.setSide(Direction.North,MazeFactorySingleton.makeWall());
        r1.setSide(Direction.East,thedoor);
        r1.setSide(Direction.South,MazeFactorySingleton.makeWall());
        r1.setSide(Direction.West,MazeFactorySingleton.makeWall());

        r2.setSide(Direction.North,MazeFactorySingleton.makeWall());
        r2.setSide(Direction.East,MazeFactorySingleton.makeWall());
        r2.setSide(Direction.South,thedoor2);
        r2.setSide(Direction.West,thedoor);

        r3.setSide(Direction.North,thedoor2);
        r3.setSide(Direction.East,MazeFactorySingleton.makeWall());
        r3.setSide(Direction.South,MazeFactorySingleton.makeWall());
        r3.setSide(Direction.West,thedoor);
        
    }
    public void addRoom(Room a)
    {
        rooms.add(a);
    }
    public ArrayList<Room> getRooms()
    {
        return rooms;
    }
}