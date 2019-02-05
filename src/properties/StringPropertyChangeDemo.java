package properties;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class StringPropertyChangeDemo {

        public static void main(String[] args) {
            StringProperty counter = new SimpleStringProperty("Marin");
            counter.addListener ((prop, oldValue, newValue) -> {
                System.out.println("Counter changed: ");
                System.out.println("Old = " + oldValue + ", new = " + newValue);
            });

            counter.setValue("Adrian");
        }

    }
