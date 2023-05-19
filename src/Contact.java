public class Contact {
    private String name;
    private String company;
    private String email;
    private int phone;

    public Contact(String name, String company, String email, int phone) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }
}
