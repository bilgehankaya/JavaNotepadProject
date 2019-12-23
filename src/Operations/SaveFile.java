package Operations;
import java.awt.FileDialog;
import main.*;

public class SaveFile implements OperationStrategy{
    Notepad notepad;
    public SaveFile(Notepad notepad){
        this.notepad = notepad;
    }
    
    @Override
    public void makeOperation(){
        String fileName;
        FileDialog fd = new FileDialog(notepad, "Save File", FileDialog.SAVE);
        fd.setVisible(true);
        if(fd.getFile() != null){
                fileName = fd.getDirectory() + fd.getFile();
                
            
        }
        
    }
    
    
}
