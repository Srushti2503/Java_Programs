package Inheritance;
class Device{
    private String deviceName;

    //getter.....
    public String getDeviceName(){
        return deviceName;
    }

    //setter.....
    public void setDeviceName(String deviceName){
        this.deviceName= deviceName;
    }
}


class Bulb extends Device{
    public static void main(String[] args) {
        Device device= new Bulb();
        System.out.println("Device name is Bulb");
        device.setDeviceName("Bulb");


        System.out.println(device.getDeviceName());
    }


}

