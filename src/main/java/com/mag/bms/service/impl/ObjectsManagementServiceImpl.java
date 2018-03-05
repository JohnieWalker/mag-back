package com.mag.bms.service.impl;

import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.mag.bms.model.BucketObjectRepresentation;
import com.mag.bms.model.BucketObjectsWrapper;
import com.mag.bms.model.BucketVersionObjectRepresentation;
import com.mag.bms.service.ObjectsManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ObjectsManagementServiceImpl implements ObjectsManagementService {

    private static final Logger log = LoggerFactory.getLogger(ObjectsManagementService.class);

    @Override
    public BucketObjectsWrapper<BucketObjectRepresentation> getAllObjectsFromBucketWithPrefix(String bucketName, String prefix, boolean nested, String token) {
        return buildStubbedObjects(bucketName);
    }

    @Override
    public List<BucketVersionObjectRepresentation> getAllVersionObjectsFromBucketWithPrefix(String bucketName, String prefix, boolean nested) {
        return buildStubbedVersions(bucketName);
    }

    private BucketObjectsWrapper<BucketObjectRepresentation> buildStubbedObjects(String bucketName) {
        return new BucketObjectsWrapper<>(buildStubbedBucketObjects(bucketName), "xaTsh35S");
    }

    private List<BucketVersionObjectRepresentation> buildStubbedVersions(String bucketName) {
        List<BucketVersionObjectRepresentation> bucketVersionObjectRepresentations = new ArrayList<>();

        bucketVersionObjectRepresentations.add(
                buildStubbedRepresentation(bucketName,
                        "Valantis",
                        "https://soundcloud.com/vacantmusiclondon",
                        "aiwcm4kas32du26wag542argragr"));

        bucketVersionObjectRepresentations.add(
                buildStubbedRepresentation(bucketName,
                        "Megane",
                        "https://soundcloud.com/",
                        "asdga4ajg49ajghjgnghdr"));

        return bucketVersionObjectRepresentations;
    }

    private List<BucketObjectRepresentation> buildStubbedBucketObjects(String bucketName) {
        List<BucketObjectRepresentation> bucketObjects = new ArrayList<>();

        bucketObjects.add(buildStubbedBucketObject(bucketName, "SuperGarden", "https://soundcloud.com/vacantmusiclondon/reposts"));
        bucketObjects.add(buildStubbedBucketObject(bucketName, "VolorFlex", "https://soundcloud.com/search?q=vacant"));
        bucketObjects.add(buildStubbedBucketObject(bucketName, "Mackie", "https://soundcloud.com"));
        bucketObjects.add(buildStubbedBucketObject(bucketName, "Flamie", "https://soundcloud.com/wavevision"));

        return bucketObjects;
    }


    private BucketVersionObjectRepresentation buildStubbedRepresentation(String bucketName, String key, String url, String versionId) {
        BucketVersionObjectRepresentation bucketVersionObjectRepresentation = new BucketVersionObjectRepresentation();

        bucketVersionObjectRepresentation.setDownloadLink(buildStubbedUrl(url));
        bucketVersionObjectRepresentation.setS3ObjectSummary(buildS3SummaryVersions(bucketName, key, versionId));

        return bucketVersionObjectRepresentation;
    }


    private BucketObjectRepresentation buildStubbedBucketObject(String bucketName, String key, String url) {
        return new BucketObjectRepresentation(buildS3SummaryObject(bucketName, key), buildStubbedUrl(url));
    }

    private S3ObjectSummary buildS3SummaryObject(String bucketName, String key) {
        S3ObjectSummary s3ObjectSummary = new S3ObjectSummary();

        s3ObjectSummary.setBucketName(bucketName);
        s3ObjectSummary.setSize(100);
        s3ObjectSummary.setKey(key);
        s3ObjectSummary.setLastModified(new Date());

        return s3ObjectSummary;
    }

    private S3VersionSummary buildS3SummaryVersions(String bucketName, String key, String versionId) {
        S3VersionSummary s3VersionSummary = new S3VersionSummary();

        s3VersionSummary.setBucketName(bucketName);
        s3VersionSummary.setKey(key);
        s3VersionSummary.setSize(50);
        s3VersionSummary.setVersionId(versionId);

        return s3VersionSummary;
    }

    private URL buildStubbedUrl(String url) {
        URL resultUrl = null;

        try {
            resultUrl = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return resultUrl;
    }

}
