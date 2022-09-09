package lesson7.remoteControl;

public class RemoteController implements Device, Volume{
    TVDevice tvDevice;

    void connectDevice(TVDevice tvDevicei) {
        this.tvDevice = tvDevicei;
        System.out.println("device is connected...");
    }

    void deviceDisconnected() {
        this.tvDevice = null;
        System.out.println("device is disconnected...");
    }

    void switchTheChannel(int chanel) {
        System.out.println("switchTheChannel to: " + chanel);
        this.tvDevice.setChannel(chanel);
    }

    boolean checkIFDeviceConnected() {
         return this.tvDevice != null;
    }

    @Override
    public void powerOn() {
        this.tvDevice.powerOn();
    }

    @Override
    public void powerOff() {
        this.tvDevice.powerOff();
    }

    @Override
    public void setChannel(int channel) {
        this.tvDevice.setChannel(channel);
    }

    @Override
    public void currentChannel() {
        this.tvDevice.currentChannel();
    }

    @Override
    public void upVolume() {
        this.tvDevice.upVolume();
        System.out.println("UP volume");
    }

    @Override
    public void downVolume() {
        this.tvDevice.downVolume();
        System.out.println("DOWN volume");
    }

    @Override
    public void mute() {
        this.tvDevice.mute();
        System.out.println("MUTE volume");
    }

    public void getVolume() {
        System.out.println("current volume is: " + this.tvDevice.getVolume());
    }
}
