package com.maxml.gson.forJson;

import java.util.HashMap;

public class ForJsonClass {

    private HashMap<String, Car> results = new HashMap<>();

    private String title;
    private boolean isFirst;

    public ForJsonClass(HashMap<String, Car> results, String title, boolean isFirst) {
        this.results = results;
        this.title = title;
        this.isFirst = isFirst;
    }

    public HashMap<String, Car> getResults() {
        return results;
    }

    public void setResults(HashMap<String, Car> results) {
        this.results = results;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        this.isFirst = first;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForJsonClass that = (ForJsonClass) o;

        if (isFirst != that.isFirst) return false;
        if (results != null ? !results.equals(that.results) : that.results != null) return false;
        return title != null ? title.equals(that.title) : that.title == null;
    }

    @Override
    public int hashCode() {
        int result = results != null ? results.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (isFirst ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ForJsonClass{" +
                "results=" + results +
                ", title='" + title + '\'' +
                ", isFirst=" + isFirst +
                '}';
    }
}
