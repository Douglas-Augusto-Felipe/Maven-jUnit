package com.example.douglas.repository;

import com.example.douglas.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
   public void save(Usuario usuario){
        if(usuario.getId()== null) //se o usuário for igual a nulo
            System.out.println("SAVE - recebendo usuário na camada de repositório");
        else
            System.out.println("Update - recebendo usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void deleteByID(Integer id){
        System.out.println(String.format("DELETE/id - recevendo o id : %d para excluir um usuário"));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Douglas","passoword"));
        usuarios.add(new Usuario("Kelli","passoword"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo um id: %d para localizar um usuário"));
        return new Usuario("Douglas","password");
    }
    public Usuario findByUsername(String username){
       System.out.println(String.format("FIND/username - Recebendo um username: %d para localizar um usuário"));
        return new Usuario("Douglas","password");
    }
}
