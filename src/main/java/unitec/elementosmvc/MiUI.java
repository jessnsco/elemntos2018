/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import java.awt.TextField;

/**
 *
 * @author T-107
 */
@SpringUI
public class MiUI extends UI{
    
    @AutoWired RepositorMensaje repoMensa;

    @Override
    protected void init(VaadinRequest request) {
     
    VerticalLayout layout=new VerticalLayout();
    Label etiqueta=new Label("Bienvenido a mi aplicacion");
    etiqueta.addStyleName(ValoTheme.LABEL_H2);
    
    TextField texto=new TextField();
    texto.setPlaceholder("cuerpo del mensaje");
    
    Button boton=new Button ("guaradr mensaje");
    boton.addStyleName(ValoTheme.BUTTON_DANGER);
    
    //Manejamos el evento 
    boton.addClickListener(algo->{
       String cuerpo=texto.getValue();
       //Guardamos
       repoMensa.save(new Mensaje(cuerpo));
       //Le comunicamos al usuario con un mensaje que se guardo
       Notification.show("Mensaje guardado",Notification.type.ERROR_MESSAGE);
    });
    
//Caso:Busacar todos
    Grid<Mensaje> grid = new Grid<>();
    grid.setItems(repoMensa.findAll());

    grid.addColumn(Mensaje::getId).setCaption("id");
    grid.addColumn(Mensaje::getCuerpo).setCaption("cuerpo");
    
    
    
    //Agregamos dicho componenete a nuestro layout
    layout.addComponent(grid);
    
    //AGREGAMOS LA ETIQUETA Y EL BOTON LAYOUT
    layout.addComponent(etiqueta);
    layout.addComponent(texto);
    layout.addComponent(boton);
    
    //FINALMENTE AGREGAMOS EL LAYOUT AL CONTENEDOR INICIAL INIT
    setContent(layout);
    
    
    }
    
}
