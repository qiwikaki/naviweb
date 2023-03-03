package ivan.projects.naviweb.entity;

public class User extends Person{
    public User(int id, String login, String password, String email) {
        super(id, login, password, email);
    }

    @Override
    void showSomething() {
        System.out.println("show User");
    }

//    public static void main(String[] args) {
//
//        System.out.println(new User(2,"@","@","@"));
//    }

}
