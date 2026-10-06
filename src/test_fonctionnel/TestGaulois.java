package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
    private String nom;
    private int force;

    public TestGaulois(String nom, int force) {
        this.nom = nom;
        this.setForce(force);
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
    }

    @Override
    public String toString() {
        return nom;
    }

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        System.out.println(asterix);
    }

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
}