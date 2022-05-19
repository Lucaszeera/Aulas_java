package Sprint_DDD;


public class Site {
public static void main(String[] args) {
	
	Candidato candidato1 = new Candidato("Lucas", "lucasinfocassis@gmail.com", 94232034, 19, "Solteiro", "Masculino", "08101054383", "Lucasszera", "2519915110");
	Vaga vaga1 = new Vaga("Gerente", "das 08:00 às 16:00", 1800, "Rua Henrique Casela, 60", 3);
	Avaliador avaliador1 = new Avaliador("Cordeiro", "Cordeiro@gmail.com", 99873512, "profcordeiro", "12314123a", "FIAP", "Professor");
	System.out.println(candidato1);
	System.out.println(vaga1);
	System.out.println(vaga1.cpfs);
	vaga1.candidatar("123456");
	System.out.println(vaga1);
	System.out.println(vaga1.cpfs);
	vaga1.candidatar("123");
	System.out.println(vaga1);
	System.out.println(vaga1.cpfs);
	System.out.println(vaga1.cpfs.isEmpty());
	System.out.println(avaliador1);
	avaliador1.setNome("Cordeiro SCRUM MASTER", "12314123b");
	System.out.println(avaliador1);
}}
