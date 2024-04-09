package udem.edu.co.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.login.entities.User;
import udem.edu.co.login.service.UserService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/usuarios/")
    public List<User> findAllUsuarios() {
        return this.userService.findAllUser();
    }

    @GetMapping("/usuarios/{cedula}")
    public User findUserById(@RequestParam("cedula") int cedula) {
        return this.userService.findByIdUser();
    }

    @PostMapping("/usuarios")
    public User updateUsuarios(@RequestBody() User user) {
        return null;
    }

    @PutMapping("/usuarios/{idUser}")
    public ResponseEntity<User> updateUsuarios(@RequestParam("idUser") int idUser ){
        return null;
    }

    @DeleteMapping("/usuarios/{idUser}")
    public ResponseEntity<User> deleteUsuarios(@PathVariable("idUser") int idUser) {
        return null;
    }
}
