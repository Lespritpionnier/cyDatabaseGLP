package mainStructures.textExecutable.commands;

public class PredicateCondition {
    String who;
    String how;
    String what;

    public PredicateCondition(String Clause) {
        conditionTranslation(Clause);
    }

    private void conditionTranslation(String clause) {
        String who = null; String how = null; String what = null;

        //TODO Translate by (ComparatorS | BETWEEN | IN | LIKE)

        this.who = who; this.how = how; this.what = what;
    }
}
