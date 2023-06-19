package com.example.account.repository;
/*
 package com.example.account.repository
 : Repository(DB 에 연결할 때 사용하는 인터페이스) 가 위치하는 패키지
*/
import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findFirstByOrderByIdDesc();
    // 값이 있을수도 없을수도 있기 때문에 Optional 을 사용

    Integer countByAccountUser(AccountUser accountUser);

    Optional<Account> findByAccountNumber(String AccountNumber);

    List<Account> findByAccountUser(AccountUser accountUser);
}
