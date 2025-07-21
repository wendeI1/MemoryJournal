import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Memory {

    private String name;
    private String description;
    private Emotion relatedEmotion;
    private final LocalDate date;

    public enum Emotion{
        HAPPINESS, SADNESS, NOSTALGIA, ANGER
    }

    DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public Memory(String name, String description, String strEmotion, int yyyy, int mm, int dd){
        this.name = name.toUpperCase();
        this.description = description.toUpperCase();
        this.relatedEmotion = Emotion.valueOf(strEmotion.toUpperCase());
        this.date = LocalDate.of(yyyy, mm, dd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Emotion getRelatedEmotion() {
        return relatedEmotion;
    }

    public void setRelatedEmotion(Emotion relatedEmotion) {
        this.relatedEmotion = relatedEmotion;
    }

    protected void showMemory(){
        System.out.println("--- " + this.name + " ---");
        System.out.println("Description: " + this.description);
        System.out.println("Related emotion: " + this.relatedEmotion);
        System.out.println("Date: " + this.date.format(formattedDate));
    }
}
