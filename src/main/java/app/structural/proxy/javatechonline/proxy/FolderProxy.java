package app.structural.proxy.javatechonline.proxy;

import app.structural.proxy.javatechonline.service.Folder;
import app.structural.proxy.javatechonline.service.IFolder;
import app.structural.proxy.javatechonline.service.User;

public class FolderProxy implements IFolder {

    private Folder folder;
    private User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    @Override
    public void performOperations() {
        if (user.getUsername().equalsIgnoreCase("dev") && user.getPassword().equalsIgnoreCase("dev")) {
            this.folder = new Folder();
            this.folder.performOperations();
        } else {
            System.out.println("You don't have access to this folder");
        }
    }

}
