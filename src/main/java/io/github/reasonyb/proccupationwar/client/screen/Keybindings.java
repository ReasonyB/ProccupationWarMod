package io.github.reasonyb.proccupationwar.client.screen;

import org.lwjgl.glfw.GLFW;

import com.mojang.blaze3d.platform.InputConstants;

import io.github.reasonyb.proccupationwar.ProccupationWar;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.jarjar.nio.util.Lazy;

public class Keybindings{
  private static final String CATEGORY ="key.categories."+ProccupationWar.MODID;

  public static final Lazy<KeyMapping> TEAM_SETTER_MAPPING = Lazy.of(() -> 
    new KeyMapping(
      "key."+ProccupationWar.MODID+".team_setter_key", 
      KeyConflictContext.IN_GAME, 
      InputConstants.Type.KEYSYM, 
      GLFW.GLFW_KEY_G, CATEGORY
    ));
}