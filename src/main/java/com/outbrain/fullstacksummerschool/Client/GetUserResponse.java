package com.outbrain.fullstacksummerschool.Client;

import java.util.List;

public record GetUserResponse(Integer page, List<User> data) {
}
