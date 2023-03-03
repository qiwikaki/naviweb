package ivan.projects.naviweb.entity;

public class Admin extends Person{

    private String lastName;

    public Admin(int id, String login, String password, String email, String lastName) {
        super(id, login, password, email);
        this.lastName = lastName;
    }

    @Override
    void showSomething() {
        System.out.println("show Admin");
    }

//    public static void main(String[] args) {
//
//        Person user = new User(1,"!","@","#");
//        Person admin = new Admin(1,"!","@","#", "Дуб");
//
//        user.showSomething();
//        admin.showSomething();
//
//        System.out.println(admin);
//        System.out.println(user);
//        System.out.println(user.equals(admin));
//
//    }

}
