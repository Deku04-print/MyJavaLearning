package MultipleIn;

public class Test {
    public static void main(String[] args){

        SmartPhone smartPhone=new SmartPhone();
        smartPhone.makePhonecall("9911223399");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();

    }
}
