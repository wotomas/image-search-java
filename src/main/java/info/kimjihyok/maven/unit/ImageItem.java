package info.kimjihyok.maven.unit;

/**
 * Created by jkimab on 2016. 3. 27..
 */
public class ImageItem {
    private String title;

    public ImageItem(String title, String link) {
        this.title = title;
        this.link = link;
    }

    @Override
    public String toString() {
        return "ImageItem{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                '}';
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String link;

}
