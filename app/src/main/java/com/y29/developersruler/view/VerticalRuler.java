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
public class VerticalRuler implements DevView {


    private View view;

    public VerticalRuler(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.content_main, null);
    }


    @Override
    public View getView() {
        return view;
    }

    @Override
    public int getWidthFlag() {
        return (int) DimensionUtil.convertDpToPixel(72);
    }

    @Override
    public int getHeightFlag() {
        return WindowManager.LayoutParams.FILL_PARENT;
    }
}
