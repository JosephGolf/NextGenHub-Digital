package com.example.mailsender_java_live_project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerContactMailDto {

    private String name;
    private String email;
    private String phone;
    private String message;



    @Override
    public String toString() {

        return "UserDto [name=" + name + ", address = " + email + ", message = " + message + ", phone = " + phone + "]";
    }
}

