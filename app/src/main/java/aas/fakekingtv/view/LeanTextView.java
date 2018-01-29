package aas.fakekingtv.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import aas.fakekingtv.R;

/**
 * Created by 10964941 on 2018/1/26.
 */

public class LeanTextView extends TextView {

    //定义一个倾斜程度变量
    private int mDegree = 0;

    public int getmDegree() {
        return mDegree;
    }

    public void setmDegree(int mDegree) {
        this.mDegree = mDegree;
    }

    public LeanTextView(Context context) {
        super(context);
    }

    public LeanTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LeanTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LeanTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.LeanTextView);
        mDegree = typedArray.getDimensionPixelSize(R.styleable.LeanTextView_degree, 0);
        typedArray.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        canvas.rotate(mDegree, getWidth()/2f, getHeight()/2f);
        super.onDraw(canvas);
        canvas.restore();
    }

}
