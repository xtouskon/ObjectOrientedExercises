public class Main {

    public static void main(String[] args) {
         Wall wall = new Wall(5,4);
         System.out.println("area= " + wall.getArea());

         wall.setHeight(-1.5);
         System.out.println("width= " + wall.getWidth());
         System.out.println("height= " + wall.getHeight());
         System.out.println("area= " + wall.getArea());



// STUDENT

//        for (int i = 1 ; i <= 5 ; i++){
//            LPAStudent s = new LPAStudent("S922300" + i,
//                    switch(i){
//                        case 1 -> "Mary";
//                        case 2 -> "Carol";
//                        case 3 -> "Lisa";
//                        case 4 -> "Tim";
//                        case 5 -> "Harry";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985",
//                    "Java Masterclass");
//            System.out.println(s);
//        }
//        Student pojoStudent = new Student("S922306" ,"Ann",
//                "05/11/1985",
//                "Java Masterclass");
//        LPAStudent recordStudent = new LPAStudent("S922307" ,"Bill",
//                "05/11/1985",
//                "Java Masterclass");
//        System.out.println(pojoStudent);
//        System.out.println(recordStudent);
//
//        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//       // recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");
//
//        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
//        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());









// CUSTOMER

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




// ACCOUNT

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
