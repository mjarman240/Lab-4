public class Television {
    // Variables
    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    /**
     * Default constructor
     */
    public Television () {
        MANUFACTURER = "";
        SCREEN_SIZE = 0;
        powerOn = false;
        channel = 0;
        volume = 0;
    }

    /**
     * Constructor with initial values
     * @param brand set TV brand
     * @param size set TV size
     */
    public Television (String brand, int size) {
        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;
        powerOn = false;
        channel = 2;
        volume = 20;
    }

    /**
     * This sets channel
     * @param station desired tv station
     */
    public void setChannel(int station) {
        this.channel = station;
    }

    /**
     * Sets power to either on or off depending on current state
     */
    public void power() {
        this.powerOn = !this.powerOn;
    }

    /**
     * Increase volume by 1 when called
     */
    public void increaseVolume() {
        this.volume += 1;
    }

    /**
     * Decrease volume by 1 when called
     */
    public void decreaseVolume() {
        this.volume -= 1;
    }

    /**
     * Get current channel
     * @return returns current channel
     */
    public int getChannel() {
        return this.channel;
    }

    /**
     * Get current volume
     * @return returns current volume
     */
    public int getVolume() {
        return this.volume;
    }

    /**
     * Get TV manufacturer
     * @return returns current tv manufacturer
     */
    public String getManufacturer() {
        return this.MANUFACTURER;
    }

    /**
     * Get screen size
     * @return returns current screen size
     */
    public int getScreenSize() {
        return this.SCREEN_SIZE;
    }
}
