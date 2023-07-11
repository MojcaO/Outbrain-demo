package com.outbrain.fullstacksummerschool.Client;

import org.springframework.data.repository.query.Param;

public interface UserApi {
    @RequestLine("GET /api/users?page=")
    GetUserResponse getUsers(@Param("page")Integer page);
}
