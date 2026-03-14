package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User usuario) {
        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> listAll() {
        System.out.println("LIST - listando usuarios do sistema");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Jonathan", "password"));
        usuarios.add(new User("Marcia", "masterpass"));
        return usuarios;
    }

    public User finById(Integer id) {
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("gleyson", "password");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - recebendo o username: %s para localizar o usuário", username));
        return new User("jonathan", "password");
    }

}
