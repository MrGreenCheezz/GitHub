package pegasuscraft.ptm;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;

		}

	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		generateOre(TechnoMod.strangeore,world,rand,x,z,3,6,10,2,200,Blocks.stone);
		generateOre(TechnoMod.tostrangeore,world,rand,x,z,2,4,10,2,100,Blocks.stone);
		generateOre(TechnoMod.verystrangeore,world,rand,x,z,1,2,10,2,100,Blocks.stone);
		generateOre(TechnoMod.wtfore,world,rand,x,z,1,2,2,2,100,Blocks.stone);
	}

	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize,
			int maxVienSize, int chance, int minY, int maxY, Block generateIn) {
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		for (int i = 0; i < chance; i++) {
			int xRand, yRand, zRand;
			xRand = chunkX * 16 + random.nextInt(16);
			yRand = random.nextInt(heightRange);
			zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		}
	}
}
