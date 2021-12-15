package fami41;

public class Preguica extends Animal {
	
	private boolean subirArvore;
	
	public Preguica (String nome, String som, int idade, boolean subirArvore)
	{
		super(nome,som,idade);
		this.subirArvore=subirArvore;
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	public void imprimirInfo()
	{
		System.out.println("\n---Dados da Preguiça---\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom());
	}
	public void imprimirMovimento()
	{
		if(isSubirArvore()==true) 
		{
			System.out.println("\nGosta de Subir Árvores!!");
		}
	}
}