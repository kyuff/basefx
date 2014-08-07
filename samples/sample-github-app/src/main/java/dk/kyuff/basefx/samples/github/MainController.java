package dk.kyuff.basefx.samples.github;

import dk.kyuff.basefx.core.FXView;
import dk.kyuff.basefx.github.model.RepositoryItem;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 20.15
 */
public class MainController {
    @FXML
    TableColumn<RepositoryItem, String> descriptionColumn;
    @FXML
    TableColumn<RepositoryItem, String> fullNameColumn;
    @FXML
    TableView<RepositoryItem> data;
    @FXML
    Label status;
    @FXML
    TextField input;

    @Inject
    Instance<SearchService> searchServiceInstance;

    @Inject
    @FXView("/details.fxml")
    Instance<VBox> detailedView;

    private ObservableList<RepositoryItem> items;

    public void initialize() {
        items = FXCollections.observableArrayList();
        data.setItems(items);
        fullNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getFullName()));
        descriptionColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getDescription()));

    }

    @FXML
    public void doSearch(ActionEvent actionEvent) {
        String query = input.getText();
        SearchService searchService = searchServiceInstance.get();
        searchService.setQuery(query);
        searchService.setOnSucceeded(event -> {
            status.setText("done searching");
            items.clear();
            items.addAll(searchService.getValue().getItems());
        });

        status.setText("searching for " + query);
        searchService.start();

    }

    public static class RepositoryItemCell extends ListCell<RepositoryItem> {
        @Override
        protected void updateItem(RepositoryItem item, boolean empty) {
            super.updateItem(item, empty);

        }
    }
}
