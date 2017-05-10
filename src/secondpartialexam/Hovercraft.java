/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpartialexam;

/**
 *
 * @author Alumno
 */
public class Hovercraft implements ILandVehicle, ISeaVessel{
    private int numWheels;
    private String name;
    private int passengers;
    private double speed;
    private int displacement;

    public Hovercraft(String name) {
        this.name = name;
        this.numWheels = 0;
        this.passengers = 0;
        this.speed = 0.0;
        this.displacement = 0;
    }
    
    public void enterLand(){
        System.out.println("Entering land.");
    }

    public void enterSea(){
        System.out.println("Entering sea.");
    }
    
    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int wheels) {
        this.numWheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving.");
    }

    @Override
    public String getName() {
         return this.name;
    }

    @Override
    public int getMaxPassengers() {
        return this.passengers;
    }

    @Override
    public double getMaxSpeed() {
        return this.speed;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setMaxPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void setMaxSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public int getDisplacement() {
        return this.displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Launching.");
    }

    

}
