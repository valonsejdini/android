package ca.vivocloud.mvvmloginapp;

import ca.vivocloud.mvvmloginapp.core.dagger.components.DaggerMvvmLoginMainComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MvvmLoginApplication extends DaggerApplication {
    private static MvvmLoginApplication instance;
    private static final String TAG = MvvmLoginApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
    }

    public static synchronized MvvmLoginApplication getInstance() {
        return instance;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMvvmLoginMainComponent.builder().create(this);
    }
}
