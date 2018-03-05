package com.mag.bms.model;

import com.amazonaws.services.s3.model.S3ObjectSummary;

import java.net.URL;

public class BucketObjectRepresentation {

    private S3ObjectSummary s3ObjectSummary;

    private URL downloadLink;

    public BucketObjectRepresentation() {

    }

    public BucketObjectRepresentation(S3ObjectSummary s3ObjectSummary, URL downloadLink) {
        this.s3ObjectSummary = s3ObjectSummary;
        this.downloadLink = downloadLink;
    }

    public S3ObjectSummary getS3ObjectSummary() {
        return s3ObjectSummary;
    }

    public URL getDownloadLink() {
        return downloadLink;
    }

    @Override
    public String toString() {
        return "BucketObjectRepresentation{" +
                "s3ObjectSummary=" + s3ObjectSummary +
                ", downloadLink=" + downloadLink +
                '}';
    }
}
