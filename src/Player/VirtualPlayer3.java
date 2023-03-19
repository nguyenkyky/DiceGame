package Player;

public class VirtualPlayer3 extends Player implements VirtualPlayer {
    private static final String NAME ="VirtualPlayer-3";
    public VirtualPlayer3 () {
        super(NAME);
    }

    @Override
    public void showLosingExpression () {
        System.out.println("Huhu Virtual Player 3 thua roi");
    }

}
