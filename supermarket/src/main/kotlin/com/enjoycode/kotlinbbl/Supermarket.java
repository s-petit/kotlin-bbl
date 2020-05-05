package com.enjoycode.kotlinbbl;

import com.enjoycode.kotlinbbl.documentation.Demonstration;
import com.enjoycode.location.LocationDetails;

import java.util.List;

public class Supermarket {

    @Demonstration(why = "named param + default value")
    private final List<Department> departments;
    private final LocationDetails locationDetails;
    private final String phoneNumber;
    @Demonstration(why = "nullable field + default value")
    private final GasStation gasStation;

    public Supermarket(List<Department> departments, LocationDetails locationDetails, String phoneNumber, GasStation gasStation) {
        this.departments = departments;
        this.locationDetails = locationDetails;
        this.phoneNumber = phoneNumber;
        this.gasStation = gasStation;
    }

    public Supermarket(List<Department> departments, LocationDetails locationDetails, String phoneNumber) {
        this.departments = departments;
        this.locationDetails = locationDetails;
        this.phoneNumber = phoneNumber;
        this.gasStation = null;
    }

    @Demonstration(why = "template string, extension methods")
    public String contact() {
        return "Tel: " + phoneNumber + " - Address:\n" +
                address(locationDetails);
    }

    @Demonstration(why = "multiline string + getters")
    private String address(LocationDetails locationDetails) {
        return locationDetails.getNumber() + ", " +
                locationDetails.getStreet() + "\n" +
                locationDetails.getZipCode() + " " +
                locationDetails.getCity() + "\n";
    }

    @Demonstration(why = "collection and lambdas")
    public Integer supermarketSales() {
        return departments
                .stream()
                .map(Department::getSales)
                .reduce(0, Integer::sum);
    }

    @Demonstration(why = "null safe operations")
    public Double gasStationSales() {
        if (gasStation != null && gasStation.getGasPrice() != null) {
            return gasStation.getGasPrice().totalSales();
        }
        return 0.0;
    }

    @Demonstration(why = "collection and lambdas")
    public Integer allStock() {
        return departments.stream()
                .flatMap(department -> department.getStocks().stream())
                .map(Department.Stock::getQuantity)
                .reduce(0, Integer::sum);
    }
}
