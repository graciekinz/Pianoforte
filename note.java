enum MusicNote {
  C, Dflat, D, Eflat, E, F, Gflat, G, Aflat, A, Bflat, B;
}

public class Note() {
  private int octave;
  MusicNote x;

  // sets note by default to middle C
  public Note() {
    x = MusicNote.C;
    octave = 4;
  }
  
  public Note(MusicNote x, int octave) { 
    this.x = x;
    this.octave = octave;
  }

  // play a note at specified octave, otherwise rest
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
