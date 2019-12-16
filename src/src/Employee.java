
public class Employee {

    protected String title;
    protected String sex;
    protected String name;
    protected int age;

    public void CheckStock() {
        System.out.println("checkstock");
    }

    public void SellProduct() {
        System.out.println("sellproduct");
    }

    public void PurchaseProducts() {
        System.out.println("purchaseproducts");
    }

    public void ShowData() {
        System.out.println("Title : " + title);
        System.out.println("Sex : " + sex);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        Employee a1 = new Employee();
        a1.title = "Mr.";
        a1.name = "Suesath Khyanying";
        a1.sex = "male";
        a1.age = 27;
        a1.ShowData();
        a1.CheckStock();

        Employee a2 = new Employee();
        a2.title = "Miss.";
        a2.name = "Sodsai Ngandee";
        a2.sex = "Femaie";
        a2.age = 25;
        a2.ShowData();
        a2.SellProduct();

        Employee a3 = new Employee();
        a3.title = "Miss.";
        a3.name = "Meena Sueting";
        a3.sex = "Female";
        a3.age = 37;
        a3.ShowData();
        a3.PurchaseProducts();
    }
}
