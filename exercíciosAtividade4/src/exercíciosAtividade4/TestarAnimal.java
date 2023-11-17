package exercíciosAtividade4;

public class TestarAnimal {
	
	public static void main (String args[]) {
		
		//tipo de alimentação, ambiente, nome, comprimento, número de patas, cor, velocidade média, quantidade de osos e dentes, alimento
		
		Mamíferos homem = new Mamíferos("carnívoro", "centro urbanos e rurais", "homo sapiens", 173, 2, "branco/negro/pardo/amarelo", 13.0, 206, 32, "carnes, carboidatros, vegetais...");
		Répteis jacaré = new Répteis("carnívoro", "rios, lagoas e pantanos", "Alligatoridae", 5.2, 4, "esverdeada", 48, "córneas", true );
		Aves águia = new Aves("carnívoro", "próximos a rios, lagos e mares", "águia - aquila", 1, 2, "pelo preto, cabeça branca", 120, "afinado e forte", 7);
		Peixes baleia = new Peixes("carnívoro", "oceanos", "baleia azul- Balaenoptera musculus", 3000, 0, "azulada", 20, true, "dorsal, peitoral, caudal e ventrais", "babtanas e caudas");
		Peixes tubarão = new Peixes("carnívoro", "oceanos", "tubarão", 300, 0, "cinzento", 1.5, true, "dorsal", "barbatanas e caudas");
		Anfíbios sapo = new Anfíbios("carnivóro", "rios e lagos", "sapo cururu -Rhinella jimi", 25, 4, "verde", 0.2, "através da pele e pulmões quando fora da água", "úmida e permeável");
		Répteis crocodilo = new Répteis("carnívoro", "rios, lagos, pantânos e magueais de regiões tropicais", "crocodilo -Crocodylus siamensis", 4000, 4, "esverdeado", 30, "osteodérmicas e ósseas" , true);
		Mamíferos elefante = new Mamíferos("herbívoros", "savanas", "elefante-Loxodonta africana", 400, 4, "cinza", 40, 326, 26, "plantas");
		Aves coruja = new Aves("carnívora", "florestas", "coruja -Tyto alba", 39, 2, "marrom, cinza e brnaco", 60, "curto e pontiagudo", 4);
		Mamíferos onintorrico = new Mamíferos("carnívoro", "rios e córregos de agua doce", "ornitorrinco", 50, 4, "marrom escuro, bege", 10, 200, 0, "camarões, caramujos e vermes");
		Mamíferos camelo = new Mamíferos("herbívoro", "desertos", "camelo", 150, 4, "amarelo", 30, 223, 34, "gramíneas e plantas");
		Mamíferos ursoCanada = new Mamíferos ("carnívoro", "terra", "urso-do-canadá", 180, 4, "vermelho", 0.5, 300, 42, "roedores, peixes, folhas, plantas");
		
		homem.dadosMamífero();
		jacaré.dadosRépteis();
		águia.dadosAves();
		baleia.dadosPeixe();
		tubarão.dadosPeixe();
		sapo.dadosAnfíbios();
		crocodilo.dadosRépteis();
		elefante.dadosMamífero();
		coruja.dadosAves();
		onintorrico.dadosMamífero();
		camelo.dadosMamífero();
		ursoCanada.dadosMamífero();
		
		
	}
}
