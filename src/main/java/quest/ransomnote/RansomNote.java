package quest.ransomnote;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "abba";
        String magazine = "aabb";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct( String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }

        int letters[] = new int[26];

        for(char magazineLetter : magazine.toCharArray()) {
            letters[magazineLetter-'a']++;
        }

        for(char ransomNoteLetter : ransomNote.toCharArray()) {
            if(letters[ransomNoteLetter-'a']==0) {
                return false;
            } else {
                letters[ransomNoteLetter-'a']--;
            }
        }
        return true;
    }
}