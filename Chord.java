import java.util.ArrayList;
public class Chord {
    private ArrayList<Note> chord = new ArrayList<>();
    // default constructor
    public Chord() {
    }

    // accessor to get chord
    public ArrayList<Note> getChord() { 
        return chord;
    }

    // method to add a note into chord
    public void addNote(Note note) {
        chord.add(note);
    } 

}