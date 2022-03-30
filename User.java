public class User {

    private String username;
    private String password;
    public Boolean log;

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;

    }

    public void setUsername(String name){
        this.username = name;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

    public void Loggedin(Boolean login){
        this.log = login;
    }

}