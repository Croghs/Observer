
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import java.util.*;

public class ObserverListe{

    List<String> list = new ArrayList<>();
    ObservableList<String> obsList = FXCollections.observableList(list);

    public static void main (String[]args){
        ObserverListe o = new ObserverListe();
    }

    public ObserverListe(){
        obsList.addListener(new ListChangeListener<>() {
            @Override
            public void onChanged(Change change){
                while(change.next()){
                    if(change.wasReplaced()) {
                        System.out.print("Es wurde etwas geändert: " + change.getRemoved().get(0) + " zu " + change.getAddedSubList().get(0)+". ");
                    } else if(change.wasAdded()){
                        System.out.print("Es wurde etwas hinzugefügt: "+ change.getAddedSubList().get(0)+". ");
                    } else if(change.wasRemoved()){
                        System.out.print("Es wurde etwas entfernt: "+ change.getRemoved().get(0)+". ");
                    }
                }
                System.out.println("Die neue Listenlänge beträgt "+ obsList.size() + ". ");
            }
        });
        obsList.add("E3");
        obsList.add("E4");
        obsList.add("E2");
        obsList.add("E1");
        obsList.add("E35");
        obsList.remove("E3");
        obsList.add("Element 2");
        obsList.set(0, "Eneu");
    }


    public ObserverListe(int a){
        obsList.addListener(new ListChangeListener<>() {
            @Override
            public void onChanged(Change change){
                while(change.next()){
                    if(change.wasReplaced()) {
                        System.out.print("Es wurde etwas geändert: " + change.getRemoved().get(0) + " zu " + change.getAddedSubList().get(0)+". ");
                    } else if(change.wasAdded()){
                        System.out.print("Es wurde etwas hinzugefügt: "+ change.getAddedSubList().get(0)+". ");
                    } else if(change.wasRemoved()){
                        System.out.print("Es wurde etwas entfernt: "+ change.getRemoved().get(0)+". ");
                    }
                }
                System.out.println("Die neue Listenlänge beträgt "+ obsList.size() + ". ");
            }
        });
    }


}
//Strg T update
//Strg Shift K hochladen
//Strg K committen

