package fami41;

public class Cachorro extends Animal{
	
	private boolean correr;

public Cachorro(String nome, String som, int idade, boolean correr)
{
	super(nome,som,idade);
	this.correr=correr;
}

public boolean isCorrer() {
	return correr;
}

public void setCorrer(boolean correr) {
	this.correr = correr;
}

public void imprimirInfo()
{
	System.out.println("\n---Dados do Cachorro---\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom());
}

public void imprimirMovimento()
{
	if(isCorrer()==true) 
	{
		System.out.println("\nGosta de correr!!");
	}
}
}
