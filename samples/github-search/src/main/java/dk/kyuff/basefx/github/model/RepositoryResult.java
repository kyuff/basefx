package dk.kyuff.basefx.github.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 16.18
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryResult {

    @JsonProperty("total_count")
    private int totalCount;
    @JsonProperty("incomplete_results")
    private boolean incompleteResult;
    private List<RepositoryItem> items;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isIncompleteResult() {
        return incompleteResult;
    }

    public void setIncompleteResult(boolean incompleteResult) {
        this.incompleteResult = incompleteResult;
    }

    public List<RepositoryItem> getItems() {
        return items;
    }

    public void setItems(List<RepositoryItem> items) {
        this.items = items;
    }
}
