package spring_di;

public class TextEditor2 {
private SpellChecker spellChecker;

public TextEditor2(SpellChecker spellChecker) {
	
	this.spellChecker = spellChecker;
}

public SpellChecker getSpellChecker() {
	return spellChecker;
}

public void setSpellChecker(SpellChecker spellChecker) {
	this.spellChecker = spellChecker;
}

public void spellCheck() {
	System.out.println(" In TextEditor --spellCheck");
	spellChecker.checkSpelling();
	
}



}
