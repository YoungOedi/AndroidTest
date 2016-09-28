package de.dortmund.fh.jung.masterapp.homeScreen;

import dagger.Component;

/**
 * Created by hendrikjung on 28.09.16.
 */

@Component(modules = HomeScreenPresenterModule.class)
public interface HomeScreenComponent {
    void inject(HomeScreenActivity activity);
}
