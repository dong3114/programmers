package main.burumable.user.service;

import main.burumable.user.domain.User;

public class UserServiceImpl implements UserService{
    private final User user;

    public UserServiceImpl(User user){
        this.user = user;
    }

    @Override
    public void buyLand() {

    }

    @Override
    public void sellLand() {

    }

    @Override
    public boolean payTax() {
        return false;
    }

    @Override
    public boolean payToll() {
        return false;
    }

    @Override
    public void receiveToll() {

    }

    @Override
    public void takeLoan() {

    }
}