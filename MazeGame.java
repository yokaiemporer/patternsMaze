
public class MazeGame
{
    static MazeBuilder createGame(MazeBuilder structure)
    {
        structure.buildMaze();
        structure.mazeType();
        return structure;

    }
    public static void main(String[] args) {
        SimplerMaze smp=MazeFactory.makeSimple();
        ComplexMaze cmp=MazeFactory.makeComplex();
        MazeBuilder mez=createGame(smp);

        for(Room room : mez.getRooms())
        {
            System.out.println("rooms no"+room.getRoomNo());
            
        }
        mez=createGame(cmp);
        
        for(Room room : mez.getRooms())
        {
            System.out.println("rooms no"+room.getRoomNo());
            
        }

    }
}