import StaetegyPattern.*;

public class StartegyPatternHT
{
    public static void main(String []args)
    {
        Share share_email=new ShareViaEmail();
        Share share_text=new ShareViaText();
        Share share_drive=new ShareViaDrive();

        PhoneCameraApp basicCameraApp=new BasicCameraApp(share_email,share_email);
        basicCameraApp.display();
        basicCameraApp.capturePhoto();
        basicCameraApp.savePhoto();
        basicCameraApp.editPhoto();

        PhoneCameraApp cameraPlus=new CameraPlusApp(share_drive,share_email,share_text);
        cameraPlus.display();
        cameraPlus.capturePhoto();
        cameraPlus.savePhoto();
        cameraPlus.editPhoto();






    }


}
