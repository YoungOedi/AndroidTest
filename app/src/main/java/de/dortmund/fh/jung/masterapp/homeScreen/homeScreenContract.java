package de.dortmund.fh.jung.masterapp.homeScreen;

import de.dortmund.fh.jung.masterapp.BasePresenter;
import de.dortmund.fh.jung.masterapp.BaseView;

/**
 * Created by hendrikjung on 28.09.16.
 */

public interface HomeScreenContract {

    interface View extends BaseView<Presenter> {
        void showUserData();
        void showAccountBalance();
        void showAccountMovement();
        void showLogin();
        void showTransactionScreen();
    }

    interface Presenter extends BasePresenter {
        void logIn();
        void logOut();
    }
}
