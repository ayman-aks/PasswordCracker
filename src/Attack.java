public class Attack {
    public PasswordCracker getInstance(int choice)
    {
        switch (choice)
        {
            case 1: return new BruteForceAttack();
            default: return new DictionaryAttack();
        }
    }
}
