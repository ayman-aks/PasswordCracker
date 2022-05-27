public class BruteForceAttack implements PasswordCracker{
    private String password="    ";
    StringBuilder sb = new StringBuilder(this.password);
    @Override
    public void hackPassword(User user) throws InterruptedException {
        for (int i=96;i<=122;i++)
        {
            if (i!=96) {
                sb.setCharAt(0, (char) i);
                this.password = sb.toString();
            }
            for (int j=96;j<=122;j++)
            {
                if (j!=96) {
                    sb.setCharAt(1, (char) j);
                    this.password = sb.toString();
                }
                for (int k=96;k<=122;k++)
                {
                    if (k!=96) {
                        sb.setCharAt(2, (char) k);
                        this.password = sb.toString();
                    }
                    for (int l=97;l<=122;l++)
                    {
                            sb.setCharAt(3, (char) l);
                            this.password = sb.toString();
                            System.out.println(this.password.replaceAll("\\s+",""));
                            if(user.checkPassword(this.password.replaceAll("\\s+","")))
                            {
                                System.out.println("Mot de passe retrouvé");
                                return ;
                            }
                    }
                }
            }
        }
        System.out.println("Mot de passe non retrouvé");
        return ;
    }
}
