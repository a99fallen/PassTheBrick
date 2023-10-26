package com.PassTheBrick.web.command;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class RegisterUserCommand {

    @NotNull @Email
    private String username;
    @NotBlank @Size(min = 4, max = 12)
    private String password;
}
