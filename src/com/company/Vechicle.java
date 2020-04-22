package com.company;

public class Vechicle {

    //tuck

    //variubles
    private int truck;
    private String plateNum;
    private String colour;
    private int doors;
    private int wheelsT;
    private int truckCurSpeed;
    private int truckSpeed;

    //bike

    //varibles
    private int bike;
    private String bikeColour;
    private int seat;
    private int wheelsB;
    private int bikeCurSpeed;
    private int bikeSpeed;

    Vechicle(){
    }

    //truck

    //sent it to the main constructor
    public int tuckNum(){
        return truck;
    }
    public String Plate(){
        return plateNum;
    }
    public String truckColour(){
        return colour;
    }
    public int DoorTuck(){
        return doors;
    }
    public int truckWheels(){
        return wheelsT;
    }
    public int Speed(){
        return truckCurSpeed;
    }
    public int MaxSpeed(){
        return truckSpeed;
    }

    //get form the main constructor
    public void setTuckNum(int NewValue){
        truck = NewValue;
    }
    public void setPlate(String NewValue){
        plateNum = NewValue;
    }
    public void setCarColour(String NewValue){
        colour = NewValue;
    }
    public void setDoorCar(int NewValue){
        doors = NewValue;
    }
    public void setWheelsT(int NewValue){
        wheelsT = NewValue;
    }
    public void setSpeed(int NewValue){
        truckCurSpeed = NewValue;
    }
    public void setMaxSpeed(int NewValue){
        truckSpeed = NewValue;
    }

    //bike

    //sent it to the main constructor
    public int bikeNum(){
        return bike;
    }
    public String colourBike(){
        return bikeColour;
    }
    public int bikeSeat(){
        return seat;
    }
    public int bikeWheels(){
        return wheelsB;
    }
    public int curSpeedBike(){
        return bikeCurSpeed;
    }
    public int bikeMaxSpeed(){
        return bikeSpeed;
    }

    //get form the main constructor
    public void setBikeNum(int NewValue){
        bike = NewValue;
    }
    public void setBikeColour(String NewValue){
        bikeColour = NewValue;
    }
    public void setSeat(int NewValue){
        seat = NewValue;
    }
    public void setWheelsB(int NewVale){
        wheelsB = NewVale;
    }
    public void setBikeCurSpeed(int NewValue){
        bikeCurSpeed = NewValue;
    }
    public void setBikeSpeed(int NewValue){
        bikeSpeed = NewValue;
    }

}
