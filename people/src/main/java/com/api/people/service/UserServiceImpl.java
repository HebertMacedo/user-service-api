package com.api.people.service;
import com.api.people.dto.request.UserRequestDTO;
import com.api.people.dto.response.UserResponseDTO;
import com.api.people.entity.User;
import com.api.people.repository.UserRepository;
import com.api.people.util.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDTO findyId(Long id) {
        return userMapper.toUserDTO(returnUser(id));
    }

    @Override
    public List<UserResponseDTO> findAll() {
        return userMapper.toPeopleDTO(userRepository.findAll());

    }

    @Override
    public UserResponseDTO register(UserRequestDTO userDTO) {

        User user = userMapper.toUser(userDTO);
        return userMapper.toUserDTO((userRepository.save(user)));

    }

    @Override
    public UserResponseDTO update(Long id, UserRequestDTO userDTO) {
        User user = returnUser(id);

        userMapper.updateUserData(user, userDTO);

        return userMapper.toUserDTO(userRepository.save(user));

    }

    @Override
    public String delete(Long id) {
        userRepository.deleteById(id);
        return "User delete";
    }

    private User returnUser(Long id){
        return  userRepository.findById(id).orElseThrow(()-> new RuntimeException("User wasbn't fount on database"));
    }
}


