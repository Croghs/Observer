import javafx.beans.*;
import javafx.collections.*;

public class ObserverListe {

    public static void main (String[]args){
        ObserverListe observer = new ObserverListe();
    }

    public ObserverListe(){
        int[] a = new int[]{1,2,3,4};
        ObservableList observableList = FXCollections.observableArrayList(a);
    }
}
//Strg T update
//Strg K committen
// Strg Shift K hochladen