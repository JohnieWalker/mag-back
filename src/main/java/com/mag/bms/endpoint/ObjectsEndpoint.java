package com.mag.bms.endpoint;

import com.mag.bms.model.BucketObjectRepresentation;
import com.mag.bms.model.BucketObjectsWrapper;
import com.mag.bms.model.BucketVersionObjectRepresentation;
import com.mag.bms.service.ObjectsManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bms/api/v1/objects")
public class ObjectsEndpoint {

    @Autowired
    private ObjectsManagementService objectsManagementService;

    @GetMapping
    public BucketObjectsWrapper<BucketObjectRepresentation> getObjectsByBucketNameAndPrefix(
            @RequestParam String bucketName,
            @RequestParam(required = false) String prefix,
            @RequestParam(required = false) boolean nested,
            @RequestParam(required = false) String token) {
        return objectsManagementService.getAllObjectsFromBucketWithPrefix(bucketName, prefix, nested, token);
    }

    @GetMapping(value = "/versions")
    public List<BucketVersionObjectRepresentation> getObjectsVersionsByBucketNameAndPrefix(
            @RequestParam String bucketName, @RequestParam(required = false) String prefix,
            @RequestParam(required = false) boolean nested) {
        return objectsManagementService.getAllVersionObjectsFromBucketWithPrefix(bucketName, prefix, nested);
    }

}
