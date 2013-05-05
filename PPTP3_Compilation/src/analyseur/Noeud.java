package analyseur;



public class Noeud {
	
	private String racine;
	private Noeud filsDroit;
	private Noeud filsGauche;
	
	/**
	 * Construit un nouveau noeud
	 * @param racine La valeur du noeud
	 * @param filsGauche Le fils gauche de ce noeud s'il existe
	 * @param filsDroit Le fils droit de ce noeud s'il existe
	 */
	public Noeud(String racine, Noeud filsGauche, Noeud filsDroit){
		this.racine = racine;
		this.filsDroit = filsDroit;
		this.filsGauche = filsGauche;
	}
	
	/**
	 * Construit une feuille sous forme de noeud sans fils
	 * @param racine La valeur de la feuille
	 */
	public Noeud(String racine){
		this.racine = racine;
		this.filsDroit = null;
		this.filsGauche = null;
	}

	public Noeud getFilsDroit() {
		return filsDroit;
	}

	public void setFilsDroit(Noeud filsDroit) {
		this.filsDroit = filsDroit;
	}

	public Noeud getFilsGauche() {
		return filsGauche;
	}

	public void setFilsGauche(Noeud filsGauche) {
		this.filsGauche = filsGauche;
	}

	public String getRacine() {
		return racine;
	}
	
	/**
	 * Récupère l'arbre sous forme textuelle
	 */
	public String toString(){

		if(this.filsDroit != null && this.filsGauche != null){
			return this.racine + "(" + this.filsGauche.toString() + " " +  this.filsDroit.toString()+")";
		}
		else if(this.filsDroit != null){
			return this.racine + this.filsDroit.toString();
		}
		else if(this.filsGauche != null){
			return this.racine + this.filsGauche.toString();
		}
		else{
			return this.racine;
		}
	}
	
	/**
	 * Affiche l'arbre sous forme textuelle
	 */
	public void show(){
		System.out.println(this.toString());
	}

}
