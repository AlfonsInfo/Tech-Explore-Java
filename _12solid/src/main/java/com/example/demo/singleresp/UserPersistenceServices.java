package com.example.demo.singleresp;

public class UserPersistenceServices {

    private Store store = new Store();
    public void saveUser(User user)

    {
        store.store(user);
    }
}
