package Player;

public class VirtualPlayer2 extends Player implements VirtualPlayer {
    private static final String NAME ="VirtualPlayer-2";
    public VirtualPlayer2 () {
        super(NAME);
    }

    @Override
    public void showLosingExpression () {
        System.out.println("Huhu Virtual Player 2 thua roi");
    }

}
