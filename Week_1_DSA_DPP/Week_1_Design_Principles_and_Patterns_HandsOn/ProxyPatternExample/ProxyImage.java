package Week_1_Design_Principles_and_Patterns_HandsOn.ProxyPatternExample;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);  // Lazy initialization
        }
        realImage.display();  // Forward the call
    }
}