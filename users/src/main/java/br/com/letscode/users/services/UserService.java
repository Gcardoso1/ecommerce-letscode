package main.java.br.com.letscode.users.services;

import main.java.br.com.letscode.users.entities.User;
import main.java.br.com.letscode.users.exceptions.UserNotFoundException;
import main.java.br.com.letscode.users.repositories.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Flux<User> findAll() {
        return this.userRepository.findAll();
    }

    public Mono<User> findById(String id) {
        return this.userRepository.findById(id).switchIfEmpty(
                Mono.error(new UserNotFoundException(id))
        );
    }

    public Mono<User> save(User user) {
        return this.userRepository.save(user);
    }

    public Mono<Void> deleteById(String id) {
        return this.findById(id).flatMap((user) ->
                this.userRepository.deleteById(user.getId())
        );
    }
}