package com.example.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private UUID userProfileId;
    private String username;
    private String profileImageLink;    // S3 key

    public UserProfile(UUID userProfileId, String username, String profileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.profileImageLink = profileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Optional<String> getProfileImageLink() {
        return Optional.ofNullable(profileImageLink);
    }

    public void setProfileImageLink(String profileImageLink) {
        this.profileImageLink = profileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId,that.userProfileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(profileImageLink, that.profileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, profileImageLink);
    }
}
