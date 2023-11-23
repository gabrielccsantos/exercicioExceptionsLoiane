package entities;

public class Contact {
    private static int contador;
    private Integer id;
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        contador++;
        id = contador;
        this.name = name;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return "Id: " + getId() +
                "\nName: " + getName() +
                "\nPhone: " + getPhone();
    }
}
