package com.example.awsimageupload.datastore;

import com.example.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("a5f83aa6-b38b-4fdd-ab48-c835bb0c2e87"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("c87f6eba-3efe-41fc-9c76-5d48ed23a8b4"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
