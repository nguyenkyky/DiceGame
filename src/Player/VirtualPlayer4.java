package Player;

public class VirtualPlayer4 extends Player implements VirtualPlayer {
    private static final String NAME ="VirtualPlayer-4";
    public VirtualPlayer4 () {
        super(NAME);
    }

    @Override
    public void showLosingExpression () {
        System.out.println("Huhu Virtual Player 4 thua roi");
    }

}
