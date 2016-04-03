package info.kimjihyok.maven.unit;

import java.util.ArrayList;

/**
 * Created by jkimab on 2016. 3. 27..
 */
public class GoogleResult {
    private ArrayList<ImageItem> items;

    public GoogleResult(ArrayList<ImageItem> mList) {
        this.items = mList;
    }

    public ArrayList<ImageItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<ImageItem> items) {
        this.items = items;
    }

    public class ImageItem {
        private String title;
        private String link;

        public ImageItem(String title, String link) {
            this.title = title;
            this.link = link;
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
    }

}
