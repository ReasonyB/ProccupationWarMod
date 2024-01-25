package io.github.reasonyb.proccupationwar.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class DyeColorProperty extends EnumProperty<DyeColor> {

  protected DyeColorProperty(String p_61579_, Collection<DyeColor> p_61581_) {
    super(p_61579_, DyeColor.class, p_61581_);
  }
  
  public static DyeColorProperty create(String name){
    return create(name, (predic) ->{
      return true;
    });
  }

  public static DyeColorProperty create(String name, Predicate<DyeColor> predic){
    return create(name, Arrays.stream(DyeColor.values()).filter(predic).collect(Collectors.toList()));
  }

  public static DyeColorProperty create(String name, DyeColor... colors){
    return create(name, Lists.newArrayList(colors));
  }

  public static DyeColorProperty create(String name, Collection<DyeColor> colors){
    return new DyeColorProperty(name, colors);
  }
}
