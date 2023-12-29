package com.example.demo.oop.inheritanceandpolymorph.casejpa;

public class UserDetailManager extends UserManager {
    @Override
    public Object findByUsername() {
        //call supper if there is no difference on implementation
        return super.findByUsername();

        // or create own implementation
    }
}
