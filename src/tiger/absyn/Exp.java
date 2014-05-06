package tiger.absyn;

import tiger.types.Type;

abstract public class Exp extends Absyn {
    public Type type;

    @Override
    abstract public void accept(Visitor v);
    
}
