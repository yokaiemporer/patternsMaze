//As u can see adding new functionality dynamically without ever modifying Room
import java.util.*;
class AlienRoomDecorator extends RoomDecorator
{
    ArrayList<String> ar=new ArrayList<>();
    Room room;
    private int _roomno;
    AlienRoomDecorator(){}
    AlienRoomDecorator(Room r1)
    {
        room=r1;
        _roomno=r1.getRoomNo();
        ar.add("aliens");
        ar.add("ufos");
        ar.add("abduction!");
        ar.add("disgusting beasts!");
        

    }
    public int getRoomNo()
    {

        return _roomno;
    }
    void addObjects(String obj)
    {
        ar.add(obj);
        // map.put(room,ar);
    }
    ArrayList<String> getContents()
    {
       
        return ar;
        
    }
}