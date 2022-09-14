package lesson7.remoteControl;

public abstract class TVDevice implements Volume, Device{
    String modelName;
    boolean isOn;

    public abstract int getVolume();

    public boolean isOn() {
        return this.isOn;
    }
}
