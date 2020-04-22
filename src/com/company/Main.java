package com.company;

public class Main {


    //assing a class
    private static  Vechicle truck;
    private static  Vechicle bike;


    public static void main(String[] args) {

        //truck

        //variubles
        int ranDoorst = (int)(Math.random()*7+1);
        int ranWheelst = (int)(Math.random()*17+1);
        int truckSpeed = (int)(Math.random()*119+1);

        //calling the class and setting it to be called truck
        truck = new Vechicle();

        //giveing each function variubles
        truck.setTuckNum(1);
        truck.setPlate("3H1R5V");
        truck.setCarColour("gray");
        truck.setDoorCar(ranDoorst);
        truck.setWheelsT(ranWheelst);
        truck.setSpeed(0);
        truck.setMaxSpeed(truckSpeed);

        //displaying
        System.out.println("Truck");
        System.out.println("Truck number: " + truck.tuckNum());
        System.out.println("Plate number: " + truck.Plate());
        System.out.println("Truck colour: " + truck.truckColour());
        System.out.println("Number of doors: "+ truck.DoorTuck());
        System.out.println("Number of wheels: " + truck.truckWheels() );
        System.out.println("Speed: " + truck.Speed());
        System.out.println("Top speed: " + truck.MaxSpeed() + "\n");

        //bike

        //variubles
        int ranSeat = (int)(Math.random()*1+1);
        int ranWheelsB = (int)(Math.random()*2+1);
        int bikeSpeedTop = (int)(Math.random()*29+1);

        //calling the class and setting it to be called bike
        bike = new Vechicle();

        //giveing each function variubles
        bike.setBikeNum(2);
        bike.setBikeColour("Red");
        bike.setSeat(ranSeat);
        bike.setWheelsB(ranWheelsB);
        bike.setBikeCurSpeed(0);
        bike.setBikeSpeed(bikeSpeedTop);

        //displaying
        System.out.println("Bike");
        System.out.println("Bike number: " + bike.bikeNum());
        System.out.println("Bike Colour: " + bike.colourBike() );
        System.out.println("Seats: " + bike.bikeSeat());
        System.out.println("Wheels: " + bike.bikeWheels());
        System.out.println("Speed: " + bike.curSpeedBike());
        System.out.println("Top speed" + bike.bikeMaxSpeed());
    }
}
