package application;

import java.util.List;

import com.chat.contenido.MessagesUser;
import com.chat.repositorio.RepositoryMessages;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainDisc extends Application {
	
	RepositoryMessages contentMessage = new RepositoryMessages();
	ImagesUsers contentImag = new ImagesUsers();
	PanelesScroll panels = new PanelesScroll();
	WinLogin winlog = new WinLogin();
	WinChat winchat = new WinChat();
	Users listadoUser = new Users();
	Button btnSalir = new Button("Sign Out");
	

	@Override
	public void start(Stage escenario) throws Exception {
		
		
//VENTANA DE LOGIN		
		winlog.userText();
		winlog.clavePass();
		winlog.loginButton();
		winlog.tituloLabel();
		
//VENTANA DE CHAT Y PERFIL DE USUARIO	
		winlog.getLogin().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				escenario.close();
				winchat.chat();
				winchat.enviar();
				winchat.usuarioId(winlog.getUser().getText());
				listadoUser.listaUsuarios();
				
//PARTE SUPERIOR IZQUIERDA
				HBox panelSupIzq = new HBox(15, listadoUser.validacion(winlog.getUser().getText()), winchat.getUsuarioId(), btnSalir);
				panelSupIzq.setPadding(new Insets(5, 0, 0, 10));
				panelSupIzq.setAlignment(Pos.CENTER);
				
				
//PARTE SUPERIOR DERECHA
				HBox panelSupDer = new HBox(15);
				panelSupDer.setPadding(new Insets(5, 0, 0, 10));
				panelSupDer.setAlignment(Pos.CENTER);
				
				
//CONTENIDO IZQUIERDO
				List<Image> fotos = contentImag.imagenesUser();				
				List<MessagesUser> resultado1 = contentMessage.getUsuarios();				
				ListView<HBox> contenidoIzq = new ListView<>();
				contenidoIzq.setPrefWidth(350);

				for(int i = 0; i < resultado1.size(); i++) {
					
					contentImag.imgCircular(fotos.get(i));
					
					winchat.contactos(resultado1.get(i).getContacto());
					winchat.mensajeUser(resultado1.get(i).getContenido());
					winchat.hora(resultado1.get(i).getDeHoras().get(i));
					
					GridPane usuarios = new GridPane();
					usuarios.setStyle("-fx-background-color: rgb(8,35,56)");
					
					usuarios.add(winchat.getContactos(), 0, 0);
					usuarios.add(winchat.getMensajeUser(), 0, 1);
					usuarios.add(winchat.getHora(), 1, 0);
					usuarios.setVgap(10);
					usuarios.setHgap(10);
					
					

					HBox contUser = new HBox(15, contentImag.getImgCircle(), usuarios);
					contUser.setPadding(new Insets(10, 0, 10, 0));	
					contUser.setStyle("-fx-background-color: rgb(8,35,56)");
					
					
					contenidoIzq.getItems().addAll(contUser);
					contenidoIzq.setStyle("-fx-background-color: rgb(8,35,56)");
					
				}
				
//CONTENIDO DERECHO
				FlowPane contenidoDer = new FlowPane();
				contenidoIzq.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<HBox>() {

					@Override
					public void changed(ObservableValue<? extends HBox> arg0, HBox arg1, HBox arg2) {
						for(int i = 0; i < resultado1.size(); i++) {

							if(contenidoIzq.getSelectionModel().getSelectedItem().equals(contenidoIzq.getItems().get(i))) {
								List<MessagesUser> resultado2 = contentMessage.getMensajes(winlog.getUser().getText(),
										resultado1.get(i).getContacto());
								
								contenidoDer.getChildren().clear();
								
								for(int j = 0; j < resultado2.size(); j++) {
				
									
									if(resultado2.get(j).getContacto().equals(winlog.getUser().getText())) {
										
										contentImag.imgCircular(fotos.get(i));
//										
										// color de globos de amigos -fx-background-color: rgb(40,152,238)
										winchat.globoMsjtest(resultado2.get(j).getContenido(), "-fx-background-color: rgb(40,152,238)");
//										se crea un hbox y se guarda el globo y el mensaje y se lo return dependiendo el posicionamiento
										contenidoDer.getChildren().add(winchat.smspos(contentImag.getImgCircle(), winchat.getGloboMsj(), false));
									}
									else {
										
										contentImag.imgCircular(new Image("file:ft1.jpg"));
										// color propio del user -fx-background-color: rgb(60,76,143)
										winchat.globoMsjtest(resultado2.get(j).getContenido(), "-fx-background-color: rgb(60,76,143)");
										// se crea un hbox y se guarda el globo y el mensaje y se lo return dependiendo el posicionamiento
										contenidoDer.getChildren().add(winchat.smspos(contentImag.getImgCircle(), winchat.getGloboMsj(), true));
											
									}
									
									winchat.contactos(resultado1.get(i).getContacto());
									Label disp = new Label(listadoUser.getDisponibilidad().get(i+1));
									disp.setStyle("-fx-text-fill: white");
									GridPane pSd = new GridPane();
									
									pSd.add(winchat.getContactos(), 0, 0);
									pSd.add(disp, 0, 1);
									pSd.setVgap(5);
									pSd.setHgap(10);
									
									panelSupDer.getChildren().clear();				
									panelSupDer.getChildren().addAll(listadoUser.validacion(resultado1.get(i).getContacto()), pSd);
	
								}						
							}						
						}							
					}					
				});
	
//PANEL SCROLL				
				panels.panelDerecho(contenidoDer);
				
				
//EVENTO ENVIAR MENSAJES PULSANDO ENTER			
				winchat.getChat().setOnKeyPressed(new EventHandler<KeyEvent>() {

					@Override
					public void handle(KeyEvent event) {
						if(event.getCode() == KeyCode.ENTER) {
							
							contentImag.imgCircular(new Image("file:ft1.jpg"));
							winchat.globoMsjtest(winchat.getChat().getText(), "-fx-background-color: rgb(60,76,143)");
//							se crea un hbox y se guarda el globo y el mensaje y se lo return dependiendo el posicionamiento
							contenidoDer.getChildren().add(winchat.smspos(contentImag.getImgCircle(), winchat.getGloboMsj(), true));
							panels.ajusteDesplDer(contenidoDer);
							winchat.getChat().clear();
						}
					}
				});
				
//EVENTO ENVIAR	MENSAJES PULSANDO EL BOTON 		
				winchat.getEnviar().setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) {
						
						contentImag.imgCircular(new Image("file:ft1.jpg"));
						

						winchat.globoMsjtest(winchat.getChat().getText(), "-fx-background-color: rgb(60,76,143)");
//						se crea un hbox y se guarda el globo y el mensaje y se lo return dependiendo el posicionamiento
						contenidoDer.getChildren().add(winchat.smspos(contentImag.getImgCircle(), winchat.getGloboMsj(), false));
						panels.ajusteDesplDer(contenidoDer);
						winchat.getChat().clear();	
					}
				});
				
