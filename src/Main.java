public class Main {

    public static void main(String[] args) {

        for (int i = 1 ; i <= 5 ; i++){
            Student s = new Student("S922300" + i,
                    switch(i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Lisa";
                        case 4 -> "Tim";
                        case 5 -> "Harry";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }






//
//        Customer customer = new Customer("Tim", 1000, "tim@email.com");
//        System.out.println(customer.getName());
//        System.out.println(customer.getCreditLimit());
//        System.out.println(customer.getEmailAddress());
//
//        Customer secondCustomer = new Customer();
//        System.out.println(secondCustomer.getName());
//        System.out.println(secondCustomer.getCreditLimit());
//        System.out.println(secondCustomer .getEmailAddress());
//
//        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
//        System.out.println(thirdCustomer.getName());
//        System.out.println(thirdCustomer.getCreditLimit());
//        System.out.println(thirdCustomer.getEmailAddress());





//        Account bobsAccount = new Account(12345,10000,"Bob Brown","myemail@bob.com", "10000000");
//
//        System.out.println(bobsAccount.getPhoneNumber());
//        System.out.println(bobsAccount.getAccountBalance());
//
//        bobsAccount.setAccountNumber(12345);
//        bobsAccount.setAccountBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("6847564312");
//        bobsAccount.withdrawFunds(100);
//        bobsAccount.depositFunds(250);
//        bobsAccount.withdrawFunds(50);
//        bobsAccount.withdrawFunds(200);
//
    }
}
