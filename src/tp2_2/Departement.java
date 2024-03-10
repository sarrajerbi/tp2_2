package tp2_2;

import java.util.*;

public class Departement {
	private int idDep;
	private Set<Employe> LEmployes;
	public Departement(int idDep) {
		super();
		this.idDep = idDep;
		LEmployes = new HashSet<>();
	}
	
	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public Set<Employe> getLEmployes() {
		return LEmployes;
	}

	public void setLEmployes(Set<Employe> lEmployes) {
		LEmployes = lEmployes;
	}

	public void ajoutEmploye(Employe E)
	{
		if(E.getCin()>0)
		{
			LEmployes.add(E);
		}
	}
	public void retirerEmploye(Employe E)
	{
		LEmployes.remove(E);
	}
	
	public void afficheDep()
	{
		System.out.println("Departement id"+ idDep);
		for(Employe e:LEmployes) {
			System.out.println("nom"+e.getNom()+"cin"+e.getCin()+"slaire"+e.getSalaire());
		}
	}
	
	public boolean existeE(int cin)
	{
		for(Employe e:LEmployes) {
			if(e.getCin()==cin)
			{
				return true;
			}
		}
		return false;
	
	
	}
	
	public Employe getEmpSalMax()
	{
		TreeSet<Employe>l=new TreeSet<>(LEmployes);
		
		return l.first();
	
	}

	}