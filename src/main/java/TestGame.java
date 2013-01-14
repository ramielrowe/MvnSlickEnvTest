import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class TestGame extends StateBasedGame{

    public TestGame(String name) {
        super(name);
    }

    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        this.addState(new TestState());
    }

    public static void main(String[] args) throws Exception {
        TestGame game = new TestGame("STZ");
        AppGameContainer app = new AppGameContainer(game);
        app.setDisplayMode(1024, 768, false);
        app.setTargetFrameRate(60);
        app.start();
    }
}
