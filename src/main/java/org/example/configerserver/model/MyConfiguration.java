package org.example.configerserver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "configuration")
public class MyConfiguration {

    @Id
    @GeneratedValue
    private Long id;

    private String application;
    private String label;
    private String profile;
    @Column(name = "_key")
    private String key;

    private String value;

    public MyConfiguration(Long id, String application, String label, String profile, String key, String value) {
        this.id = id;
        this.application = application;
        this.label = label;
        this.profile = profile;
        this.key = key;
        this.value = value;
    }

    public MyConfiguration() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
