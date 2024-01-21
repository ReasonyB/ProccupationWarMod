package io.github.reasonyb.proccupationwar;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(ProccupationWar.MODID)
public class ProccupationWar {
  public static final String MODID = "proccupationwar";
  public ProccupationWar(){
    ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.SPEC, "proccupation-client.toml");
  }
}
