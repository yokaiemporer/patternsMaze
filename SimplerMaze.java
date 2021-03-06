import java.util.*;
class SimplerMaze implements MazeBuilder
{
    ArrayList< Room > rooms=new ArrayList<Room>();
    public void mazeType()
    {
        System.out.println("Simple Maze");
    }
    public void buildMaze()
    {
        
        Room r1=MazeFactory.makeRoom(1);
        Room r2=MazeFactory.makeRoom(2);
        Door thedoor=MazeFactory.makeDoor(r1,r2);
        addRoom(r1);
        addRoom(r2);
        r1.setSide(Direction.North,new Wall());
        r1.setSide(Direction.East,thedoor);
        r1.setSide(Direction.South,new Wall());
        r1.setSide(Direction.West,new Wall());

        r2.setSide(Direction.North,new Wall());
        r2.setSide(Direction.East,new Wall());
        r2.setSide(Direction.South,new Wall());
        r2.setSide(Direction.West,thedoor);
        
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