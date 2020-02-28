class MazeFactory
{
    public MazeFactory()
    {

    }
    static Maze makeMaze()
    {
        return new Maze();
    }
    static Wall makeWall()
    {
        return new Wall();
    }
    static Room makeRoom(int n)
    {
        return new Room(n);
    }
    static Door makeDoor(Room r1,Room r2)
    {
        return new Door(r1,r2);
    }
}