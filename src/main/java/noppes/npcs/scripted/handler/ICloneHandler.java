//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package noppes.npcs.scripted.handler;

import noppes.npcs.scripted.IWorld;
import noppes.npcs.scripted.entity.IEntity;

public interface ICloneHandler {
    IEntity spawn(double var1, double var3, double var5, int var7, String var8, IWorld var9);

    IEntity get(int var1, String var2, IWorld var3);

    void set(int var1, String var2, IEntity var3);

    void remove(int var1, String var2);
}
