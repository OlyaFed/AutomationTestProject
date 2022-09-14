package lesson7.remoteControl;

public class Main {
    public static void main(String[] args) {
        TVDevice tvDevice = new TV("custom TV device");
        RemoteController remoteController = new RemoteController();
        remoteController.connectDevice(tvDevice);
        System.out.println("is device connected?: " + remoteController.checkIFDeviceConnected());

        remoteController.powerOn();

        remoteController.switchTheChannel(1);
        remoteController.currentChannel();

        remoteController.mute();
        remoteController.getVolume();;

        remoteController.upVolume();
        remoteController.upVolume();
        remoteController.upVolume();
        remoteController.upVolume();
        remoteController.upVolume();
        remoteController.getVolume();

        remoteController.downVolume();
        remoteController.downVolume();
        remoteController.getVolume();

        remoteController.powerOff();

        remoteController.deviceDisconnected();
        System.out.println("is device connected?: " + remoteController.checkIFDeviceConnected());
    }
}
