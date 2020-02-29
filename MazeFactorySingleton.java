class MazeFactorySingleton
{
    private MazeFactorySingleton()
    {

    }
    private static class BillPughSingletonHelper{
        private static final SimplerMaze simplermaze=new SimplerMaze();
        private static final ComplexMaze complexmaze=new ComplexMaze();
        private static final Wall wall=new Wall();
    }
    static SimplerMaze makeSimple()
    {
        return BillPughSingletonHelper.simplermaze;
    }
    static ComplexMaze makeComplex()
    {
        return BillPughSingletonHelper.complexmaze;
    }
    static Wall makeWall()
    {
        return BillPughSingletonHelper.wall;
    }
    // static Room makeRoom(int n)
    // {
    //     return new Room(n);
    // }
    // static Door makeDoor(Room r1,Room r2)
    // {
    //     return new Door(r1,r2);
    // }
}