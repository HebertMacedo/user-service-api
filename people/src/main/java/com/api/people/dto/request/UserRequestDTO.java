package com.api.people.dto.request;

import lombok.Getter;
import java.util.Date;

@Getter

public class UserRequestDTO {

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
}


    //Esses dados são usados para transferência entre diferentes partes do código.