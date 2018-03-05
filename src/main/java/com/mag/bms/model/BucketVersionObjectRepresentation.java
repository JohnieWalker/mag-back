package com.mag.bms.model;

import com.amazonaws.services.s3.model.S3VersionSummary;

import java.net.URL;

public class BucketVersionObjectRepresentation {

    private S3VersionSummary s3ObjectSummary;

    private URL downloadLink;

    public BucketVersionObjectRepresentation() {

    }

    public BucketVersionObjectRepresentation(S3VersionSummary s3ObjectSummary, URL downloadLink) {
        this.s3ObjectSummary = s3ObjectSummary;
        this.downloadLink = downloadLink;
    }

    public void setS3ObjectSummary(S3VersionSummary s3ObjectSummary) {
        this.s3ObjectSummary = s3ObjectSummary;
    }

    public void setDownloadLink(URL downloadLink) {
        this.downloadLink = downloadLink;
    }

    public S3VersionSummary getS3ObjectSummary() {
        return s3ObjectSummary;
    }

    public URL getDownloadLink() {
        return downloadLink;
    }

    @Override
    public String toString() {
        return "BucketVersionObjectRepresentation{" +
                "s3ObjectSummary=" + s3ObjectSummary +
                ", downloadLink=" + downloadLink +
                '}';
    }
}
