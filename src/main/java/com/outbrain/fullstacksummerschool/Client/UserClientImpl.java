package com.outbrain.fullstacksummerschool.Client;

import org.springframework.beans.factory.annotation.Value;

public class UserClientImpl implements UserClient {

    UserApi userApi;

    UserClientImpl(@Value("${base.url}")) {

    }
    @Override
    public GetUserResponse getUsers(Integer page) {
        return null;
    }
}
