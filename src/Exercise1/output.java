package Exercise1;

    public class output {

        public static void main(String[] args) {

            customer customer1;
            customer1 = new customer();

            ticket ticket1;
            ticket1 = new ticket();

            customer1.get_customer_info();
            ticket1.get_ticket_info();

            customer1.print_customer_info();
            ticket1.print_ticket_info();
        }
}


