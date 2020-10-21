package Chapter19;

import java.util.LinkedList;

// Простой пример обработки списка почтовых адресов
class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    // переопределенный метод класса Object
    public String toString() {
        return this.name + "\n" + this.street + "\n" +
               this.city + " " + this.state + " " + this.code;
    }
}

public class MailToLinkedList {
    public static void main(String[] args) {
        LinkedList<Address> mailList = new LinkedList<Address>();
        // вводим элементы в связный список
        mailList.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        mailList.add(new Address("Ralph Baker", "1142 Maple Lane","Mahomet", "IL", "61853"));
        mailList.add(new Address("Tom Carlton", "867 Elm St","Champaign", "IL", "61820"));

        // вывести список почтовых адресов
        for (Address element : mailList) {
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
/*
-------------------
J.W. West
11 Oak Ave
Urbana IL 61801

Ralph Baker
1142 Maple Lane
Mahomet IL 61853

Tom Carlton
867 Elm St
Champaign IL 61820

 */