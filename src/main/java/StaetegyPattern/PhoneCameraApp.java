package StaetegyPattern;

public abstract class PhoneCameraApp
{
    Share share;
    public PhoneCameraApp(Share share, Share share_email, Share share_text)
    {
        this.share=share;
    }
    public void capturePhoto()
    {
        System.out.println("Capture Pic");
    }
    public void editPhoto()
    {
        System.out.println("Edit Pic");
    }
    public void savePhoto()
    {
        System.out.println("Save Pic");
    }
    public void setShare(Share share)
    {
        this.share=share;
    }
    public abstract void display();
}
