package org.example.fantasypick.api.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.fantasypick.shared.dto.BaseDto;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto extends BaseDto {
    private Long id;
    private String email;
    private String nickname;
    private BigDecimal budget;
}