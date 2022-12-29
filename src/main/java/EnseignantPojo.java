public class EnseignantPojo {
    private String identiteNo;
    public String prenom;
    public String nom;
    public int age;
    public String matiere;


    public EnseignantPojo() {
    }

    public EnseignantPojo(String identiteNo, String prenom, String nom, int age, String matiere) {
        this.identiteNo = identiteNo;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.matiere = matiere;

    }


    public String getIdentiteNo() {
        return identiteNo;
    }

    public void setIdentiteNo(String identiteNo) {
        this.identiteNo = identiteNo;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {

        return  identiteNo + "\t\t\t"+prenom + "\t\t\t" + nom + "\t\t\t" + age +"\t\t\t" + matiere  ;
    }
}
