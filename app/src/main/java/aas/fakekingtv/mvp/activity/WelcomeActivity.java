package aas.fakekingtv.mvp.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.animation.Animation;

import com.king.base.SplashActivity;

import aas.fakekingtv.R;

/**
 * Created by 10964941 on 2018/1/26.
 */

public class WelcomeActivity extends SplashActivity {


    @Override
    public int getContentViewId() {
        return R.layout.activity_welcom;
    }

    @Override
    public Animation.AnimationListener getAnimationListener() {
        return null;
    }
}
