package fr.m2i;

import java.util.Arrays;

public class Tour<E> {
	
	private int _nbElement = 0;
	private Arrays _disc = new Array<E>();
	private int _id;
    
	public Tour(int id) {setId(id);}
	
	public void add(E element) {
        Arrays _discTampon = _disc;
        _disc = ArrayList.copyOf(_discTampon,_discTampon.length +1);
        _disc[_disc.length-1] = ((E)element);
        setNbElement(getNbElement()+1);
	}
	
	public void remove(E element) {
		E[] _discTampon = _disc;
		_disc = Arrays.copyOf(_discTampon,_discTampon.length-1);
		int i = 0;
		for(E e : _discTampon) {
			if(element!=e) 
				{_disc[i]=e;}
				i++;
			}
		setNbElement(getNbElement()-1);
		}
	
	
	public int getNbElement() 
		{return _nbElement;}

    public void setNbElement(int nbElement) 
		{this._nbElement = nbElement;}

	public int getId() 
		{return _id;}

	public void setId(int _id) 
		{this._id = _id;}
}
