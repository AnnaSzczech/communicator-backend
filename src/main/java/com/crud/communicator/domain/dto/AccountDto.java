package com.crud.communicator.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccountDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;
    private boolean online;
}