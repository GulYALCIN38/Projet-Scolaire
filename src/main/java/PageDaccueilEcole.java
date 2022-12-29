import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PageDaccueilEcole {
    static Scanner input=new Scanner(System.in);

   // static Map<String,EtudiantPojo> listEtudiant=new HashMap<>();
     //static Set<Map.Entry<String,EtudiantPojo >> entries=listEtudiant.entrySet();
    //static Set <String>identiteNo=entries.keySet();

    public static void laPageAccueil(){
        System.out.println("---------------------#LA PAGE D'ACCUEIL-----------------------");
        System.out.println("1. La Page D'etudiant\n2.La Page D'enseignant\nQ. Exit\n" +
                "Selectionnez l'action que vous souhaitez effectuer.");
        String select=input.next().toUpperCase();
        boolean choix=true;
        do{
            switch (select){
                case"1":
                    Etudiant.laPageEtudiant();
                    choix=false;
                    break;
                case "2":
                    Enseignant.laPageEnseignant();
                    choix=false;
                    break;
                case"Q":
                    System.out.println("Merci d'avoir visite notre page d'ecole.");
                    choix=false;
                    break;
                default:
                    System.out.println("vous avez fait un mauvais choix. reessayez s'il vous plait");
                    select=input.next().toUpperCase();

            }

        }while(choix);
    }

}

