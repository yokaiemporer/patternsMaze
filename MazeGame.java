
public class MazeGame
{
    static MazeBuilder createGame(MazeBuilder structure)
    {
        structure.buildMaze();
        structure.mazeType();
        return structure;

    }
    public static void main(String[] args) {
        // SimplerMaze smp=MazeFactory.makeSimple();
        // ComplexMaze cmp=MazeFactory.makeComplex();
        SimplerMaze smp=MazeFactorySingleton.makeSimple();
        ComplexMaze cmp=MazeFactorySingleton.makeComplex();

        MazeBuilder mez=createGame(smp);

        for(Room room : mez.getRooms())
        {
            System.out.print("rooms no"+room.getRoomNo()+ " properties:");
            if(room instanceof RoomDecorator){
            RoomDecorator roomM=(RoomDecorator)room;
            for(String a:roomM.getContents())//usually u would get an error since there is
            System.out.println(a);
            }
            else
            System.out.println("ordinary room,no contents");
            
        }
        mez=createGame(cmp);
        
        for(Room room : mez.getRooms())
        {
            System.out.print("rooms no"+room.getRoomNo()+ " properties:");
            if(room instanceof RoomDecorator){
            RoomDecorator roomM=(RoomDecorator)room;
            for(String a:roomM.getContents())//usually u would get an error since there is
            System.out.println(a);
            }
            else
            System.out.println("ordinary room,no contents");
            
        }

    }
}