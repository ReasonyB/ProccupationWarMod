package io.github.reasonyb.proccupationwar.block;

import io.github.reasonyb.proccupationwar.ProccupationWar;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RandomTeamBlocks {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ProccupationWar.MODID);

  public static final RegistryObject<Block> RANDOM_COTTON = BLOCKS.register("random_cotton", () -> new RandomCottonBlock(BlockBehaviour.Properties.of()));
}
