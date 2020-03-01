//As u can see adding new functionality dynamically without ever modifying Room
import java.util.*;
class ScaryRoomDecorator extends RoomDecorator
{
    ArrayList<String> ar=new ArrayList<>();
    Room room;
    private int _roomno;
    ScaryRoomDecorator(){}
    ScaryRoomDecorator(Room r1)
    {
        room=r1;
        _roomno=r1.getRoomNo();
        ar.add("Ghosts");
        ar.add("Monsters");
        ar.add("akil");
        ar.add("Sreetej and Rahul");
        ar.add("PJ");
        ar.add("myself");
        

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