import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Etudiant {
    static Scanner input = new Scanner(System.in);

    static Map<String, EtudiantPojo> listEtudiant = new HashMap<>();
    static Set<Map.Entry<String, EtudiantPojo>> entries = listEtudiant.entrySet();
    static Set<String> noIdentiteSet1 = listEtudiant.keySet();


    public static void laPageEtudiant() {
        System.out.println(".................LA PAGE D'ETUDIANT......................");
        System.out.println("1.AJOUTER\n2.ACCEDER AUX INFORMATIONS\n3.LISTEZ LES INFORMATIONS\n" +
                "4.DESENREGISTRER LES INFORMATIONS \n5.ACCEDER A LA PAGE D'ACCUEIL\n6.Q SORTIR\n" +
                "SELECTIONNEZ L'ACTION QUE VOUS VOULEZ FAIRE");
        String select = input.next().toUpperCase();
        boolean choix = true;

        do {
            switch (select) {


                case "1":
                    ajouter();
                    choix = false;
                    break;
                case "2":
                    accederAuxInformationEtudiant();
                    choix = false;
                    break;
                case "3":
                    listezLesEtudiant();
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
                    System.out.println("merci de visiter notre page d'etudiant");
                    choix = false;
                    break;
                default:
                    System.out.println("vous avez fait un mauvais choix. reessayez s'il vous plait");
                    select = input.next().toUpperCase();

            }


        } while (true);


    }

    public static void ajouter() {
        System.out.println("-----------------LA PAGE D'AJOUT ETUDIANT--------------------");
        System.out.println("Entrez le numero d'etudiant a 6 chiffres");
        String identiteNo = input.next();
        if (identiteNo.matches("[0-9]{6}")) {
            System.out.println("Entrez le prenom d'etudiant");
            String prenom = input.next();
            System.out.println("Entrez le nom d'etudiant");
            String nom = input.next();
            System.out.println("Entrez l'age d'etudiant");
            int age = input.nextInt();
            int noEcole = (int) (Math.random() * 300);
            int classe = 9;
            boolean choix1 = true;
            do {
                switch (age) {
                    case 15:
                        classe = 9;
                        choix1 = false;
                        break;
                    case 16:
                        classe = 10;
                        choix1 = false;
                        break;
                    case 17:
                        classe = 11;
                        choix1 = false;
                        break;

                    case 18:
                        classe = 12;
                        choix1 = false;
                        break;
                    default:
                        System.out.println("L'age que vous avez entre n'est pas eligible pour l'inscription au lycee.Reessayer");
                        age = input.nextInt();
                }
            } while (choix1);
            EtudiantPojo obj = new EtudiantPojo(identiteNo, prenom, nom, age, noEcole, classe);
            listEtudiant.put(identiteNo, obj);
            System.out.println("Les information sur l'etudiant ont ete enregistrees avec succes\n appuyez sur " +
                    "1 pour ajoutez un nouvel etudiant\nappuyez sur 2 pour revenir la page d'etudiant\n" +
                    "appuyez sur n'importe quel numero pour revenir la page d'accueil");
            String ss = input.next();
            if (ss.equals("1")) {
                ajouter();

            } else if (ss.equals("2")) {
                laPageEtudiant();

            } else {
                PageDaccueilEcole.laPageAccueil();
            }


        }
    }

    public static void accederAuxInformationEtudiant() {

        System.out.println("entrez le numero d'identite d'etuduiant ");
        String rechercheLidentite = input.next();
        if (noIdentiteSet1.contains(rechercheLidentite)) {
            EtudiantPojo etudiant = listEtudiant.get(rechercheLidentite);
            System.out.println(etudiant);
            System.out.println("assuyez sur 1 pour continuer a rechercher\n" +
                    "assuyez sur 2 pour revenir a la page d'etudiant\n " +
                    "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
            String s = input.next();
            if (s.equals("1")) {
                accederAuxInformationEtudiant();
            } else if (s.equals("2")) {
                laPageEtudiant();
            } else {
                PageDaccueilEcole.laPageAccueil();
            }


        } else {
            System.out.println("Vous avez entre un mauvais numero d'identite");
            System.out.println("assuyez sur 1 pour continuer a rechercher\n" +
                    "assuyez sur 2 pour revenir a la page d'etudiant\n " +
                    "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
            String s = input.next();
            if (s.equals("1")) {
                accederAuxInformationEtudiant();
            } else if (s.equals("2")) {
                laPageEtudiant();
            } else {
                PageDaccueilEcole.laPageAccueil();
            }
        }

    }

    public static void listezLesEtudiant() {
        System.out.println("...........................LE LIST D'ETUDIANT................................");
        for (Map.Entry<String, EtudiantPojo> w : entries) {
            System.out.println(w);

        }
        System.out.println(
                "assuyez sur 1 pour revenir a la page d'etudiant\n " +
                        "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
        String s = input.next();
        if (s.equals("1")) {
            laPageEtudiant();


        } else {
            PageDaccueilEcole.laPageAccueil();
        }
    }

    public static void desenregistre() {
        System.out.println("entrez le numero d'identite d'etuduiant que vous voulez supprimer ");
        String numeroAsuprime = input.next();
        if (noIdentiteSet1.contains(numeroAsuprime)) {
            System.out.println("Les informations sur l,etudiant que vous souhaitez supprimer");
            System.out.println(listEtudiant.get(numeroAsuprime));
            listEtudiant.remove(numeroAsuprime);
            System.out.println("les informations supprimees");
            System.out.println("assuyez sur 1 pour continuer a supprimer\n" +
                    "assuyez sur 2 pour revenir a la page d'etudiant\n " +
                    "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
            String s = input.next();
            if (s.equals("1")) {
                desenregistre();
            } else if (s.equals("2")) {
                laPageEtudiant();
            } else {
                PageDaccueilEcole.laPageAccueil();
            }
        } else {
            System.out.println("Vous avez entre un mauvais numero d'identite");
            System.out.println("assuyez sur 1 pour continuer a supprimer\n" +
                    "assuyez sur 2 pour revenir a la page d'etudiant\n " +
                    "assuyez sur n'importe quel numero pour revenir a la page d'accueil");
            String s = input.next();
            if (s.equals("1")) {
                desenregistre();
            } else if (s.equals("2")) {
                laPageEtudiant();
            } else {
                PageDaccueilEcole.laPageAccueil();
            }
        }

    }

}

