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

    @Override
    public String toString() {
        return "GoogleResult{" +
                "items=" + items +
                '}';
    }
}
