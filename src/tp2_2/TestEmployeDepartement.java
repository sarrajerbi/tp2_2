package tp2_2;

public class TestEmployeDepartement {
	public static void main(String[] args) {
        Departement dep1 = new Departement(1);

        // Création de quelques employés
        Employe emp1 = new Employe(123, "yassine", 50000, 1);
        Employe emp2 = new Employe(456, "youssef", 60000, 1);
        Employe emp3 = new Employe(789, "fifi", 55000, 1);

        // Ajout des employés au département
        dep1.ajoutEmploye(emp1);
        dep1.ajoutEmploye(emp2);
        dep1.ajoutEmploye(emp3);

        // Affichage du département
        dep1.afficheDep();

        // Vérification de l'existence d'un employé
        int cinToCheck = 456;
        System.out.println("L'employé avec le CIN " + cinToCheck + " existe dans le département : "
                + dep1.existeE(cinToCheck));

        // Retrait d'un employé
        dep1.retirerEmploye(emp2);

        // Affichage mis à jour du département
        dep1.afficheDep();

        // Obtention de l'employé avec le salaire maximum dans le département
        Employe empSalMax = dep1.getEmpSalMax();
        System.out.println("L'employé avec le salaire maximum dans le département est : " + empSalMax.toString());
}
}
