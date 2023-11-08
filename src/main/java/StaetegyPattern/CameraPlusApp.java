package StaetegyPattern;

public class CameraPlusApp extends PhoneCameraApp
{
      public CameraPlusApp(Share share_drive, Share share_email, Share share_text)
    {
        super(share_drive, share_email,share_text);
    }

    public void display()
    {
        System.out.println("CameraPlusApp");

    }
}
