package com.raianebatista.cadastro_usuario.controller;


import com.raianebatista.cadastro_usuario.business.UserService;
import com.raianebatista.cadastro_usuario.infrastructure.entitys.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return  ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<User> searchUserByEmail(@RequestParam String email) {
        return ResponseEntity.ok(userService.searchUserByEmail(email));
    }

    @DeleteMapping
    public  ResponseEntity<Void> deleteUserByEmail(@RequestParam String email) {
        userService.deleteByEmail(email);
        return  ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateUserById(@RequestParam Integer id, @RequestBody User user) {
        userService.updateUserByEmail(id, user);
        return ResponseEntity.ok().build();
    }
}
