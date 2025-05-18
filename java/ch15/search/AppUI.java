package ch15.search;

public class AppUI {
    public static void main(String[] args) {
        var service = new RepositoryService();
        service.addCustomer("gksmfthsu000@gmail.com");
        System.out.println(service.findCustomer ("gksmfthsu000@gmail.com"));
    }

}
