package ca.vivocloud.mvvmloginapp.core.dagger.components;


import javax.inject.Singleton;

import ca.vivocloud.mvvmloginapp.MvvmLoginApplication;
import ca.vivocloud.mvvmloginapp.core.dagger.builders.ActivityBuilder;
import ca.vivocloud.mvvmloginapp.core.dagger.modules.MvvmLoginAppModule;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,
                    MvvmLoginAppModule.class,
                    ActivityBuilder.class})
public interface MvvmLoginMainComponent extends AndroidInjector<MvvmLoginApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MvvmLoginApplication> {}

}