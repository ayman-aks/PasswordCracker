public class User {
    public User(String password)
    {
        this.password=password;
    }
    private String login="test";
    private String password;
    public boolean checkPassword(String password)
    {
        if (password.equals(this.password) && this.login.equals("test"))
        {
            return true;
        }
        return false;

    }
}
