public class EtudiantPojo {

    private String identiteNo;
    public String prenom;
    public String nom;
    public int age;
    public int noEcole;
    public int classe;

    public EtudiantPojo() {
    }

    public EtudiantPojo(String identiteNo, String prenom, String nom, int age, int noEcole, int classe) {
        this.identiteNo = identiteNo;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.noEcole = noEcole;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return  identiteNo + "\t\t\t"+prenom + "\t\t\t" + nom + "\t\t\t" + age +"\t\t\t" + noEcole +"\t\t\t" + classe ;

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

    public int getNoEcole() {
        return noEcole;
    }

    public void setNoEcole(int noEcole) {
        this.noEcole = noEcole;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }
}
