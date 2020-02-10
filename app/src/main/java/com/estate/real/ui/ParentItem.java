package com.estate.real.ui;

import java.util.List;

public class ParentItem {
    private String categoryTitle;
    private List<Item> items;

    public ParentItem(String categoryTitle, List<Item> items) {
        this.categoryTitle = categoryTitle;
        this.items = items;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
