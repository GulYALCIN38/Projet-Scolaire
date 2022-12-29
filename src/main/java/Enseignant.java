import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Enseignant extends EnseignantPojo{
    static Scanner input = new Scanner(System.in);

    static Map<String, EnseignantPojo> listEnseignant= new HashMap<>();
    static Set<Map.Entry<String, EnseignantPojo>> entries = listEnseignant.entrySet();
    static Set<String> noIdentiteSet1 = listEnseignant.keySet();
    public static void laPageEnseignant() {
        System.out.println(".................LA PAGE D'ENSEIGNANT......................");
        System.out.println("1.AJOUTER\n2.ACCEDER AUX INFORMATIONS\n3.LISTEZ LES INFORMATIONS\n" +
                "4.DESENREGISTRER LES INFORMATIONS \n5.ACCEDER A LA PAGE D'ACCUEIL\n6.Q SORTIR\n" +
                "SELECTIONNEZ L'ACTION QUE VOUS VOULEZ FAIRE");
        String select = input.next().toUpperCase();
        boolean choix = true;

        do {
            switch (select) {


                case "1":
                    ajouterE();
                    choix = false;
                    break;
                case "2":
                    accederAuxInformationEnseignant();
                    choix = false;
                    break;
                case "3":
                    listezLesEnseignant();
                    choix = false;
                    break;
                case "4":
                    desenregistre();
                    choix = false;
                    break;
                case "5":
                    PageDaccueilEcole.laPageAccueil();
                    choix = false;
                    break;
                case "Q":
                    System.out.println("merci de visiter notre page d'enseignant");
                    choix = false;
                    break;
                default:
                    System.out.println("vous avez fait un mauvais choix. reessayez s'il vous plait");
                    select = input.next().toUpperCase();

            }


        } while (true);


    }

    public static void ajouterE() {
        System.out.println("-----------------LA PAGE D'AJOUT ENSEIGNANT--------------------");
        System.out.println("Entrez le numero d'identite a 6 chiffres");
        String identiteNo = input.next();
        if (identiteNo.matches("[0-9]{6}")) {
            System.out.println("Entrez le prenom d'enseignant");
            String prenom = input.next();
            System.out.println("Entrez le nom d'enseignant");
            String nom = input.next();
            System.out.println("Entrez l'age d'enseignant");
            int age = input.nextInt();
            System.out.println("Entrez le matiere d'enseignant");
            String matiere = input.next();


            EnseignantPojo obj = new EnseignantPojo(identiteNo, prenom, nom, age, matiere);
            listEnseignant.put(identiteNo, obj);
            System.out.println("Les information sur l'enseignant ont ete enregistrees avec succes\n appuyez sur " +
                    "1 pour ajoutez un nouvel etudiant\nappuyez sur 2 pour revenir la page d'enseignant\n" +
                    "appuyez sur n'importe quel numero pour revenir la page d'accueil");
            String ss = input.next();
            if (ss.equals("1")) {
                ajouterE();

            } else if (ss.equals("2")) {
                laPageEnseignant();

            } else {
                PageDaccueilEcole.laPageAccueil();
            }


        }
    }
    public static void accederAuxInformationEnseignant(){

        System.out.println("entrez le numero d'identite d'enseignant ");
        String rechercheLidentite = input.next();
        if (noIdentiteSet1.contains(rechercheLidentite)) {
            EnseignantPojo enseignant = listEnseignant.get(rechercheLidentite);
            System.out.println(enseignant);
            System.out.println("assuyez sur 1 pour continuer a rechercher\n" +
                    "assuyez sur 2 pour revenir a la page d'enseignnant\n " +
                    "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
            String s = input.next();
            if (s.equals("1")) {
                accederAuxInformationEnseignant();
            } else if (s.equals("2")) {
                laPageEnseignant();
            } else {
                PageDaccueilEcole.laPageAccueil();
            }


        } else {
            System.out.println("Vous avez entre un mauvais numero d'identite");
            System.out.println("assuyez sur 1 pour continuer a rechercher\n" +
                    "assuyez sur 2 pour revenir a la page d'enseignant\n " +
                    "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
            String s = input.next();
            if (s.equals("1")) {
                accederAuxInformationEnseignant();
            } else if (s.equals("2")) {
                laPageEnseignant();
            } else {
                PageDaccueilEcole.laPageAccueil();
            }
        }

    }
    public static void listezLesEnseignant() {
        System.out.println("...........................LE LIST D'ENSEIGNANT................................");
        for (Map.Entry<String, EnseignantPojo> w : entries) {
            System.out.println(w);

        }
        System.out.println(
                "assuyez sur 1 pour revenir a la page d'enseignant\n " +
                        "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
        String s = input.next();
        if (s.equals("1")) {
            laPageEnseignant();


        } else {
            PageDaccueilEcole.laPageAccueil();
        }
    }
    public static void desenregistre() {
        System.out.println("entrez le numero d'identite d'enseignant que vous voulez supprimer ");
        String numeroAsuprime = input.next();
        if (noIdentiteSet1.contains(numeroAsuprime)) {
            System.out.println("Les informations sur l,etudiant que vous souhaitez supprimer");
            System.out.println(listEnseignant.get(numeroAsuprime));
            listEnseignant.remove(numeroAsuprime);
            System.out.println("les informations supprimees");
            System.out.println("assuyez sur 1 pour continuer a supprimer\n" +
                    "assuyez sur 2 pour revenir a la page d'enseignant\n " +
                    "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
            String s = input.next();
            if (s.equals("1")) {
                desenregistre();
            } else if (s.equals("2")) {
                laPageEnseignant();
            } else {
                PageDaccueilEcole.laPageAccueil();
            }
        } else {
            System.out.println("Vous avez entre un mauvais numero d'identite");
            System.out.println("assuyez sur 1 pour continuer a supprimer\n" +
                    "assuyez sur 2 pour revenir a la page d'enseignant\n " +
                    "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
            String s = input.next();
            if (s.equals("1")) {
                desenregistre();
            } else if (s.equals("2")) {
                laPageEnseignant();
            } else {
                PageDaccueilEcole.laPageAccueil();
            }
        }

    }

}


