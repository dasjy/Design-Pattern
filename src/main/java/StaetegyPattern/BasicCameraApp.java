package StaetegyPattern;

public class BasicCameraApp extends PhoneCameraApp
{

    public BasicCameraApp(Share share_text, Share share_email)
    {
        super(share_text,share_email, share_text);

    }
    public void display()
    {
        System.out.println("BasicCameraApp");


    }
}
