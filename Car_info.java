public class Car_info {
    public static void main(String [] args){
        String Engine_Type = "mHAWK 4 Cylinder";
        String Displacement = "2184 cc";
        String MaxPower = "130bhp@3750rpm";
        String MaxTorque = "300Nm@1600-2800rpm";
        byte TotalCylinders = 4;
        byte ValvesPerCylinder = 4;
        String Fuel_Supply_System = "CRDI";
        String Turbo_Charge = "Yes";
        String Transmission_Type = "Manual";
        String GearBox = "6-Speed";
        String Drive_Type = "RWD";

        System.out.println("Mahindra Scorpio S 11 Specifications :");
        System.out.println("Engine & Transmission Details");
        System.out.println("EngineType: " + Engine_Type);
        System.out.println("Displacement :" + Displacement);
        System.out.println("MaxPower :" + MaxPower);
        System.out.println("MaxTorque :" + MaxTorque);
        System.out.println("NO.of.Cylinders :" + TotalCylinders);
        System.out.println("ValvesPerCylinders :" + ValvesPerCylinder);
        System.out.println("FuelSupplySystem :" + Fuel_Supply_System);
        System.out.println("TurboCharge :" + Turbo_Charge);
        System.out.println("TransmissionType :" + Transmission_Type);
        System.out.println("Gearbox :" + GearBox);
        System.out.println("DriveType :" + Drive_Type);
    }
}
