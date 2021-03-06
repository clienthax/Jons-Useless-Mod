package xjon.jum.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xjon.jum.entity.mob.EntityUselessDave;


public class BiomeUseless extends Biome {

	public BiomeUseless(Biome.BiomeProperties properties) {
		super(properties);
		this.topBlock = Blocks.GRASS.getDefaultState();
		this.fillerBlock = Blocks.STONE.getDefaultState();
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityUselessDave.class, 15, 3, 7));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float f) {
		return 0xC7FF85;
	}
	
	@Override
	public int getModdedBiomeGrassColor(int i)
	{
		return 0xd8fa9e;
	}
	
}
