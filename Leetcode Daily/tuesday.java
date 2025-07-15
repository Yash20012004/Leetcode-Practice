3136. Valid Word

   public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean containsVowel=false;
        boolean containsConsonant=false;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) return false;
            if(Character.isLetter(ch)){
                  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                  containsVowel=true;
                  else containsConsonant=true;
            }
        }
        return containsVowel&&containsConsonant;
    }
