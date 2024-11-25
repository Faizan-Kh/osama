/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auth;

import java.util.ArrayList;

/**
 *
 * @author Faizan
 */
public class AuthenticationService {
    ArrayList<User> users = new ArrayList<>();

    public AuthenticationService() {
        User u1 = new User("fawad", "1234");
        User u2 = new User("usama", "1234");
        StringBuilder name=new StringBuilder();
        name.append("Fawad").append(" ").append("Iqbal");
        System.out.println(name);
        System.out.println();
        users.add(u1);
        users.add(u2);
    }

    public boolean verifyUser(User user) {
        String clientUsername = user.username;
        for (User u : users) {
            if (u.username.equals(clientUsername)) {
                return true;
            }
        }
        return false;
    }
}
