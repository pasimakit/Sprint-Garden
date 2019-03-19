package fi.tamk.project;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;


public class MainGame extends Game {
	SpriteBatch batch;

	final int SCREEN_WIDTH = 256;
	final int SCREEN_HEIGHT = 144;

	OrthographicCamera camera;
    GameScreen gameScreen;

    BitmapFont font14;
    BitmapFont font8;

    int stepCount; // renderissä
    int oldStepCount;

    int coins;

    public SpriteBatch getBatch() {
        return batch;
    }

    public GameScreen getGameScreen() {
        return gameScreen;
    }


    public void receiveSteps(int stepCount) {
        //System.out.println("Steps: " + stepCount);
        this.stepCount = stepCount;
    }

    @Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, SCREEN_WIDTH, SCREEN_HEIGHT);
        gameScreen = new GameScreen(this);
        setScreen(gameScreen);
    }

	@Override
	public void render () {
        super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
