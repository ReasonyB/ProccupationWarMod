package io.github.reasonyb.proccupationwar.block;

import io.github.reasonyb.proccupationwar.util.DyeColorProperty;
import io.github.reasonyb.proccupationwar.util.PBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.scores.Team;

public class RandomCottonBlock extends Block {
  public static final DyeColorProperty COLOR = PBlockStateProperties.COLOR;
  
  // private static final BooleanProperty PICK = PBlockStateProperties.PICK;

  public RandomCottonBlock(Properties p_49795_) {
    super(p_49795_);
    this.registerDefaultState(this.stateDefinition.any().setValue(COLOR, DyeColor.BLACK));
    // this.registerDefaultState(this.stateDefinition.any().setValue(PICK, false));
  }
  
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) 
  {
    builder.add(COLOR);
    //builder.add(PICK);
  }

  public void stepOn(Level level,BlockPos pos, BlockState blockstate, Entity entity){
    if(entity instanceof Player){
      Team team = entity.getTeam();
      if(team == null){
        round(level, blockstate, pos);
        level.scheduleTick(pos, this, 48);
      }
      else if(team != null){
      }
    }
    super.stepOn(level, pos, blockstate, entity);
  }

  private void round(Level level, BlockState blockstate, BlockPos pos){
    level.setBlock(pos, blockstate.cycle(COLOR), 1);
  }

  public void tick(BlockState p_220903_, ServerLevel p_220904_, BlockPos p_220905_, RandomSource p_220906_){
    if(p_220903_.getValue(COLOR)== DyeColor.BLACK){
      // TODO: 팀 색깔 픽하는 함수 혹은 클래스 추가
      DyeColor color = pick(p_220904_, p_220903_, p_220905_);
      switch (color) {
        case WHITE:
          p_220904_.setBlock(p_220905_, Blocks.WHITE_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case ORANGE:
          p_220904_.setBlock(p_220905_, Blocks.ORANGE_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case MAGENTA:
          p_220904_.setBlock(p_220905_, Blocks.MAGENTA_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case LIGHT_BLUE:
          p_220904_.setBlock(p_220905_, Blocks.LIGHT_BLUE_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case YELLOW:
          p_220904_.setBlock(p_220905_, Blocks.YELLOW_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case LIME:
          p_220904_.setBlock(p_220905_, Blocks.LIME_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case PINK:
          p_220904_.setBlock(p_220905_, Blocks.PINK_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case GRAY:
          p_220904_.setBlock(p_220905_, Blocks.GRAY_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case LIGHT_GRAY:
          p_220904_.setBlock(p_220905_, Blocks.LIGHT_GRAY_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case CYAN:
          p_220904_.setBlock(p_220905_, Blocks.CYAN_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case PURPLE:
          p_220904_.setBlock(p_220905_, Blocks.PURPLE_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case BLUE:
          p_220904_.setBlock(p_220905_, Blocks.BLUE_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case BROWN:
          p_220904_.setBlock(p_220905_, Blocks.BROWN_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case GREEN:
          p_220904_.setBlock(p_220905_, Blocks.GREEN_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case RED:
          p_220904_.setBlock(p_220905_, Blocks.RED_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        case BLACK:
          p_220904_.setBlock(p_220905_, Blocks.BLACK_WOOL.defaultBlockState(), UPDATE_ALL);
          break;
        default:
          break;
      }
    }
  }

  private DyeColor pick(ServerLevel level, BlockState bstate, BlockPos bpos){
    return DyeColor.WHITE;
  }
  //setBlock(blockstate, cycle, N);
  //대기열로 넣고, 랜덤으로 돌리는 것
  
  //레드스톤 신호 받았을 때, 대기열에 블럭 등록
  //2초 대기후 대기열 순환
  //색깔 랜덤 메소드
  //색깔 결정 후 신호기 이벤트
  //색깔 대기열에서 선택된 색깔 빼기

}
