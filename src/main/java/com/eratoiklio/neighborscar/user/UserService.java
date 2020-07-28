package com.eratoiklio.neighborscar.user;

import com.eratoiklio.neighborscar.user.User;
import com.eratoiklio.neighborscar.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository repository;

    public User getOwner(Long id){
        User user = repository.findById(id)
                .orElseThrow();;
       return user;
    }

}
