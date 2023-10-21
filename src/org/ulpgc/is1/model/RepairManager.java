package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class RepairManager {

    //Constructor
    private List<Mechanic> mechanics;
    private List<Vehicle> vehicles;
    private List<SparePart> spareParts;
    public RepairManager() {
        this.mechanics = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.spareParts = new ArrayList<>();
    }


    //Getters & Setters
    //TODO Methods Repair and getMechanic/Vehicle
    public List<Mechanic> getMechanics() {
        return mechanics;
    }
    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public List<SparePart> getSpareParts() {
        return spareParts;
    }
    public void setSpareParts(List<SparePart> spareParts) {
        this.spareParts = spareParts;
    }


    //Methods
    public void addMechanic(Mechanic newMechanic){
        mechanics.add(newMechanic);
    }
    public void addVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);
    }

}
