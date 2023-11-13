package com.api.people.controller;


import com.api.people.dto.request.UserRequestDTO;
import com.api.people.dto.response.UserResponseDTO;
import com.api.people.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.buf.UEncoder;
import org.apache.tomcat.util.buf.UriUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/people")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable(name = "id") Long id){

        return ResponseEntity.ok().body(userService.findyId(id));
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }
    @PostMapping
    public ResponseEntity<UserResponseDTO> register(@RequestBody UserRequestDTO userDTO, UriComponentsBuilder uriBuilder){

        UserResponseDTO userResponseDTO = userService.register(userDTO);
        URI uri = uriBuilder.path("/user/{id}").buildAndExpand(userResponseDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(userResponseDTO);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UserResponseDTO> update(@RequestBody UserRequestDTO userDTO, @PathVariable(name = "id") Long id){

        return ResponseEntity.ok().body(userService.update(id, userDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(userService.delete(id));
    }

}
