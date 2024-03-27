package example;
//=================================-Imports-==================================
import java.util.HashSet;

public class Tenants {
    //============================-Variables-=================================
    private HashSet<String> tenants;
    //===========================-Constructors-===============================
    public Tenants() {
        this.tenants = new HashSet<>();
    }
    public Tenants(HashSet<String> tenants) {
        this.tenants = tenants;
    }
    //=============================-Methods-==================================

    //-----------------------------Add-Tenant---------------------------------
    public void addTenant(String tenant) {
        this.tenants.add(tenant);
    }
    //---------------------------Remove-Tenant--------------------------------
    public void removeTenant(String tenant) {
        this.tenants.remove(tenant);
    }
    //---------------------------Print-Tenants--------------------------------
    public void printTenants() {
        final String MAJOR_DIVIDER = "=".repeat(21);
        System.out.println(MAJOR_DIVIDER);
        final String DIVIDER = "-".repeat(21);
        this.tenants.forEach(tenant -> {
            System.out.printf("%s%n%s%n", DIVIDER, tenant);
        });
        System.out.println(MAJOR_DIVIDER + "\n");
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        Tenants tenants = new Tenants();
        tenants.addTenant("Alice");
        tenants.addTenant("Bob");
        tenants.addTenant("Charlie");
        tenants.addTenant("Alice");
        tenants.printTenants();
    }
}
