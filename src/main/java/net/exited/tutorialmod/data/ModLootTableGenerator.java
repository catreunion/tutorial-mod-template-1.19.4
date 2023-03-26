package net.exited.tutorialmod.data;

import net.exited.tutorialmod.block.ModBlocks;
import net.exited.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
  public ModLootTableGenerator(FabricDataOutput dataOutput) {
    super(dataOutput);
  }

  @Override
  public void generate() {
    addDrop(ModBlocks.CITRINE_BLOCK);
    addDrop(ModBlocks.CITRINE_ORE, oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAW_CITRINE));
    addDrop(ModBlocks.DEEPSLATE_CITRINE_ORE, oreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE, ModItems.RAW_CITRINE));
  }
}
