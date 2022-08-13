package application;

import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

public class PanelesScroll {
	
	private ScrollPane panelIzq;
	private ScrollPane panelDer;
	
	public PanelesScroll() {
		
	}

	public ScrollPane getPanelIzq() {
		return panelIzq;
	}

	public ScrollPane getPanelDer() {
		return panelDer;
	}
	
	public void panelDerecho(Node contenidoDer) {
		panelDer = new ScrollPane();
		panelDer.setContent(contenidoDer);
		panelDer.setFitToWidth(true);
		panelDer.setHbarPolicy(ScrollBarPolicy.NEVER);
		panelDer.setPrefWidth(670);
		panelDer.setStyle("-fx-background: rgb(19,28,70)");
		panelDer.setPannable(true);
		
	}
	
	public void ajusteDesplDer(FlowPane contenidoDer) {
		panelDer.vvalueProperty().bind(new ObservableValue<Number>() {

			@Override
			public void addListener(InvalidationListener event) {
				panelDer.vvalueProperty().bind(contenidoDer.heightProperty());
				
			}

			@Override
			public void removeListener(InvalidationListener arg0) {
				
			}

			@Override
			public void addListener(ChangeListener<? super Number> arg0) {
				
			}

			@Override
			public Number getValue() {
				return 2;
			}

			@Override
			public void removeListener(ChangeListener<? super Number> arg0) {
				
			}
		});
	}
	

}
