public class Change {
 
    private char fromCharacter;
    private char toCharacter;
 
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
 
    public String change(String characterString) {
        String changed = "";
        for (int i = 0; i < characterString.length(); i++) {
            if (characterString.charAt(i) != this.fromCharacter) {
                changed += characterString.charAt(i);
            } else {
                changed += this.toCharacter;
            }
        }
        return changed;
    }
}