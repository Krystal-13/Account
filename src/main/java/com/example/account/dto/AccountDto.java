package com.example.account.dto;
/*
 package com.example.account.dto
 : DTO(Data Transfer Object) 를 위치시키는 곳
    - Controller 에서 요청/응답에 사용할 클래스
    - 로직 내부에서 데이터 전송에 사용할 클래스
*/
import com.example.account.domain.Account;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AccountDto {
    // 컨트롤러와 서비스간 응답을 주고받음
    private Long userId;
    private String accountNumber;
    private Long balance;

    private LocalDateTime registeredAt;
    private LocalDateTime unRegisteredAt;

    //Entity 를 가지고 Dto 로 변화해주는 static 메서드 : 깔끔
    public static AccountDto fromEntity(Account account) {
        return AccountDto.builder()
                .userId(account.getAccountUser().getId())
                .accountNumber(account.getAccountNumber())
                .balance(account.getBalance())
                .registeredAt(account.getRegisteredAt())
                .unRegisteredAt(account.getUnRegisteredAt())
                .build();
    }
}
