package de.dortmund.fh.jung.masterapp.homeScreen;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hendrikjung on 28.09.16.
 */

@Module
public class HomeScreenPresenterModule {

    private final HomeScreenContract.View mView;

    public HomeScreenPresenterModule(HomeScreenContract.View view) {
        mView = view;
    }

    @Provides
    HomeScreenContract.View provideHomeContractView() {
        return mView;
    }
}
