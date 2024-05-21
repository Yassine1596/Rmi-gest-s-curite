package Rmigestionnairesecuriteetchargementdynamique.DynamicServerClient;



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Reverse extends UnicastRemoteObject implements AppInterface {
    public Reverse() throws RemoteException {
        // Constructeur par défaut
    }

    @Override
    public String Reverse(String chaineOrigine) throws RemoteException {
        int longueur = chaineOrigine.length();
        StringBuilder temp = new StringBuilder(longueur);
        for (int i = longueur; i > 0; i--) {
            temp.append(chaineOrigine.substring(i - 1, i));
        }
        return temp.toString();
    }
}
