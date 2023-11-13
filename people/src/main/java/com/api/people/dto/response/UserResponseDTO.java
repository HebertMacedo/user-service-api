package com.api.people.dto.response;

import java.util.Date;
import  com.api.people.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDTO {
    private  Long id;

    private String name;

    private String cpf;

    private String gender;

    private String email;

    private Integer age;

    private Date dateOfBirth;

    private String address;

    private String city;

    private String state;

    private String profession;

    private Boolean active;

    public UserResponseDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.cpf = user.getCpf();
        this.gender = user.getGender();
        this.email = user.getEmail();
        this.age = user.getAge();
        this.dateOfBirth = user.getDateOfBirth();
        this.address = user.getAddress();
        this.city = user.getCity();
        this.state = user.getState();
        this.profession = user.getProfession();
        this.active = user.getActive();

    }
}

