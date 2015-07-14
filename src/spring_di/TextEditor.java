package spring_di;

public class TextEditor {
private SpellChecker spellChecker;

public SpellChecker getSpellChecker() {
	return spellChecker;
}
//used for dependency inject
public void setSpellChecker(SpellChecker splellChecker) {
	System.out.println(" In TextEditor setting SpellChecker ");
	this.spellChecker = splellChecker;
}
public void spellCheck(){
	spellChecker.checkSpelling();
}
}
