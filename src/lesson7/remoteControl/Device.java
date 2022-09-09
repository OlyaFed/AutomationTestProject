package lesson7.remoteControl;

public interface Device {
    void powerOn();

    void powerOff();

    void setChannel(int channel);

    void currentChannel();
}
