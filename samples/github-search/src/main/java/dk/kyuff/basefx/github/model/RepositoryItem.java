package dk.kyuff.basefx.github.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 16.21
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryItem {

    private long id;
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("private")
    private boolean privateRepository;
    private String description;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isPrivateRepository() {
        return privateRepository;
    }

    public void setPrivateRepository(boolean privateRepository) {
        this.privateRepository = privateRepository;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
