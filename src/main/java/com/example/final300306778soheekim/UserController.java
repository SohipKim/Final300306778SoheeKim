package com.example.final300306778soheekim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@SessionAttributes({"id","desc","errMsg", "errorMessage"})
@RequestMapping
@Controller
public class UserController {

    DatabaseService service1;

    @Autowired
    UserService service;

    @Autowired
     Connection123 connect;



    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String showUserInformationPage(ModelMap model,@RequestParam(defaultValue = "") String id) throws ClassNotFoundException, SQLException{

        service1 = new DatabaseService(connect.connect());

        model.addAttribute("todos", service1.display());

        List<User> filteredTodos = new ArrayList<User>();

        filteredTodos = (List) model.get("todos");

        model.put("custno", filteredTodos.get(0).getCustno());
        model.put("custname", filteredTodos.get(0).getCustname());
        model.put("cdep", filteredTodos.get(0).getCdep());
        model.put("nyears", filteredTodos.get(0).getNyears());
        model.put("savtype", filteredTodos.get(0).getsavtype());

        return "user";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUserInformationPage2(ModelMap model) throws ClassNotFoundException, SQLException{


        service1= new DatabaseService(connect.connect());

        model.addAttribute("todos", service1.display());

        List<User> filteredTodos = new ArrayList<User>();

        filteredTodos = (List) model.get("todos");

        model.put("custno", filteredTodos.get(0).getCustno());
        model.put("custname", filteredTodos.get(0).getCustname());
        model.put("cdep", filteredTodos.get(0).getCdep());
        model.put("nyears", filteredTodos.get(0).getNyears());
        model.put("savtype", filteredTodos.get(0).getsavtype());

        return "user";

    }


    @RequestMapping(value ="/add-todo", method = RequestMethod.GET)
    public String showtodopage(){
        return "userAdd";
    }

    @RequestMapping(value ="/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @RequestParam String custno, @RequestParam String custname, @RequestParam String cdep, @RequestParam String nyears, @RequestParam String savtype) throws SQLException, ClassNotFoundException {


        if(!((service1.search(custno)) == null)){

            model.put("errorMessage", "Record Existing");
            return "redirect:/user";

        }

        User userAdd = new User(custno, custname, cdep, nyears, savtype);

        service1.add(userAdd);

        model.clear();
        return "redirect:/user";
    }


    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateTodoPage(ModelMap model,  @RequestParam(defaultValue = "") String id) throws SQLException, ClassNotFoundException {

        model.put("id", id);

        User userEdit = service1.search(id);

        model.put("custno", userEdit.getCustno());
        model.put("custname", userEdit.getCustname());
        model.put("cdep", userEdit.getCdep());
        model.put("nyears", userEdit.getNyears());
        model.put("savtype", userEdit.getsavtype());

        return "useredit";
    }


    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String showUpdate(ModelMap model, @RequestParam String custno, @RequestParam String custname, @RequestParam String cdep, @RequestParam String nyears, @RequestParam String savtype) throws SQLException, ClassNotFoundException {


        String iid = (String) model.get("custno");

        User user = new User(custno, custname, cdep, nyears, savtype);

        service1.edit(user, iid);

        return "redirect:/";

    }


    @RequestMapping(value ="/delete-todo", method = RequestMethod.GET)
    public String deleteTodo(ModelMap model, @RequestParam String id) throws SQLException, ClassNotFoundException {

        service1.delete(id);

        model.clear();
        return "redirect:/";
    }





}
