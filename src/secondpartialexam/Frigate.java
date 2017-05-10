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
public class Frigate implements ISeaVessel{
    private int displacement;
    private String name;
    private int passengers;
    private double speed;
    
    public Frigate(String name) {
        this.name = name;
        this.displacement = 0;
        this.passengers = 0;
        this.speed = 0;
    }

    public void fireGun(){
        System.out.println("Fired."); //so savage tho
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
