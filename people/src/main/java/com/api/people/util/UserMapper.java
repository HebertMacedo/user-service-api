package com.api.people.util;

import com.api.people.dto.request.UserRequestDTO;
import com.api.people.dto.response.UserResponseDTO;
import com.api.people.entity.User;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User toUser(UserRequestDTO userDTO){

       return User.builder()
               .name(userDTO.getName())
               .cpf(userDTO.getCpf())
               .gender(userDTO.getGender())
               .email(userDTO.getEmail())
               .age(userDTO.getAge())
               .dateOfBirth(userDTO.getDateOfBirth())
               .address(userDTO.getAddress())
               .city(userDTO.getCity())
               .state(userDTO.getState())
               .profession(userDTO.getProfession())
               .active(userDTO.getActive())
               .build();

    }

    public UserResponseDTO toUserDTO(User user){
        return new UserResponseDTO(user);

    }

    public List<UserResponseDTO> toPeopleDTO(List<User> peopleList){
        return peopleList.stream().map(UserResponseDTO::new).collect(Collectors.toList());
    }
    public void updateUserData(User user, UserRequestDTO userDTO) {
        user.setName(userDTO.getName());
        user.setCpf(userDTO.getCpf());
        user.setGender(userDTO.getGender());
        user.setEmail(userDTO.getEmail());
        user.setAge(userDTO.getAge());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        user.setAddress(userDTO.getAddress());
        user.setCity(userDTO.getCity());
        user.setState(userDTO.getState());
        user.setProfession(userDTO.getProfession());
        user.setActive(userDTO.getActive());

    }
}
