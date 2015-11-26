package controllers;

import model.User;
import model.UserDao;
import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller {
    public static Result showUsername(Integer id){

    	UserDao userDao = new UserDao();
		userDao.connect();
		User currentUser = userDao.getUser(id);
    	
        String out = new StringBuilder().append("User ").append(id).append(": ").append(currentUser.getFullName()).toString();
        return ok(views.html.showuser.render(out));
    }
}
