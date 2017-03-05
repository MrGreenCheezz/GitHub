package pegasuscraft.ptm;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class VeryStrangeOre extends Block {

	protected VeryStrangeOre(Material material) {
		super(material);
		this.setResistance(20.0F);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeStone);
	}
	@Override
 public Item getItemDropped(int metadata, Random rand,int fortune){
		return TechnoMod.verystrangeshard;
	}
}
