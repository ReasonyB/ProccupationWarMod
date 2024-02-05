package io.github.reasonyb.proccupationwar.item;

import io.github.reasonyb.proccupationwar.ProccupationWar;
import io.github.reasonyb.proccupationwar.block.RandomTeamBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RandomTeamItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,ProccupationWar.MODID);

  public static final RegistryObject<Item> RANDOM_COTTON_BLOCK_ITEM = ITEMS.register("random_cotton", ()-> new BlockItem(RandomTeamBlocks.RANDOM_COTTON.get(), new Item.Properties()));
}
