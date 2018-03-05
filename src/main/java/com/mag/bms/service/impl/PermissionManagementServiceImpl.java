package com.mag.bms.service.impl;

import com.mag.bms.service.PermissionManagementService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionManagementServiceImpl implements PermissionManagementService{

    @Override
    public List<String> getPermittedBuckets() {
        return buildStubbedBucketList();
    }

    private List<String> buildStubbedBucketList() {
        List<String> buckets = new ArrayList<>();

        buckets.add("Seventeen");
        buckets.add("Gray joe");
        buckets.add("Velocity");
        buckets.add("Management");
        buckets.add("Head of unit");

        return buckets;
    }
}
