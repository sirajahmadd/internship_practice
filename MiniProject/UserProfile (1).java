/*Create an interface called "User" that defines the basic properties of a user such as the name, email, and password.
Create two classes that implement the "User" interface: "RegularUser" and "AdminUser". "RegularUser" should have basic access to the social media platform while "AdminUser" should have additional privileges such as managing user accounts and posts.
Create a class called "Profile" that stores the user profiles and handles the creation and deletion of profiles.
Implement methods in the "Profile" class to search for profiles by name or email, and to update profile information.
Create a class called "Post" that stores the user posts and handles the creation and deletion of posts.
Implement methods in the "Post" class to search for posts by user or content, and to update post information.
Use custom exceptions to handle cases such as duplicate user profiles or invalid user information.*/


//ABstract
// Title: User Interface and Social Media Platform

// Description: This task involves creating an interface called "User" that defines the basic properties of a user such as name, email, and password. Two classes will be created that implement the "User" interface: "RegularUser" and "AdminUser". The "RegularUser" class will have basic access to the social media platform, while the "AdminUser" class will have additional privileges such as managing user accounts and posts. A class called "Profile" will store the user profiles and handle the creation and deletion of profiles. It will implement methods to search for profiles by name or email and to update profile information. A class called "Post" will store the user posts and handle the creation and deletion of posts. It will implement methods to search for posts by user or content and to update post information. Custom exceptions will be used to handle cases such as duplicate user profiles or invalid user information.


import java.util.Scanner;
public interface User {
    String name,email,password;
}

public class RegularUser implements User {
    private String name;
    private String email;
    private String password;

    public RegularUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}

public class AdminUser implements User {
    private String name;
    private String email;
    private String password;

    public AdminUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}public interface User {
    String name,email,password;
}

public class RegularUser implements User {
    private String name;
    private String email;
    private String password;

    public RegularUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}

public class AdminUser implements User {
    private String name;
    private String email;
    private String password;

    public AdminUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}