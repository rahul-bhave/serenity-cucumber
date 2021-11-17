package altoromutual.model;

public enum altoromutualuser {
    ADMIN("admin","admin");

    public final String username;
    public final String password;

    altoromutualuser(String Username, String Password) {
        this.username = Username;
        this.password = Password;
    }
}
