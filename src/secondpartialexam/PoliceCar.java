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
public class PoliceCar implements IEmergency, ILandVehicle{
    private int numWheels;
    private String name;
    private int passengers;
    private double speed;
    
    public PoliceCar(String name) {
        this.name = name;
        this.numWheels = 0;
        this.passengers = 0;
        this.speed = 0.0;
        
    }
    
    public void annoy(){
        System.out.println("PoliceCar is getting annoying.");
    }
    
    @Override
    public void soundSiren() {
         System.out.println("Sounding.");
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
    
}
