package Player;

public class Player {
    private String name;
    public static final int WINNING_POINT = 21;
    private int curPoint = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void updatePoint(int p) {
        curPoint += p;
        if(curPoint > WINNING_POINT) {
            curPoint = 0 ;
        }
    }

    public boolean checkWinning () {
        if (curPoint == WINNING_POINT) {
            return true ;
        }
        return false;
    }

    public int getPoint () {
        return curPoint;
    }


}
