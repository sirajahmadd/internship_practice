// Create an interface called "User" that defines the basic properties of a user such as the name, email, and password.
// Create two classes that implement the "User" interface: "RegularUser" and "AdminUser". "RegularUser" should have basic access to the social media platform while "AdminUser" should have additional privileges such as managing user accounts and posts.
// Create a class called "Profile" that stores the user profiles and handles the creation and deletion of profiles.
// Implement methods in the "Profile" class to search for profiles by name or email, and to update profile information.
// Create a class called "Post" that stores the user posts and handles the creation and deletion of posts.
// Implement methods in the "Post" class to search for posts by user or content, and to update post information.
// Use custom exceptions to handle cases such as duplicate user profiles or invalid user information.
import java.util.ArrayList;
import java.util.List;
public interface User {
    String getName();
    String getEmail();
    String getPassword();
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

public class Profile {
    private List<User> users;

    public Profile() {
        users = new ArrayList<>();
    }

    public void addUser(User user) throws DuplicateUserException {
        if (users.contains(user)) {
            throw new DuplicateUserException();
        }
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User searchUserByName(String name) throws UserNotFoundException {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new UserNotFoundException();
    }

    public User searchUserByEmail(String email) throws UserNotFoundException {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        throw new UserNotFoundException();
    }

    public void updateUser(User user) {
        int index = users.indexOf(user);
        if (index != -1) {
            users.set(index, user);
        }
    }
}

