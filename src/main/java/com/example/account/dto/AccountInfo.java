package com.example.account.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountInfo {
    //클라이언트와 컨트롤러(어플리케이션)간 응답을 주고받음
    private String AccountNumber;
    private Long balance;

}
