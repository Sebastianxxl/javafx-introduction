package properties;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class IntegerPropertyChangeDemo {

	public static void main(String[] args) {
		StringProperty counter = new SimpleStringProperty(100);
		counter.addListener((ChangeListener<Number>) (prop, oldValue, newValue) -> {
			System.out.println("Counter changed: ");
			System.out.println("Old = " + oldValue + ", new = " + newValue);
		});

		counter.addListener((ChangeListener<Number>) (prop, oldValue, newValue) -> {
			System.out.println("S-a schimbat valoarea: ");
			System.out.println("vechie = " + oldValue + ", noua = " + newValue);
		});

		counter.setValue(123);
	}

}
