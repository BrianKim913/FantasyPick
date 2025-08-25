package org.example.fantasypick.api.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.fantasypick.shared.dto.BaseDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDto extends BaseDto {
    private String email;
    private String password;
    private String nickname;
}