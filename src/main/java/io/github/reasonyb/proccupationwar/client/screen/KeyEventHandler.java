package io.github.reasonyb.proccupationwar.client.screen;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import io.github.reasonyb.proccupationwar.ProccupationWar;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ProccupationWar.MODID, bus = Bus.FORGE, value = Dist.CLIENT)
public class KeyEventHandler {
  private static final Logger LOGGER = LogUtils.getLogger();
  @SubscribeEvent
  public static void OpenTeamSetter(ClientTickEvent event){ //ClientTickEvent 항상 확인, forge bus에 등록
    if(event.phase == TickEvent.Phase.END){
      while(Keybindings.TEAM_SETTER_MAPPING.get().consumeClick()){
        LOGGER.info("pressed team setter!");
      }
    }
  }  
}
