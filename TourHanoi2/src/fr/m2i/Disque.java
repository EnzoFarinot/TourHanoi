package fr.m2i;

public class Disque <E> {

	private int _taille; // sert aussi d'idée puisqu'un disque par taille
	private int _place; // doit être comprise entre 0 et n disque
	private int _tourId; // 1 2 ou 3
	private Disque _disquePrecedent; // Element de chainage
	private Disque _disqueSuivant;	// ---
	
	public int getTaille() 
		{return _taille;}
	public void setTaille(int taille) 
		{this._taille = taille;}
	public Disque getDisquePrecedent() 
		{return _disquePrecedent;}
	public void setDisquePrecedent(E disquePrecedent) 
		{this._disquePrecedent = ((Disque)disquePrecedent);}
	public Disque getDisqueSuivant() 
		{return _disqueSuivant;}
	public void setDisqueSuivant(E disqueSuivant) 
		{this._disqueSuivant = ((Disque)disqueSuivant);}
	public int getPlace() 
		{return _place;}
	public void setPlace(int place) 
		{this._place = place;}
	public int getTourId() 
		{return _tourId;}
	public void setTourId(int tourId) 
		{this._tourId = tourId;}
	
	public Disque(int taille,int tourId,int place){
		setTaille(taille);
		setPlace(place);
		setTourId(tourId);
	}
	
	public void moveDisc(E tourSource,E tourDestinataire,E discToMove) {
		((Tour)tourDestinataire).add(discToMove);
	}
	
}
