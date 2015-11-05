package com.y29.developersruler.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import com.y29.developersruler.R;
import com.y29.developersruler.util.DimensionUtil;

/**
 * Created by krishan on 4/11/15.
 */
public class HorizontalRuler implements DevView {


    private View view;

    public HorizontalRuler(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.view_horizontal_ruler, null);
    }


    @Override
    public View getView() {
        return view;
    }

    @Override
    public int getWidthFlag() {
        return WindowManager.LayoutParams.FILL_PARENT;
    }

    @Override
    public int getHeightFlag() {
        return (int) DimensionUtil.convertDpToPixel(72);
    }
}
