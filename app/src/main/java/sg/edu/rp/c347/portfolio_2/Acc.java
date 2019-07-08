package sg.edu.rp.c347.portfolio_2;

public class Acc {
    private String username;
    private String password;
    private String birth;
    private String email;

    public Acc(String username, String password, String birth, String email){
        this.username = username;
        this.password = password;
        this.birth = birth;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
