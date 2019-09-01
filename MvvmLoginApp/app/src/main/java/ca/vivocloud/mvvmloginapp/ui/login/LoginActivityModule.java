package ca.vivocloud.mvvmloginapp.ui.login;


import androidx.lifecycle.ViewModelProvider;

import ca.vivocloud.mvvmloginapp.core.utils.ViewModelProviderFactory;
import ca.vivocloud.mvvmloginapp.data.LoginRepository;
import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    @Provides
    LoginActivityViewModel providesLoginActivityViewModel(LoginRepository loginRepository){
        return new LoginActivityViewModel(loginRepository);
    }

    @Provides
    ViewModelProvider.Factory provideViewModelProvider(LoginActivityViewModel viewModel){
        return new ViewModelProviderFactory<>(viewModel);
    }


}