//MODULO INFERIOR DERECHO				
				HBox chatbox = new HBox(10);
				chatbox.getChildren().addAll(winchat.getChat(), winchat.getEnviar());
				chatbox.setAlignment(Pos.CENTER);
				
//ANCHOR PANE
				AnchorPane panel = new AnchorPane();
				panel.getChildren().addAll(panelSupIzq, panelSupDer, chatbox, contenidoIzq, panels.getPanelDer());
				panel.setStyle("-fx-background-color: rgb(8,35,56)");
				
				AnchorPane.setTopAnchor(panelSupIzq, 0d);
				AnchorPane.setTopAnchor(panelSupDer, 0d);
				AnchorPane.setLeftAnchor(panelSupDer, 350d);
				AnchorPane.setBottomAnchor(chatbox, 5d);
				AnchorPane.setRightAnchor(chatbox, 5d);
				AnchorPane.setLeftAnchor(contenidoIzq, 0d);
				AnchorPane.setTopAnchor(contenidoIzq, 55d);
				AnchorPane.setBottomAnchor(contenidoIzq, 0d);
				AnchorPane.setRightAnchor(panels.getPanelDer(), 5d);
				AnchorPane.setTopAnchor(panels.getPanelDer(), 55d);
				AnchorPane.setBottomAnchor(panels.getPanelDer(), 45d);
				
				Stage escenario2 = new Stage();
				Scene escena2 = new Scene(panel, 1030, 650);
				escenario2.getIcons().add(new Image("C:\\Users\\HP\\OneDrive\\Universidad\\CI 2022-2023\\PAG\\Aplicacion_chat\\msg.png"));
				escenario2.setTitle("Discord");
				escenario2.setResizable(false);
				escenario2.setScene(escena2);
				escenario2.show();
				
				//Boton salir
				btnSalir.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {
						System.out.println("Disconnected");
						escenario2.close();
						escenario.show();
					
					
					}
				});
				
				
				
				
			}
		});
		
		Image imagen = new Image("file:user.png");
		ImageView img = new ImageView(imagen);
		img.setFitWidth(195);
		img.setFitHeight(195);
		img.setPreserveRatio(true);
		img.setSmooth(true);
		
		Image fondo = new Image("file:fondogral.jpg");
		ImageView fond = new ImageView(fondo);
		
		VBox izq = new VBox(15, winlog.getUser(), winlog.getClave(), winlog.getLogin());
		
		VBox der = new VBox(15, winlog.getTitulo());
		der.setAlignment(Pos.CENTER);
		
		AnchorPane raiz = new AnchorPane();
		raiz.getChildren().addAll(fond, izq, der, img);
		AnchorPane.setTopAnchor(fond, 0d);
		AnchorPane.setBottomAnchor(fond, 0d);
		AnchorPane.setLeftAnchor(izq, 20d);
		AnchorPane.setTopAnchor(izq, 130d);
		AnchorPane.setTopAnchor(der, 20d);
		AnchorPane.setLeftAnchor(der, 20d);
		AnchorPane.setRightAnchor(der, 20d);
		AnchorPane.setRightAnchor(img, 20d);
		AnchorPane.setBottomAnchor(img, 60d);		
		
		Scene escena = new Scene(raiz, 450, 430);
		escenario.getIcons().add(new Image("C:\\Users\\HP\\OneDrive\\Universidad\\CI 2022-2023\\PAG\\Aplicacion_chat\\msg.png"));
		escenario.setTitle("Discord Penguin");
		escenario.setScene(escena);
		escenario.show();
		
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}  
