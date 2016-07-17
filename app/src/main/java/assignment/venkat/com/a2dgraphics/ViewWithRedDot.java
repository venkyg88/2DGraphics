package assignment.venkat.com.a2dgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.view.View;

/**
 * Created by venkatgonuguntala on 7/16/16.
 */

public class ViewWithRedDot extends View {
    public ViewWithRedDot(Context context) {
        super(context);
    }

    //view draw a circle on a dark background

    /*@Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLACK); //entire area black
        Paint circlePaint = new Paint();
        circlePaint.setColor(Color.RED);
        canvas.drawCircle(canvas.getWidth()/2, //value of x in (x, y) co-ordinates
                canvas.getHeight()/2, // value of Y in (x, y) co- ordinates
                canvas.getWidth()/4,  // radius value
                circlePaint);         // painted with
    }*/

    //Linear Gradients
    /*@Override
    protected void onDraw(Canvas canvas) {
        Paint circlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        LinearGradient linearGradient = new LinearGradient(0,0,5,5,
                Color.RED, Color.BLACK,
                Shader.TileMode.MIRROR);
        circlePaint.setShader(linearGradient);
        canvas.drawCircle(99, 99, 100, circlePaint);
    }*/


    //Radial Gradients
    /*@Override
    protected void onDraw(Canvas canvas) {
        Paint circlepaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        RadialGradient radialGradient = new RadialGradient(250,
                175,
                50,
                Color.GREEN,
                Color.BLACK,
                Shader.TileMode.MIRROR);

        circlepaint.setShader(radialGradient);
        canvas.drawCircle(250, 175, 150, circlepaint);
    }*/


    //Sweep Gradients
    @Override
    protected void onDraw(Canvas canvas) {
        Paint circlepaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        SweepGradient sweepGradient = new SweepGradient(canvas.getWidth()-125, canvas.getHeight() - 125, new int[] {Color.GREEN, Color.YELLOW
                , Color.BLUE, Color.RED}, null);

        circlepaint.setShader(sweepGradient);
        canvas.drawCircle(canvas.getWidth()-125, canvas.getHeight() - 125, 100, circlepaint);
    }
}
