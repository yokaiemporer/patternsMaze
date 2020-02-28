
class Door extends Mapsite
{
    private Room _room1;
    private Room  _room2;
    private boolean _isOpen;
    public Door(Room a,Room b)
    {
_room1=a;
_room2=b;
    }
    void Enter(){

    }
    Room otherSideFrom(Room a)
    {
        if(a==_room1)
        return _room2;
        else if(a==_room2)
        return _room1;
        else
        return new Room(0);
    }
    
    
}