package Operations;
import main.*;


public class CloseFile implements OperationStrategy{
    Notepad notepad;
    public CloseFile(Notepad notepad){
        this.notepad = notepad;       
    }  
    @Override
    public void makeOperation(){
        notepad.dispose();
    }
    
}
