public class TV {

    String name;
    int volume;
    int serialNumber;
    int chanel;
    boolean isOn;

    public TV() {
    }

    public TV(String newName) {
        name = newName;
    }

    public TV(String newName, int newSerialNumber) {
        name = newName;
        serialNumber = newSerialNumber;
    }

    public void turnOn(){
        if(!isOn){
            isOn = true;
        }
    }
    public void turnOff(){
        if(isOn){
            isOn = true;
        }
    }
    public void setChanel(int chanel){
        if(isOn) {
            chanel = 0;
        }
    }
    public void increaseChanel(){
        if(isOn){
            chanel++;
        }
    }
    public void decreaseChanel(){
        if(isOn){
            chanel--;
        }
    }
    public void setVolume(int volume){
        if(isOn) {
            volume = 0;
        }
    }
    public void increaseVolume(){
        if(isOn){
            volume++;
        }
    }
    public void decreaseVolume(){
        if(isOn){
            volume--;
        }
    }
}