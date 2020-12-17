package com.example.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("myawsbucket-image-upload-amigoscode");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
