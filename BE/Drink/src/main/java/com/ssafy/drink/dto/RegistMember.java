package com.ssafy.drink.dto;

import com.ssafy.drink.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegistMember {
    private String id;
    private String password;
    private int birthYear;
    private char gender;

    public Member toEntity(){
     return Member.builder()
             .id(id)
             .password(password)
             .birthYear(birthYear)
             .gender(gender)
             .cratedAt(LocalDateTime.now())
             .build();
    }
}
