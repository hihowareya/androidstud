package com.example.woo1765.game;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.constraint.solver.widgets.Rectangle;

/**
 * Created by woo1765 on 2/2/2018.
 */

    public class RectPlayer implements GameObject
    {
        private Rect rectangle;
        private int color;

        public Rect getRectangle()
        {
         return rectangle;
        }

        public RectPlayer(Rect rectangle, int color)
        {
            this.rectangle = rectangle;
            this.color = color;
        }
        @Override
        public void draw(Canvas canvas)
        {
            Paint paint = new Paint();
            paint.setColor(color);
            canvas.drawRect(rectangle, paint);
        }

        @Override
        public void update()
        {

        }

        public void update(Point point)
        {
            rectangle.set(point.x - rectangle.width()/2, point.y - rectangle.height(),point.x + rectangle.width()/2, point.y + rectangle.height());

        }
    }


