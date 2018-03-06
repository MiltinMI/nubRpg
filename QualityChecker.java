//Perhaps the lulliest class in project so far.
public class QualityChecker {
    String[] gateKeep = getGateQ();
    String[] priGuar = getPriQ();
    String[] peas = getPeasQ();
    String[] expl = getExplQ();
    String[] magi = getMagiQ();
    String[] wiz = getWizQ();
    String[] highWay = getHighQ();
    String[] brig = getBrigQ();
    String[] exo = getExoQ();
    String[] sootSay = getSootQ();

    public QualityChecker(){

    }
    
    public int getClassFromQuality(String quality) {
        int classChoice = 0;
        if (classContains(gateKeep, quality)) {
            classChoice = 1;
        }
        else if (classContains(priGuar, quality)) {
                classChoice = 2;
            }
        else if (classContains(peas, quality)) {
                classChoice = 3;
            }
        else if (classContains(expl, quality)) {
                classChoice = 4;
            }
        else if (classContains(magi, quality)) {
                classChoice = 5;
            }
        else if (classContains(wiz, quality)) {
                classChoice = 6;
            }
        else if (classContains(highWay, quality)) {
                classChoice = 7;
            }
        else if (classContains(brig, quality)) {
                classChoice = 8;
            }
        else if (classContains(exo, quality)) {
                classChoice = 9;
            }
        else if (classContains(sootSay, quality)) {
                classChoice = 10;
            }
        else {
            classChoice = 0;
        }
        
        return classChoice;
    }


    public boolean classContains(String[] classQual, String qual) {
    for(int i = 0; i < classQual.length; i++) {
        if(classQual[i].equals(qual)) {
            return true;
        }
    }
    return false;
}
    private String[] getGateQ() {
        return new String[] {"stud", "honorable", "entitled", "reliable", "narcisistic", "heavy", "strong", "tanky", "ripped"};
    }

    private String[] getPriQ() {
        return new String[] {"sadistic", "ruly", "patient", "mundane", "routine"};
    }
    
    private String[] getPeasQ() {
        return new String[] {"hard working", "working", "tough", "simple", "traditional", "straight"};
    }
    
    private String[] getExplQ() {
        return new String[] {"free", "unencumbered", "curious", "exploring", "unbound"};
    }
    
    private String[] getMagiQ() {
        return new String[] {"eh"};
    }
    
    private String[] getWizQ() {
        return new String[] {"eh"};
    }
    
    private String[] getHighQ() {
        return new String[] {"eh"};
    }
    
    private String[] getBrigQ() {
        return new String[] {"eh"};
    }
    
    private String[] getExoQ() {
        return new String[] {"eh"};
    }
    
    private String[] getSootQ() {
        return new String[] {"eh"};
    }
    
}

