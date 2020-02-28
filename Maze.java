
import java.util.*;
class Maze
{
public Maze()
{

}
private ArrayList< Room > rooms=new ArrayList<>();



void addRoom(Room a)
{
    rooms.add(a);
}
ArrayList<Room> getRooms()
{
    return rooms;
}

}