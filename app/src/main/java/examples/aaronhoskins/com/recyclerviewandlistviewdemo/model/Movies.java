package examples.aaronhoskins.com.recyclerviewandlistviewdemo.model;

public class Movies {
    private String title;
    private String parentRating;
    private String description;
    private String releaseYear;
    private String studio;

    public Movies() {
    }

    public Movies(String title, String parentRating, String description, String releaseYear, String studio) {
        this.title = title;
        this.parentRating = parentRating;
        this.description = description;
        this.releaseYear = releaseYear;
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentRating() {
        return parentRating;
    }

    public void setParentRating(String parentRating) {
        this.parentRating = parentRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
