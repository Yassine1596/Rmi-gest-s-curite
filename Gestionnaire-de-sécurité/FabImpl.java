package Rmigestionnairesecuriteetchargementdynamique.Gestionnaire de sécurité;




import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FabImpl extends UnicastRemoteObject implements FabInterface {
    public FabImpl() throws RemoteException {
        // Constructeur par défaut
    }

    @Override
    public AppInterface newReverse() throws RemoteException {
        return new Reverse();
    }
}

