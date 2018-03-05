package com.mag.bms.model;

import java.util.List;

public class BucketObjectsWrapper<T> {

    private final String nextPageToken;
    private final List<T> bucketObjects;

    public BucketObjectsWrapper(List<T> bucketObjects, String nextPageToken) {
        this.bucketObjects = bucketObjects;
        this.nextPageToken = nextPageToken;

    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public List<T> getBucketObjects() {
        return bucketObjects;
    }

}
