package by.academy.lesson9.classwork;

public class Card extends Account {

    public Card(int id, double money) {
        super(id, money);
    }

    public void spendMoney (Account account1, Account account2, int sum){
        account1.setMoney(account1.getMoney() + sum);
        account2.setMoney(account2.getMoney() - sum);
    }
}
