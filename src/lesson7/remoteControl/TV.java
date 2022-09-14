package lesson7.remoteControl;

public class TV extends TVDevice {
    int channel = 0;
    int volume = 0;

    public TV(String name) {
        this.modelName = name;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("power ON");
    }

    @Override
    public void powerOff() {
        this.isOn = false;
        System.out.println("power OFF");
    }



    @Override
    public void setChannel(int channelI) {
        this.channel = channelI;
    }

    @Override
    public void currentChannel() {
        System.out.println("current channel is: " + this.channel);
    }

    @Override
    public void upVolume() {
        this.volume++;
    }

    @Override
    public void downVolume() {
        this.volume--;
    }

    @Override
    public void mute() {
        this.volume = 0;
    }

    public int getVolume() {
        return volume;
    }
}
