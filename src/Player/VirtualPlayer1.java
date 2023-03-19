package Player;

public class VirtualPlayer1 extends Player implements VirtualPlayer {
    private static final String NAME ="VirtualPlayer-1";
    public VirtualPlayer1 () {
        super(NAME);
    }

    @Override
    public void showLosingExpression () {
        System.out.println("Huhu Virtual Player 1 thua roi");
    }

}
