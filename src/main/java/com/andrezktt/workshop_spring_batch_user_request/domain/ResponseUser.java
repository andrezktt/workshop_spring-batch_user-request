package com.andrezktt.workshop_spring_batch_user_request.domain;

import com.andrezktt.workshop_spring_batch_user_request.dto.UserDTO;

import java.util.List;

public class ResponseUser {

    private List<UserDTO> content;

    public List<UserDTO> getContent() {
        return content;
    }
}
