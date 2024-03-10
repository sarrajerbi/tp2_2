package tp2_2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class Entreprise {
private String nomEntreprise;
HashMap<Integer, Departement> Liste_Deps;

public Entreprise(String nomEntreprise) {
	super();
	this.nomEntreprise = nomEntreprise;
	Liste_Deps = new HashMap<>();
}
//ajouter un département donné à l'entreprise
public void ajoutDep(Departement d)
{
	Liste_Deps.put(d.getIdDep(), d);
}
//retirer un département de l'entreprise
public void retirerDep(Departement d)
{
	Liste_Deps.remove(d.getIdDep());
}

public void afficheE() {
        System.out.println("Nom de l'entreprise : " + nomEntreprise);
        Set<Entry<Integer,Departement>> s=this.Liste_Deps.entrySet();
        for (Entry<Integer,Departement>e:s) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
public void UpdateDep(Employe E, int idDep)
	{
		
			if(dep!= null)
			{
				dep.retirerEmploye(E);
			}
			
		
		
	}
	public boolean existeD(Departement d)
	{
		 return Liste_Deps.containsValue(d);
	}
	//afficher le département ayant le plus petit nombre d’étudiants
	public void DepMinCapacity()
	{
	}
}
