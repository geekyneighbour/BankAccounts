package com.example.demo;
import java.util.List;
import java.util.ArrayList;

public class Auth {

    private String login;
    private String password;


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


    //выше написать вычлененеие данных из джсон логин и пароль, далее ниже написать проверку соответствия пароля и если все ок, то возвращение данных
    public Object getData() {
        Error error = new Error();
        error.setData("error");
        error.setSuccess(false);
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        account1.setAccountNumber("8800555353542069");
        account1.setFullName("Индивидуальный Предприниматель Иванов Иван Иванович.");
        account1.setStatus("1");
        account1.setContractNum("124567");
        account1.setAccountTypeCode("6");
        account1.setPackageAbility("false");
        account1.setAllowReady("None");

        account2.setAccountNumber("9922555353543057");
        account2.setFullName("Сафонова Екатерина Павловна.");
        account2.setStatus("1");
        account2.setContractNum("334567");
        account2.setAccountTypeCode("4");
        account2.setPackageAbility("false");
        account2.setAllowReady("None");

        account3.setAccountNumber("7352566353543011");
        account3.setFullName("Петров Василий Александрович.");
        account3.setStatus("1");
        account3.setContractNum("654346");
        account3.setAccountTypeCode("4");
        account3.setPackageAbility("false");
        account3.setAllowReady("None");

        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();

        List<Account> accountList1 = new ArrayList<>();
        accountList1.add(account1);

        List<Account> accountList2 = new ArrayList<>();
        accountList2.add(account2);

        List<Account> accountList3 = new ArrayList<>();
        accountList3.add(account3);

        data1.setAccountList(accountList1);
        data2.setAccountList(accountList2);
        data3.setAccountList(accountList3);
        data1.setSessionDataRedisHashId("1e78e1a8-9402-45fb-a6f2-36608cf3e840");
        data2.setSessionDataRedisHashId("2e78e1a8-9402-45fb-a6f2-36608cf3e841");
        data3.setSessionDataRedisHashId("3e78e1a8-9402-45fb-a6f2-36608cf3e842");

        Info info1 = new Info();
        Info info2 = new Info();
        Info info3 = new Info();
        info1.setData(data1);
        info2.setData(data2);
        info3.setData(data3);
        info1.setSuccess(true);
        info2.setSuccess(true);
        info3.setSuccess(true);

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setLogin("ivanov");
        user1.setPassword("12345");
        user1.setInfo(info1);
        user2.setLogin("safonova");
        user2.setPassword("666");
        user2.setInfo(info2);
        user3.setLogin("petrov");
        user3.setPassword("privet");
        user3.setInfo(info3);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);


        for (User element : users) {
            if (element.getLogin().equals(login)) {
                if (element.getPassword().equals(password)) {
                    return element.getInfo();
                }
                return error;
            }
        }
        return error;
    }
}
