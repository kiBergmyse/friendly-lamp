package move.physical;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70.0, 1.0);
    }

    private boolean fa = false;

    @Override protected void applySelfEffects(Pokemon p){
        if (p.getCondition() == Status.BURN | p.getCondition() == p.getCondition().PARALYZE | p.getCondition() == Status.POISON){
            fa = true;
            this.power *= 2;
        }
    }

    @Override protected String describe(){
        if (fa){
            return "использует Facade, противник находится под подходящцим негативным эффектом, Facade наносит удвоенный урон";
        }
        return "использует Facade";
    }
}
