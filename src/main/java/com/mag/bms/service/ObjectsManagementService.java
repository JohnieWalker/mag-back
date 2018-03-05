package com.mag.bms.service;

import com.mag.bms.model.BucketObjectRepresentation;
import com.mag.bms.model.BucketObjectsWrapper;
import com.mag.bms.model.BucketVersionObjectRepresentation;

import java.util.List;

public interface ObjectsManagementService {

    BucketObjectsWrapper<BucketObjectRepresentation> getAllObjectsFromBucketWithPrefix(String bucketName, String prefix,
                                                                                       boolean nested, String token);


    List<BucketVersionObjectRepresentation> getAllVersionObjectsFromBucketWithPrefix(String bucketName, String prefix,
                                                                                     boolean nested);

}
