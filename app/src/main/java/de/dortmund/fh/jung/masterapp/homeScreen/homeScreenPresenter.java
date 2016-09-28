package de.dortmund.fh.jung.masterapp.homeScreen;

import javax.inject.Inject;

/**
 * Created by hendrikjung on 28.09.16.
 */

final class HomeScreenPresenter implements HomeScreenContract.Presenter {

    private final HomeScreenContract.View mHomeScreenView;
    private boolean firstLogin;

    @Inject
    HomeScreenPresenter(HomeScreenContract.View homeView) {
        mHomeScreenView = homeView;
    }

    @Inject
    void setUpListeners(){
        mHomeScreenView.setPresenter(this);
    }

    @Override
    public void logIn() {

    }

    @Override
    public void logOut() {

    }

    @Override
    public void start() {

    }
}
