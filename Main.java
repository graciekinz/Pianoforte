package io.github.pianoforte;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Gdx;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    ShapeRenderer shape;
    int x = 50;
    int y = 50;

    @Override
    public void create () {
        shape = new ShapeRenderer();
        // song = C, D, E
    }

    @Override
    public void render () {
        // musician plays - C, D, E
        // if there's a note change.
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        x += 5;
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.circle(x, y, 50);
        shape.end();
    }
}
