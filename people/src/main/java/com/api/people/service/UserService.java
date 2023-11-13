package com.api.people.service;

import com.api.people.dto.request.UserRequestDTO;
import com.api.people.dto.response.UserResponseDTO;

import java.util.List;

public interface UserService {

    UserResponseDTO findyId(Long id);

    List<UserResponseDTO> findAll();

    UserResponseDTO register(UserRequestDTO userDTO);

    UserResponseDTO update(Long id, UserRequestDTO userDTO);

    String delete(Long id);
}


