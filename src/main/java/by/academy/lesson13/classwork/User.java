package by.academy.lesson13.classwork;

public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static class Query extends User {
        public Query(String login, String password){
            super(login, password);
        }
        public void printToLog(){
            System.out.println("Пользователь с логином:" + getLogin() + " и паролем: "+ getPassword() +" отправил запрос");
        }
    }

    public void createQuery(){
        Query query = new Query("Maxim", "2468");
        query.printToLog();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
