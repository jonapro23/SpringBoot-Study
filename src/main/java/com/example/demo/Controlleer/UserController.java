package com.example.demo.Controlleer;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<User> getUsers(){
     return repository.listAll();
    }
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public Void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return null;
    }
    @PostMapping()
    public void postUser(@RequestBody User usuario){
        repository.save(usuario);
    }

}
