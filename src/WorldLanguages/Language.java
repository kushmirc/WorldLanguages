package WorldLanguages;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    public Language(String langName, int speakers, String region, String wOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionSpoken = region;
        this.wordOrder = wOrder;
    }
    public static void main(String[] args) {

    }
}
