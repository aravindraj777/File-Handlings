package textFiles;

import java.io.File;

public class FolderActions {

    public static void main(String[] args) {
        String folderPath = "D:\\bidding-system\\myfiles";
        String newFolderPath = "D:\\bidding-system\\myfiles1";
        createFolder(folderPath);
        System.out.println(isFolderExists(folderPath));
        renameFolder(folderPath,newFolderPath);
    }

    private static void createFolder(String folderPath){

        File folder = new File(folderPath);
        if (!folder.exists()){
            folder.mkdir();
            System.out.println("Folder created "+ folderPath);
        }
    }

    private static boolean isFolderExists(String folderPath){
        File folder = new File(folderPath);
        return folder.exists();
    }

    private static void renameFolder(String oldPath, String newPath){
        File oldFolder = new File(oldPath);
        File newFolder = new File(newPath);
        if (oldFolder.exists()){
            oldFolder.renameTo(newFolder);
            System.out.println("Folder Renamed to "+ newPath);
        }
    }
}
