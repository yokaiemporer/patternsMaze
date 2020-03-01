


class Room extends Mapsite
{
    private Mapsite[] arr=new Mapsite[4];
    private int _roomNumber;
    public Room(){}
    public Room(int roomNo)
    {
        _roomNumber=roomNo;
    }
    public int getRoomNo()
    {
        return _roomNumber;
    }
    void setSide(Direction dir,Mapsite mp)
    {
        arr[dir.ordinal()]=mp;
    }
}