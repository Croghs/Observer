
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import java.util.*;

public class ObserverListe{

    public static void main (String[]args){

        List<String> list = new ArrayList<>();
        ObservableList<String> obsList = FXCollections.observableList(list);
        obsList.add("A");
        obsList.add("B");
        obsList.add("C");

        obsList.addListener(new ListChangeListener<>() {
            @Override
            public void onChanged(ListChangeListener.Change change){
                System.out.println("Etwas hat sich verändert");
                while(change.next()){
                    System.out.println("Wurde etwas hinzgefügt? " + change.wasAdded());
                    System.out.println("Wurde etwas entfernt? " + change.wasRemoved());
                }
            }
        });

        //Änderungen an der Observable Liste werden gemeldet, wäre bei list.add nicht der Fall

        obsList.add("Element 1");
        obsList.remove("C");
        obsList.add("Element 2");

        // FXCollections.sort(obsList);


    }

    public ObserverListe(){
        int [] a = new int[]{1,2,3,4,5,6};
        ObservableList x = FXCollections.observableArrayList(a);
    }



}
//Strg T update
//Strg Shift K hochladen
//Strg K committen

