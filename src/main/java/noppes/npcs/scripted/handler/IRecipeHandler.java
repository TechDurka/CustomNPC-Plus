//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package noppes.npcs.scripted.handler;

import java.util.List;
import net.minecraft.item.ItemStack;
import noppes.npcs.scripted.handler.data.IRecipe;

public interface IRecipeHandler {
    List<IRecipe> getGlobalList();

    List<IRecipe> getCarpentryList();

    IRecipe addRecipe(String var1, boolean var2, ItemStack var3, Object... var4);

    IRecipe addRecipe(String var1, boolean var2, ItemStack var3, int var4, int var5, ItemStack... var6);

    IRecipe delete(int var1);
}
