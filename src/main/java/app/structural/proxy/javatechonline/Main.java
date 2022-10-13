package app.structural.proxy.javatechonline;

import app.structural.proxy.javatechonline.proxy.FolderProxy;
import app.structural.proxy.javatechonline.service.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("dev", "dev");
        FolderProxy folderProxy = new FolderProxy(user);
        System.out.println("When username and password are correct: ");
        folderProxy.performOperations();
        System.out.println("---------------------------------------------");

        //If we give wrong username and password
        User userWrong = new User("abc", "abc");
        FolderProxy folderProxyWrong = new FolderProxy(userWrong);
        System.out.println("When username and password are incorrect: ");
        folderProxyWrong.performOperations();
    }
}
