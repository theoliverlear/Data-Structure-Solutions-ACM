package example;

import java.util.HashMap;

public class BuildingTenants {
    //============================-Variables-=================================
    private HashMap<String, Tenants> buildsAndTenants;
    //===========================-Constructors-===============================
    public BuildingTenants() {
        this.buildsAndTenants = new HashMap<>();
    }
    public BuildingTenants(HashMap<String, Tenants> buildsAndTenants) {
        this.buildsAndTenants = buildsAndTenants;
    }
    //=============================-Methods-==================================

    //-------------------------Add-Building-Tenants---------------------------
    public void addBuildingTenants(String building, Tenants tenants) {
        this.buildsAndTenants.put(building, tenants);
    }
    //------------------------Remove-Building-Tenants-------------------------
    public void removeBuildingTenants(String building) {
        this.buildsAndTenants.remove(building);
    }
    //------------------------Update-Building-Tenants-------------------------
    public void updateBuildingTenants(String building, Tenants tenants) {
        this.buildsAndTenants.put(building, tenants);
    }
    //-------------------------Print-Building-Tenants-------------------------
    public void printBuildingTenants() {
        this.buildsAndTenants.forEach((building, tenants) -> {
            String buildingColored = new ColorString(ColorString.BLUE, building).getColoredString();
            System.out.printf("%s%n", buildingColored);
            tenants.printTenants();
        });
        System.out.println();
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        BuildingTenants riverCityIndustries = new BuildingTenants();
        Tenants smallBuildingTenants = new Tenants();
        smallBuildingTenants.addTenant("Alice");
        smallBuildingTenants.addTenant("Bob");
        smallBuildingTenants.addTenant("Mary");
        smallBuildingTenants.addTenant("Simon");
        riverCityIndustries.addBuildingTenants("Woodgrove Apartments",
                                               smallBuildingTenants);
        Tenants duplexBuildingTenants = new Tenants();
        duplexBuildingTenants.addTenant("Charlie");
        duplexBuildingTenants.addTenant("David");
        riverCityIndustries.addBuildingTenants("River City Unit 5",
                                               duplexBuildingTenants);
        riverCityIndustries.printBuildingTenants();
    }
}
