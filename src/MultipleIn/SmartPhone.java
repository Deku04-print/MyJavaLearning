package MultipleIn;

public class SmartPhone implements Camera,Phone,MusicPlayer{

    @Override
    public void takePhoto() {
        System.out.println("taking pics");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("music stopped");
    }

    @Override
    public void makePhonecall(String number) {
        System.out.println("Calling " +number);
    }

    @Override
    public void endCall() {
        System.out.println("Ending call");
    }
}
