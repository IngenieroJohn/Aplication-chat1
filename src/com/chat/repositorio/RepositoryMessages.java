package com.chat.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.chat.contenido.MessagesUser;

public class RepositoryMessages {
	
	private List<MessagesUser> listaMensajes = new ArrayList<MessagesUser>();
	private List<MessagesUser> listaUsuarios = new ArrayList<MessagesUser>();
	
	public RepositoryMessages() {
		
		listaUsuarios.add(new MessagesUser("Diego", "jajaja oye tu si que eres dramatica ya le pusiste 10 deberes :v"));
		listaMensajes.add(new MessagesUser("Diego", "Jhon", "Hola Mauricio ayudame con el deber de programacion"));
		listaMensajes.add(new MessagesUser("Jhon", "Diego", "Como estas Denisse, claro ya te ayudo con eso dame unos segundos xd" ));
		listaMensajes.add(new MessagesUser("Diego", "Jhon", "Dale aqui te espero, no te vayas a olvidar"));
		listaMensajes.add(new MessagesUser("Diego", "Jhon", "Por cierto que otros deberes mandaron"));
		listaMensajes.add(new MessagesUser("Jhon", "Diego", "Estadistica creo y el proyecto de programa :v" ));
		listaMensajes.add(new MessagesUser("Diego", "Jhon", "Ya con programa es como tener 10 deberes xd" ));
		listaMensajes.add(new MessagesUser("Diego", "Jhon", "Ojala me lleve el diablo jaja" ));
		listaMensajes.add(new MessagesUser("Jhon", "Diego", "jajaja oye tu si que eres dramatica ya le pusiste 10 deberes :v" ));
		
		listaUsuarios.add(new MessagesUser("William", "Deberias ser comediante y no ingeniero :v"));
		listaMensajes.add(new MessagesUser("William", "Jhon", "Holis perdido jijiji"));
		listaMensajes.add(new MessagesUser("Jhon", "William", "Perdido yo! xd" ));
		listaMensajes.add(new MessagesUser("William", "Jhon", "Obvio bobis :v"));
		listaMensajes.add(new MessagesUser("William", "Jhon", "Ya ni te acuerdas de uno, como pasas solo programando"));
		listaMensajes.add(new MessagesUser("Jhon", "William", "jajaja la programación ya me tiene loco" ));
		listaMensajes.add(new MessagesUser("Jhon", "William", "Se parece a una novia toxica" ));
		listaMensajes.add(new MessagesUser("William", "Jhon", "JAJAJA me hiciste reir con lo que dijiste" ));
		listaMensajes.add(new MessagesUser("William", "Jhon", "Deberias ser comediante y no ingeniero :v" ));
		
		listaUsuarios.add(new MessagesUser("Oscar", "Dale, bro nos vemos cuidate estamos hablando"));
		listaMensajes.add(new MessagesUser("Oscar", "Jhon", "Hola como estas"));
		listaMensajes.add(new MessagesUser("Jhon", "Oscar", "Estoy bien, justo ahora voy a una entrevista de trabajo, tu como estas?" ));
		listaMensajes.add(new MessagesUser("Oscar", "Jhon", "Genial! te deseo lo mejor de la suerte, pues bien queria saber si el fin de semana nos reunimos para jugar futbol"));
		listaMensajes.add(new MessagesUser("Jhon", "Oscar", "Gracias, espero me escojan, ya sabes cuenta conmigo, a qué hora ese peloteo?" ));
		listaMensajes.add(new MessagesUser("Oscar", "Jhon", "A eso de las 5 de la tarde, tu ya sabes el mismo horario jaja xd" ));
		listaMensajes.add(new MessagesUser("Jhon", "Oscar", "Ya listo, a esa hora caigo, pilas te dejo, ya va a comenzar, luego hablamos. Cuidate" ));
		listaMensajes.add(new MessagesUser("Oscar", "Jhon", "Dale, bro nos vemos cuidate estamos hablando" ));
		
		listaUsuarios.add(new MessagesUser("Franklin", "jajaja habla serio, y para cuando es ese deber?"));
		listaMensajes.add(new MessagesUser("Franklin", "Jhon", "Que tal bro que te cuentas..."));
		listaMensajes.add(new MessagesUser("Jhon", "Franklin", "Ahi mi pana haciendo unos tramites y tu" ));
		listaMensajes.add(new MessagesUser("Franklin", "Jhon", "Aya que chevere"));
		listaMensajes.add(new MessagesUser("Franklin", "Jhon", "Pues yo aqui tomandome un descanso para retomar con el proyecto de programación"));
		listaMensajes.add(new MessagesUser("Jhon", "Franklin", "Cierto el proyecto, yo aun ni lo hago jajaja... pero es facil esa nota xd" ));
		listaMensajes.add(new MessagesUser("Franklin", "Jhon", "Facil? jajaja para ti será :v" ));
		listaMensajes.add(new MessagesUser("Franklin", "Jhon", "Yo me mareo con tantos codigos" ));
		listaMensajes.add(new MessagesUser("Jhon", "Franklin", "jajaja habla serio, y para cuando es ese deber?" ));
		
		listaUsuarios.add(new MessagesUser("Paula", "Ya listo en unos minutos te llega la recarga ahi me avisas si te llego"));
		listaMensajes.add(new MessagesUser("Paula", "Jhon", "Hola Mau como estas me podrias hacer un pequeño favor"));
		listaMensajes.add(new MessagesUser("Jhon", "Paula", "Hola Paula, claro dime en que puedo ayudarte" ));
		listaMensajes.add(new MessagesUser("Paula", "Jhon", "Please lo que pasa es que estoy en el trabajo y no puedo salir"));
		listaMensajes.add(new MessagesUser("Paula", "Jhon", "De pronto puedas hacerme una recarga yo despues te pago"));
		listaMensajes.add(new MessagesUser("Jhon", "Paula", "Ya listo como no de cuanto" ));
		listaMensajes.add(new MessagesUser("Paula", "Jhon", "De $5 porfa a mi mismo numero " ));
		listaMensajes.add(new MessagesUser("Paula", "Jhon", "Me confirmas" ));
		listaMensajes.add(new MessagesUser("Jhon", "Paula", "Ya listo en unos minutos te llega la recarga ahi me avisas si te llego" ));
		
		listaUsuarios.add(new MessagesUser("Azucena", "Y adivina a quien vi esta tarde, no me lo vas a creer jajaja"));
		listaMensajes.add(new MessagesUser("Azucena", "Jhon", "Hey que haces cuando vienes a visitarme"));
		listaMensajes.add(new MessagesUser("Jhon", "Azucena", "Hola Azu como estas, la verdad que he pensado ir este fin de semana es que paso full, tu sabes los estudios, el trabajo, y los profesores que mandan muchos deberes" ));
		listaMensajes.add(new MessagesUser("Azucena", "Jhon", "Uy no has de pasarla super estresado amigo :c te entiendo"));
		listaMensajes.add(new MessagesUser("Azucena", "Jhon", "Bueno igual no te me pierdas jajaja"));
		listaMensajes.add(new MessagesUser("Jhon", "Azucena", "Como me voy a perder, ahi me buscas jaja" ));
		listaMensajes.add(new MessagesUser("Jhon", "Azucena", "Y como te ha ido" ));
		listaMensajes.add(new MessagesUser("Azucena", "Jhon", "Pues bien, hoy fui a hacer unos tramites para la licencia de conducir" ));
		listaMensajes.add(new MessagesUser("Azucena", "Jhon", "Y adivina a quien vi esta tarde, no me lo vas a creer jajaja" ));
		
		listaUsuarios.add(new MessagesUser("Emiliano", "Dale, bro nos vemos cuidate estamos hablando"));
		listaMensajes.add(new MessagesUser("Emiliano", "Jhon", "Hola como estas"));
		listaMensajes.add(new MessagesUser("Jhon", "Emiliano", "Estoy bien, justo ahora voy a una entrevista de trabajo, tu como estas?" ));
		listaMensajes.add(new MessagesUser("Emiliano", "Jhon", "Genial! te deseo lo mejor de la suerte, pues bien queria saber si el fin de semana nos reunimos para jugar futbol"));
		listaMensajes.add(new MessagesUser("Jhon", "Emiliano", "Gracias, espero me escojan, ya sabes cuenta conmigo, a qué hora ese peloteo?" ));
		listaMensajes.add(new MessagesUser("Emiliano", "Jhon", "A eso de las 5 de la tarde, tu ya sabes el mismo horario jaja xd" ));
		listaMensajes.add(new MessagesUser("Jhon", "Emiliano", "Ya listo, a esa hora caigo, pilas te dejo, ya va a comenzar, luego hablamos. Cuidate" ));
		listaMensajes.add(new MessagesUser("Emiliano", "Jhon", "Dale, bro nos vemos cuidate estamos hablando" ));
		
		listaUsuarios.add(new MessagesUser("Anthony", "jajaja habla serio, y para cuando es ese deber?"));
		listaMensajes.add(new MessagesUser("Anthony", "Jhon", "Que tal bro que te cuentas..."));
		listaMensajes.add(new MessagesUser("Jhon", "Anthony", "Ahi mi pana haciendo unos tramites y tu" ));
		listaMensajes.add(new MessagesUser("Anthony", "Jhon", "Aya que chevere"));
		listaMensajes.add(new MessagesUser("Anthony", "Jhon", "Pues yo aqui tomandome un descanso para retomar con el proyecto de programación"));
		listaMensajes.add(new MessagesUser("Jhon", "Anthony", "Cierto el proyecto, yo aun ni lo hago jajaja... pero es facil esa nota xd" ));
		listaMensajes.add(new MessagesUser("Anthony", "Jhon", "Facil? jajaja para ti será :v" ));
		listaMensajes.add(new MessagesUser("Anthony", "Jhon", "Yo me mareo con tantos codigos" ));
		listaMensajes.add(new MessagesUser("Jhon", "Anthony", "jajaja habla serio, y para cuando es ese deber?" ));
		
		listaUsuarios.add(new MessagesUser("Alejandro", "No sé yo quiero verte si no como se que me prestas atencion :v"));
		listaMensajes.add(new MessagesUser("Alejandro", "Jhon", "Hola Mauricio ayudame con el deber de programacion"));
		listaMensajes.add(new MessagesUser("Jhon", "Alejandro", "Como estas Denisse, claro ya mismo hacemos reunion, pero me activas la camara xd" ));
		listaMensajes.add(new MessagesUser("Alejandro", "Jhon", "JAJAJA no quiero xd"));
		listaMensajes.add(new MessagesUser("Alejandro", "Jhon", "Y para que quieres que la active"));
		listaMensajes.add(new MessagesUser("Jhon", "Alejandro", "Porque quiero ver que me prestes atención, distraida :v" ));
		listaMensajes.add(new MessagesUser("Alejandro", "Jhon", "JAJAJA no pofavoooo" ));
		listaMensajes.add(new MessagesUser("Alejandro", "Jhon", "No quiero xd" ));
		listaMensajes.add(new MessagesUser("Jhon", "Alejandro", "No sé yo quiero ver que me prestes atencion jajaja :v" ));
		
		listaUsuarios.add(new MessagesUser("Tifany", "Deberias ser comediante y no ingeniero :v"));
		listaMensajes.add(new MessagesUser("Tifany", "Jhon", "Holis perdido jijiji"));
		listaMensajes.add(new MessagesUser("Jhon", "Tifany", "Perdido yo! xd" ));
		listaMensajes.add(new MessagesUser("Tifany", "Jhon", "Obvio bobis :v"));
		listaMensajes.add(new MessagesUser("Tifany", "Jhon", "Ya ni te acuerdas de uno, como pasas solo programando"));
		listaMensajes.add(new MessagesUser("Jhon", "Tifany", "jajaja la programación ya me tiene loco" ));
		listaMensajes.add(new MessagesUser("Jhon", "Tifany", "Se parece a una novia toxica" ));
		listaMensajes.add(new MessagesUser("Tifany", "Jhon", "JAJAJA me hiciste reir con lo que dijiste" ));
		listaMensajes.add(new MessagesUser("Tifany", "Jhon", "Deberias ser comediante y no ingeniero :v" ));
		
		listaUsuarios.add(new MessagesUser("Omar", "Dale, bro nos vemos cuidate estamos hablando"));
		listaMensajes.add(new MessagesUser("Omar", "Jhon", "Hola como estas"));
		listaMensajes.add(new MessagesUser("Jhon", "Omar", "Estoy bien, justo ahora voy a una entrevista de trabajo, tu como estas?" ));
		listaMensajes.add(new MessagesUser("Omar", "Jhon", "Genial! te deseo lo mejor de la suerte, pues bien queria saber si el fin de semana nos reunimos para jugar futbol"));
		listaMensajes.add(new MessagesUser("Jhon", "Omar", "Gracias, espero me escojan, ya sabes cuenta conmigo, a qué hora ese peloteo?" ));
		listaMensajes.add(new MessagesUser("Omar", "Jhon", "A eso de las 5 de la tarde, tu ya sabes el mismo horario jaja xd" ));
		listaMensajes.add(new MessagesUser("Jhon", "Omar", "Ya listo, a esa hora caigo, pilas te dejo, ya va a comenzar, luego hablamos. Cuidate" ));
		listaMensajes.add(new MessagesUser("Omar", "Jhon", "Dale, bro nos vemos cuidate estamos hablando" ));
		
		listaUsuarios.add(new MessagesUser("Nicole", "jajaja habla serio, y para cuando es ese deber?"));
		listaMensajes.add(new MessagesUser("Nicole", "Jhon", "Que tal bro que te cuentas..."));
		listaMensajes.add(new MessagesUser("Jhon", "Nicole", "Ahi mi pana haciendo unos tramites y tu" ));
		listaMensajes.add(new MessagesUser("Nicole", "Jhon", "Aya que chevere"));
		listaMensajes.add(new MessagesUser("Nicole", "Jhon", "Pues yo aqui tomandome un descanso para retomar con el proyecto de programación"));
		listaMensajes.add(new MessagesUser("Jhon", "Nicole", "Cierto el proyecto, yo aun ni lo hago jajaja... pero es facil esa nota xd" ));
		listaMensajes.add(new MessagesUser("Nicole", "Jhon", "Facil? jajaja para ti será :v" ));
		listaMensajes.add(new MessagesUser("Nicole", "Jhon", "Yo me mareo con tantos codigos" ));
		listaMensajes.add(new MessagesUser("Jhon", "Nicole", "jajaja habla serio, y para cuando es ese deber?" ));
		
	}
	
	public List<MessagesUser> getMensajes(String userActivo, String contacto){
		List<MessagesUser> resultado = new ArrayList<>();
		for(MessagesUser msg: listaMensajes) {
			if(msg.getUser().equals(userActivo) && msg.getContacto().equals(contacto) || msg.getUser().equals(contacto) && msg.getContacto().equals(userActivo)){
				resultado.add(msg);
			}
		}
		return resultado;
	}
	
	public List<MessagesUser> getUsuarios(){
		List<MessagesUser> resultado = new ArrayList<>();
		for(MessagesUser user: listaUsuarios) {
			resultado.add(user);
		}
		return resultado;
	}
	
	

}
