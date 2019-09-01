package ca.vivocloud.mvvmloginapp.core.dagger.modules;

import android.content.Context;

import com.google.gson.Gson;

import javax.inject.Singleton;

import ca.vivocloud.mvvmloginapp.MvvmLoginApplication;
import ca.vivocloud.mvvmloginapp.core.utils.Utils;
import dagger.Module;
import dagger.Provides;


@Module
public class MvvmLoginAppModule {

    @Singleton
    @Provides
    Context provideContext(MvvmLoginApplication application){
        return application;
    }

    @Singleton
    @Provides
    Gson provideGson(){
        return new Gson();
    }

    @Singleton
    @Provides
    Utils provideUtils(Context context){
        return new Utils(context);
    }

}
