import java.util.*;
class RoomDecorator extends Room
{
    Room room;
    HashMap<Room,ArrayList<String> > map = new HashMap<>(); 

    ArrayList<String> ar;
    RoomDecorator(){}
    RoomDecorator(Room r1){
room=r1;
    }
    
    // RoomDecorator(Room r1,RoomDecorator type)
    // {
    //     room=r1;
    //     ar=map.get(r1);
    //     for(String objs:type.getContents())
    //         ar.add(objs);
    //     map.put(room,ar);
    // }
    void addObjects(String obj)
    {
        ar.add(obj);
        map.put(room,ar);
    }
    ArrayList<String> getContents()
    {
        return ar;
    }
    
}