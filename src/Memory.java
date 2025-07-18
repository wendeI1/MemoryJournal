import java.time.LocalDate;

public class Memory {

    private String name;
    private String description;
    private Emotion relatedEmotion;

    public enum Emotion{
        HAPPINESS, SADNESS, NOSTALGIA, ANGER
    }

    public Memory(String name, String description, String strEmotion, int yyyy, int mm, int dd){
        this.name = name;
        this.description = description;
        this.relatedEmotion = Emotion.valueOf(strEmotion.toUpperCase());
        LocalDate date = LocalDate.of(yyyy, mm, dd);
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
        System.out.println("teste");
    }
}
