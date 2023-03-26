package net.exited.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.exited.tutorialmod.data.ModLootTableGenerator;
import net.exited.tutorialmod.data.ModModelProvider;
import net.exited.tutorialmod.data.ModRecipeGenerator;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
	}
}
