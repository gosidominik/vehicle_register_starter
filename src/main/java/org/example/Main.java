package org.example;

import org.example.entity.Vehicle;
import org.example.repository.RepositoryAccess;


public class Main {
    public static void main(String[] args) {
        RepositoryAccess storage = new FileRepositoryAccess();
        VehiclePresenter presenter = new VehiclePresenter();
        VehicleController controller = new VehicleController();
        VehicleInteractor interactor = new VehicleInteractor(storage, presenter);
        controller.setVehicleRequestInterface(interactor);
        View view = new View(controller);
        view.start();
    }
}