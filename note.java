enum MusicNote {
  C, Dflat, D, Eflat, E, F, Gflat, G, Aflat, A, Bflat, B;
}

public class Note() {
  private int octave;
  MusicNote x;

  // default constructor to initialize to middle C
  public Note() {
    x = MusicNote.C;
    octave = 4;
  }

  // constructor to initialize variables
  public Note(MusicNote x, int octave) { 
    this.x = x;
    this.octave = octave;
  }

  // accessor method to get octave
  public int getOctave() {
    return octave;
  }

  // accessor method to get note name
  public MusicNote getNote() {
    return x;
  }

  // method to play a note at specified octave, otherwise rest
  public void play(int octave) {
    switch (x) {
      case C:
        // play note at octave
        break;
      
      default:
        // rest
        break;
    }
  }
  
}
