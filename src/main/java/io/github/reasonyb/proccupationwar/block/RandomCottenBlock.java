package io.github.reasonyb.proccupationwar.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class RandomCottenBlock extends Block {

  public RandomCottenBlock(Properties p_49795_) {
    super(p_49795_);
  }
  
  public void stepOn(Level level,BlockPos pos, BlockState blockstate, Entity entity){
    if(entity instanceof Player/* && 플레이어가 팀을 가지고 있지 않을 시*/){
      entity.hurt(level.damageSources().hotFloor(),1.0F);
      //색깔 랜덤 메소드
      //색깔 결정 후 색깔 폭죽 이벤트
    }
    super.stepOn(level, pos, blockstate, entity);
  }
  //setBlock(blockstate, cycle, N);
  //일단 BlockState json에 값별로 텍스쳐 세팅
  //대기열로 넣고, 랜덤으로 돌리는 것
  //값이 결정되면, 블럭을 양털로 대체
  //위의 사항이 해결되면 stepOn 이벤트로 넣기
  
  //레드스톤 신호 받았을 때, 대기열에 블럭 등록
  //2초 대기후 대기열 순환
  //색깔 랜덤 메소드
  //색깔 결정 후 신호기 이벤트
  //색깔 대기열에서 선택된 색깔 빼기

}
