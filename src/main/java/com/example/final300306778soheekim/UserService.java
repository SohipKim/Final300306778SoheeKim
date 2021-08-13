package com.example.final300306778soheekim;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static List<User> todos = new ArrayList<User>();

    static {
        todos.add(new User("115", "Jasper", "15000", "5", "Savings.Deluxe"));
        todos.add(new User("112", "zanip", "5000", "2", "Savings.Deluxe"));

    }

    public void initialadd() {
        todos.add(new User("115", "Jasper", "15000", "5", "Savings.Deluxe"));
        todos.add(new User("112", "zanip", "5000", "2", "Savings.Deluxe"));

    }

    public List<User> retrieveTodos() {
        List<User> filteredTodos = new ArrayList<User>();
        for (User todo : todos) {
            filteredTodos.add(todo);
        }
        return filteredTodos;    }

    public void addTodo(String custno,String custname,String cdep, String nyears, String savtype) {

        todos.add(new User(custno, custname, cdep, nyears, savtype));
    }


    public void deleteTodo(String id) {

        for (int i = 0; i < todos.size(); i++) {

            if(id.equals(todos.get(i).getCustno())) {

                todos.remove(i);
                break;
            }



        }


    }

    public User retrieve(String id){

        for(User todo: todos){
            if(todo.getCustno().equals(id)){
                return todo;
            }
        }
        return null;

    }

    public void update(User todo){
        todos.remove(todo);
        todos.add(todo);
    }
}
