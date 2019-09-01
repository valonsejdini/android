package ca.vivocloud.mvvmloginapp.core.dagger.builders;


import ca.vivocloud.mvvmloginapp.ui.login.LoginActivity;
import ca.vivocloud.mvvmloginapp.ui.login.LoginActivityModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity contributeLoginActivity();
}
