package domain.model;

public class Tag implements Model{
    private int tagId;
    private String tagName;
    private String description;

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tag(int tagId, String tagName, String description) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.description = description;
    }
}
