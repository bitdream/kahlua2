package se.krka.kahlua.j2se;

import se.krka.kahlua.vm.KahluaTable;
import se.krka.kahlua.vm.LuaState;
import se.krka.kahlua.vm.Platform;

public class J2SEPlatform implements Platform {
    @Override
    public void register(LuaState state) {
        MathLib.register(state, this);
    }

    @Override
    public double pow(double x, double y) {
        return Math.pow(x, y);
    }

    @Override
    public KahluaTable newTable() {
        return new ConcurrentKahluaTable();
    }
}